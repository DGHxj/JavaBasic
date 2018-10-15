package cn.tedu.reflect;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		System.out.println("���š�����ѡ��ͨ���ߡ�����");
		
		//�˴����������ļ� ѡ����й��ߺͷ���
		InputStream in = new FileInputStream("demo01.properties");
		Properties prop = new Properties();
		prop.load(in);
		in.close();
		
		String clzName = prop.getProperty("className");
		String mName = prop.getProperty("methodName");
		
		Class clz = Class.forName(clzName);
		Object obj = clz.newInstance();
		Method method = clz.getMethod(mName, null);
		method.invoke(obj, null);
		
		System.out.println("����Ŀ�ĵء�����");
	}
}
