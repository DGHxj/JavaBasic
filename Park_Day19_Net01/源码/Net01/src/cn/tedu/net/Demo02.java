package cn.tedu.net;

import java.net.InetSocketAddress;

/**
 * 在socket编程中代表地址的类 SocketAddress - InetSocketAddress
 */
public class Demo02 {
	public static void main(String[] args) {
		InetSocketAddress addr = new InetSocketAddress("127.0.0.1", 44444);
		System.out.println(addr.getHostName());
		System.out.println(addr.getAddress());
		System.out.println(addr.getPort());
	}
}
