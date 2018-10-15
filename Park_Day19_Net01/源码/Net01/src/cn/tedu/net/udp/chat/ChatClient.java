package cn.tedu.net.udp.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) {
		new Thread(new Sender()).start();
		new Thread(new Receiver()).start();
	}
}

/**
 * 聊天消息接受者
 */
class Receiver implements Runnable{
	@Override
	public void run() {
		DatagramSocket ds = null;
		try {
			//1.创建接收端
			ds = new DatagramSocket(44444);
			while(true){
				//2.接受数据包
				byte [] data = new byte[1024];
				DatagramPacket dp = new DatagramPacket(data, data.length);
				ds.receive(dp);
				//3.获取接收到的信息
				String msg = new String(data,0,dp.getLength());
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				System.err.println("==收到来自["+ip+":"+port+"]的消息，消息内容为：“"+msg+"”========");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			//4.关闭接收端
			if(ds != null){
				ds.close();
			}
		}
	}
}

/**
 * 聊天消息发送者
 */
class Sender implements Runnable{
	@Override
	public void run() {
		Scanner scan = null;
		DatagramSocket ds = null;
		try {
			//1.创建发送端
			ds = new DatagramSocket();
			//2.创建控制台扫描器
			scan = new Scanner(System.in);
			while(true){
				//3.读取控制台 消息格式 [ip#端口#消息]
				System.out.println("===请输入要发送的消息，格式为[ip#端口#消息]：=================");
				String line = scan.nextLine();
				String attrs [] = line.split("#");
				String ip = attrs[0];
				int port = Integer.parseInt(attrs[1]);
				String msg = attrs[2];
				//4.发送数据
				DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length);
				dp.setSocketAddress(new InetSocketAddress(ip, port));
				ds.send(dp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			if(ds!=null){
				ds.close();
			}
			if(scan!=null){
				scan.close();
			}
		}
	}
}