package cn.tedu.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * TCPͨ�ŵĿͻ���
 */
public class Demo01Client {
	public static void main(String[] args) throws Exception {
		//1.����Socket
		Socket socket = new Socket();
		//2.���ӷ�����
		socket.connect(new InetSocketAddress("127.0.0.1", 44444));
		//3.�ӿͻ��˷�����Ϣ�������
		OutputStream out = socket.getOutputStream();
		//4.�����˷�������
		String msg = "hello world~ ";
		out.write(msg.getBytes());
		out.flush();
		//5.�ӷ���˽�������
		InputStream in = socket.getInputStream();
		byte [] data = new byte[1024];
		int len = in.read(data);
		String msg2 = new String(data,0,len);
		System.out.println(msg2);
		//6.�ر��׽���
		socket.close();
	}
}
