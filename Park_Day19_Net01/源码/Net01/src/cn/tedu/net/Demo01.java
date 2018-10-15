package cn.tedu.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 代表IP地址的类 InetAddress
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//--获取本机
//		//1.获取InetAddress
//		InetAddress addr = InetAddress.getLocalHost();
//		//2.获取信息
//		System.out.println(addr.getHostName());
//		System.out.println(addr.getHostAddress());
		
		//--获取其他机器
		//1.获取InetAddress
		InetAddress addr = InetAddress.getByName("SHEHUIZHAO");
		//2.获取信息
		System.out.println(addr.getHostName());
		System.out.println(addr.getHostAddress());
	}
}
