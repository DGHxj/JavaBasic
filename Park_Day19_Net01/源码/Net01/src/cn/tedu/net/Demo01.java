package cn.tedu.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ����IP��ַ���� InetAddress
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//--��ȡ����
//		//1.��ȡInetAddress
//		InetAddress addr = InetAddress.getLocalHost();
//		//2.��ȡ��Ϣ
//		System.out.println(addr.getHostName());
//		System.out.println(addr.getHostAddress());
		
		//--��ȡ��������
		//1.��ȡInetAddress
		InetAddress addr = InetAddress.getByName("SHEHUIZHAO");
		//2.��ȡ��Ϣ
		System.out.println(addr.getHostName());
		System.out.println(addr.getHostAddress());
	}
}
