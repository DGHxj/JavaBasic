package cn.tedu.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * ¿Í»§¶Ë
 * @author DGHxj
 *
 */
public class UDPClient {
	public static void main(String[] args) throws Exception{
		DatagramSocket ds=new DatagramSocket();
		byte[] data="Hello".getBytes();
		DatagramPacket packet=new DatagramPacket(data, 0, data.length, new InetSocketAddress("127.0.0.1", 9000));
		ds.send(packet);
		data=new byte[128];
		for(int i=0;i<30;i++){
			DatagramPacket dp=new DatagramPacket(data, data.length, packet.getSocketAddress());
			ds.receive(dp);
			String str=new String(dp.getData(),dp.getOffset(),dp.getLength());
			System.out.println(str);
		}
		ds.close();
	}
}
