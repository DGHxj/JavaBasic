package cn.tedu.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP案例：通过TCP实现文件上传 - 客户端代码
 */
public class Demo02UploadClient {
	public static void main(String[] args) {
		Scanner scanner = null;
		InputStream in = null;
		Socket socket = null;
		try {
			//1.要求用户输入文件路径
			scanner = new Scanner(System.in);
			System.out.println("--请输入要上传的文件的路径：");
			String path = scanner.nextLine();
			File file = new File(path);
			//2.只有文件存在 且 是一个文件才上传
			if(file.exists() && file.isFile()){
				//2.创建连接文件的输入流
				in = new FileInputStream(file);
				//3.创建TCP客户端对象
				socket = new Socket();
				//4.连接TCP服务端
				socket.connect(new InetSocketAddress("127.0.0.1",44444));
				//5.获取到TCP服务端的输出流
				OutputStream out = socket.getOutputStream();
				//6.1向服务器发送[文件名字节长度\r\n]
				out.write((file.getName().getBytes().length+"\r\n").getBytes());
				//6.2向服务器发送[文件名字节]
				out.write(file.getName().getBytes());
				//6.3向服务器发送[文件内容字节长度\r\n]
				out.write((file.length()+"\r\n").getBytes());
				//6.4向服务器发送[文件内容字节]
				byte [] data = new byte[1024];
				int i = 0;
				while((i = in.read(data))!=-1){
					out.write(data,0,i);
				}
			}else{
				throw new RuntimeException("文件不存在 或者是一个文件夹~~");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//7.关闭扫描器 关闭文件输入流 关闭套接字
			if(scanner != null){
				scanner.close();
			}
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					in = null;
				}
			}
			if(socket!=null){
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
