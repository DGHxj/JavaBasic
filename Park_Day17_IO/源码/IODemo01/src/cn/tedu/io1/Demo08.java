package cn.tedu.io1;

import java.io.FileWriter;
import java.io.StringReader;

/**
 * StringReader���÷�
 */
public class Demo08 {
	public static void main(String[] args) throws Exception {
		//1.����StringReader
		String str = "hello java~ hello world~ ����һ������~";
		StringReader reader = new StringReader(str);
		//2.����FileWriter
		FileWriter writer = new FileWriter("7.txt");
		//2.�Խ������
		int i = 0;
		char [] cs = new char[1024];
		while((i = reader.read(cs))!=-1){
			writer.write(cs,0,i);
		}
		//3.�ر���
		reader.close();
		writer.close();
	}
}
