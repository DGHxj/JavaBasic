package cn.tedu.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * UDP通信发送端
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		//1.准备发送端
		DatagramSocket ds = new DatagramSocket();
		//2.准备数据包
		String msg = "你好，UDP~";
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length);
		dp.setSocketAddress(new InetSocketAddress("127.0.0.1", 44444));
		//3.发送数据
		ds.send(dp);
		//4.关闭套接字
		ds.close();
	}
}
