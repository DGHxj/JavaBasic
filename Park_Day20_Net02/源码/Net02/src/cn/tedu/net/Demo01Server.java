package cn.tedu.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信的服务端
 */
public class Demo01Server {
	public static void main(String[] args) throws Exception {
		//1.创建服务端
		ServerSocket ss = new ServerSocket();
		//2.绑定指定端口
		ss.bind(new InetSocketAddress(44444));
		//3.等待客户端连接
		Socket socket = ss.accept();
		//4.接受客户端的数据
		InputStream in = socket.getInputStream();
		byte [] data = new byte[1024];
		int len = in.read(data);
		String str = new String(data,0,len);
		System.out.println(str);
		//5.向客户端返回数据
		String msg = "hello net~";
		OutputStream out = socket.getOutputStream();
		out.write(msg.getBytes());
		out.flush();
		//6.关闭套接字
		socket.close();
		ss.close();
	}
}
