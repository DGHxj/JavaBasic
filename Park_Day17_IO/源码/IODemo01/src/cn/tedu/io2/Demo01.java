package cn.tedu.io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �����ֽ���ʵ���ļ��ĸ���
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.������
		InputStream in = new FileInputStream("1.wmv");
		OutputStream out = new FileOutputStream("2.wmv");
		//2.�Խ��� ʵ�ָ���
		int i = 0;
		while((i = in.read())!=-1){
			out.write(i);
		}
		//3.�ر���
		in.close();
		out.close();
	}
}
