package cn.tedu.io2;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * �����������ַ���������ϵͳ���ļ���������
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		//1.������
		FileReader reader = new FileReader("8.txt");
		FileWriter writer = new FileWriter("9.txt");
		//2.�Խ��� �����ļ�
		char [] data = new char[1024];
		int i = 0;
		while((i = reader.read(data))!=-1){
			writer.write(data,0,i);
		}
		
		//3.�ر���
		reader.close();
		writer.close();
		
	}
}
