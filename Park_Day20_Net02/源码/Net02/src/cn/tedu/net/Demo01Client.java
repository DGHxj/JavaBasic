package cn.tedu.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * TCP通信的客户端
 */
public class Demo01Client {
	public static void main(String[] args) throws Exception {
		//1.创建Socket
		Socket socket = new Socket();
		//2.连接服务器
		socket.connect(new InetSocketAddress("127.0.0.1", 44444));
		//3.从客户端发送消息给服务端
		OutputStream out = socket.getOutputStream();
		//4.向服务端发送数据
		String msg = "hello world~ ";
		out.write(msg.getBytes());
		out.flush();
		//5.从服务端接受数据
		InputStream in = socket.getInputStream();
		byte [] data = new byte[1024];
		int len = in.read(data);
		String msg2 = new String(data,0,len);
		System.out.println(msg2);
		//6.关闭套接字
		socket.close();
	}
}
