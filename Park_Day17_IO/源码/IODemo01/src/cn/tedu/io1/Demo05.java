package cn.tedu.io1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * ʹ�� ������ BufferedReader BufferedWriter�����ı��ļ�
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		//1.���� ���л������� �ļ������� �ļ������ 
		FileReader reader = new FileReader("4.txt");
		BufferedReader breader = new BufferedReader(reader);
		FileWriter writer = new FileWriter("5.txt");
		BufferedWriter bwriter = new BufferedWriter(writer);
		
		//2.������ �����ļ�
		int i = 0;
		char [] buf = new char[1024];
		while((i = breader.read(buf))!=-1){
			bwriter.write(buf,0,i);
		}
		
		//3.�ر���
		breader.close();
		bwriter.close();
		
	}
}
