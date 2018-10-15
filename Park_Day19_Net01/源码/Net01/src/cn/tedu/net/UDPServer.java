package cn.tedu.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ·þÎñ¶Ë
 * @author DGHxj
 *
 */
public class UDPServer {
	public static void main(String[] args) throws Exception{
		DatagramSocket ds=new DatagramSocket(9000);
		byte[] bs=new byte[128];
		DatagramPacket packet=new DatagramPacket(bs, bs.length);
		ds.receive(packet);
//		String msg = new String(bs,0,packet.getLength());
//		System.out.println(msg);
		for(int i=0;i<30;i++){
			bs="Hello From Server".getBytes();
			DatagramPacket newPacket=new DatagramPacket(bs, 0,bs.length, packet.getAddress(), packet.getPort());
			ds.send(newPacket);
		}
		ds.close();
	}
}
