package cn.tedu.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCPͨ�ŵķ����
 */
public class Demo01Server {
	public static void main(String[] args) throws Exception {
		//1.���������
		ServerSocket ss = new ServerSocket();
		//2.��ָ���˿�
		ss.bind(new InetSocketAddress(44444));
		//3.�ȴ��ͻ�������
		Socket socket = ss.accept();
		//4.���ܿͻ��˵�����
		InputStream in = socket.getInputStream();
		byte [] data = new byte[1024];
		int len = in.read(data);
		String str = new String(data,0,len);
		System.out.println(str);
		//5.��ͻ��˷�������
		String msg = "hello net~";
		OutputStream out = socket.getOutputStream();
		out.write(msg.getBytes());
		out.flush();
		//6.�ر��׽���
		socket.close();
		ss.close();
	}
}
