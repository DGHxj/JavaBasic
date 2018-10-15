package cn.tedu.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP案例：通过TCP实现文件上传 - 服务端代码
 */

public class Demo02UploadServer {
	public static void main(String[] args) throws Exception {
		//1.创建服务端
		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress(44444));
		System.out.println("###千度网盘开始运行了###");
		//2.不停接受客户端连接，一旦连接成功，交给线程处理
		while(true){
			Socket socket = ss.accept();
			new Thread(new UploadRunnable(socket)).start();
		}
	}
}

class UploadRunnable implements Runnable{
	private Socket socket = null;
	public UploadRunnable(Socket socket) {
		this.socket  = socket;
	}
	
	/**
	 * 通过私有协议传输数据 协议的格式为 [文件名长度\r\n文件名 文件长度\r\n文件内容]
	 */
	@Override
	public void run() {
		OutputStream out = null;
		try {
			//1.获取socket输入流
			InputStream in = socket.getInputStream();
			//2.获取文件名 - 读到第一个回车换行之前 截取出文件名的长度 接着读取这个长度的字节 就是文件名
			//--读取数据 直到遇到第一个回车换行
			//----每次从流中读取一个字节 转成字符串 拼到line上 只要line还不是\r\n结尾 就重复这个过程
			String line = "";
			byte [] tmp = new byte[1];
			while(!line.endsWith("\r\n")){
				in.read(tmp);
				line += new String(tmp);
			}
			//----读取到了 文件名长度\r\n 截掉\r\n 转成int 就是文件名的长度
			int len = Integer.parseInt(line.substring(0, line.length()-2));
			//----从流中接着读 len个字节 就是文件名
			byte [] data = new byte[len];
			in.read(data);
			String fname = new String(data);
			
			//3.读取文件内容  - 读到下一个回车换行之前 截取出文件内容的长度 接着读取这个长度的字节 就是文件内容
			String line2 = "";
			byte [] tmp2 = new byte[1];
			while(!line2.endsWith("\r\n")){
				in.read(tmp2);
				line2 += new String(tmp2);
			}
			//----读取到了 文件长度\r\n 截掉\r\n 转成int 就是文件的长度
			int len2 = Integer.parseInt(line2.substring(0, line2.length()-2));
			//4.从流中读取 文件长度个字节 就是文件内容 输出到文件中
			byte data2 [] = new byte[len2];
			in.read(data2);
			
			//5.创建文件输出流指向输出位置,将数据写出到流中
			String path = "upload/"+fname;
			out = new FileOutputStream(path);
			out.write(data2);
			System.out.println("接收到了来自["+socket.getInetAddress().getHostAddress()+"]的上传文件["+path+"]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//6.关闭资源
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					out = null;
				}
			}
			if(socket != null){
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					socket = null;
				}
			}
		}
	}
}
