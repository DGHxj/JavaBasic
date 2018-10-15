package cn.tedu.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP通信的接收端
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//1.创建接收端
		DatagramSocket ds = new DatagramSocket(44444);
		//2.接受数据包
		byte [] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		ds.receive(dp);
		//3.获取接收到的信息
		String msg = new String(data,0,dp.getLength());
		System.out.println(msg);
		//4.关闭接收端
		ds.close();
	}
}
