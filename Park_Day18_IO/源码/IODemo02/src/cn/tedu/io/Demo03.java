package cn.tedu.io;

import java.util.Properties;

/**
 * Properties的用法 - 基本操作
 */
public class Demo03 {
	public static void main(String[] args) {
		//1.创建Properties
		Properties prop = new Properties();
		//2.设置相关属性
		prop.setProperty("driverName", "com.mysql.jdbc.Driver");
		prop.setProperty("url", "jdbc:mysq:///parkdb");
		prop.setProperty("name", "zs");
		prop.setProperty("psw", "123");
		//3.从Properties中获取属性
		System.out.println("驱动名："+prop.getProperty("driverName"));
		System.out.println("地址："+prop.getProperty("url"));
		System.out.println("用户名："+prop.getProperty("name"));
		System.out.println("密码："+prop.getProperty("psw"));
		
	}
}
