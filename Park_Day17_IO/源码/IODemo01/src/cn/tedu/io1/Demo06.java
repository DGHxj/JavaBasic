package cn.tedu.io1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * BufferedReader��BufferedWriter�ṩ���·���
 * 
 * BufferedReader
 * 	readline()
 * 
 * BufferedWriter
 * 	newLine() 
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		//1.������ ���û�������װ
		BufferedReader reader = new BufferedReader(new FileReader("1.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("2.txt"));
		
		//2.�Խ��� �����ļ�
		String line = null;
		while((line = reader.readLine())!=null){
			writer.write(line);
			writer.newLine();
		}
		
		//3.�ر���
		reader.close();
		writer.close();
	
	}
}
