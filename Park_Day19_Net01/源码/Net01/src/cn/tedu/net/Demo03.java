package cn.tedu.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * UDPͨ�ŷ��Ͷ�
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		//1.׼�����Ͷ�
		DatagramSocket ds = new DatagramSocket();
		//2.׼�����ݰ�
		String msg = "��ã�UDP~";
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length);
		dp.setSocketAddress(new InetSocketAddress("127.0.0.1", 44444));
		//3.��������
		ds.send(dp);
		//4.�ر��׽���
		ds.close();
	}
}
