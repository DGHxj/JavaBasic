package cn.tedu.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDPͨ�ŵĽ��ն�
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//1.�������ն�
		DatagramSocket ds = new DatagramSocket(44444);
		//2.�������ݰ�
		byte [] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		ds.receive(dp);
		//3.��ȡ���յ�����Ϣ
		String msg = new String(data,0,dp.getLength());
		System.out.println(msg);
		//4.�رս��ն�
		ds.close();
	}
}
