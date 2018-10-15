package cn.tedu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Properties的用法 - 从属性文件中加载 - 将信息写入属性文件
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//1.创建Properties
		Properties prop = new Properties();
		//2.从流中加载配置信息
		InputStream in = new FileInputStream("1.properties");
		prop.load(in);
		//3.关闭流
		in.close();
		//4.获取属性信息
		System.out.println("驱动名："+prop.getProperty("driverName"));
		System.out.println("地址："+prop.getProperty("url"));
		System.out.println("用户名："+prop.getProperty("name"));
		System.out.println("密码："+prop.getProperty("psw"));
		//5.修改属性
		prop.setProperty("psw", "999");
		//6.将prop更新到文件中
		OutputStream out = new FileOutputStream("1.properties");
		prop.store(out, "连接数据库的信息[DataBase Connection Info]");
		out.flush();
		out.close();
	}
}
