package cn.tedu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Properties���÷� - �������ļ��м��� - ����Ϣд�������ļ�
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//1.����Properties
		Properties prop = new Properties();
		//2.�����м���������Ϣ
		InputStream in = new FileInputStream("1.properties");
		prop.load(in);
		//3.�ر���
		in.close();
		//4.��ȡ������Ϣ
		System.out.println("��������"+prop.getProperty("driverName"));
		System.out.println("��ַ��"+prop.getProperty("url"));
		System.out.println("�û�����"+prop.getProperty("name"));
		System.out.println("���룺"+prop.getProperty("psw"));
		//5.�޸�����
		prop.setProperty("psw", "999");
		//6.��prop���µ��ļ���
		OutputStream out = new FileOutputStream("1.properties");
		prop.store(out, "�������ݿ����Ϣ[DataBase Connection Info]");
		out.flush();
		out.close();
	}
}
