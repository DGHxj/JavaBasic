package cn.tedu.io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * ������ͨ��ת���� �����Զ��������ַ��� �����ļ� �������
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//1.�����ֽ���
		InputStream in = new FileInputStream("d://8.txt");
		OutputStream out = new FileOutputStream("d://9.txt");
	
		//2.����ת���� ���ֽ���ת��Ϊ�ַ��� ����ʽָ�����Ϊutf-8
		InputStreamReader reader = new InputStreamReader(in,"utf-8");
		OutputStreamWriter writer = new OutputStreamWriter(out,"utf-8");
		
		//3.�Խ��� �����ļ�
		char [] data = new char[1024];
		int i = 0;
		while((i=reader.read(data))!=-1){
			writer.write(data,0,i);
		}
		
		//4.�ر���
		reader.close();
		writer.close();
	}
}
