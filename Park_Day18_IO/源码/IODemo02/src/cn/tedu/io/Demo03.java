package cn.tedu.io;

import java.util.Properties;

/**
 * Properties���÷� - ��������
 */
public class Demo03 {
	public static void main(String[] args) {
		//1.����Properties
		Properties prop = new Properties();
		//2.�����������
		prop.setProperty("driverName", "com.mysql.jdbc.Driver");
		prop.setProperty("url", "jdbc:mysq:///parkdb");
		prop.setProperty("name", "zs");
		prop.setProperty("psw", "123");
		//3.��Properties�л�ȡ����
		System.out.println("��������"+prop.getProperty("driverName"));
		System.out.println("��ַ��"+prop.getProperty("url"));
		System.out.println("�û�����"+prop.getProperty("name"));
		System.out.println("���룺"+prop.getProperty("psw"));
		
	}
}
