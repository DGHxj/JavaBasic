package cn.tedu.io1;

import java.io.FileWriter;
import java.io.Writer;

/**
 * ��������дһ���� ����ָ�����ַ�д�����ⲿ�ļ���
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.�����ļ��ַ������
		Writer writer = new FileWriter("2.txt");
		//2.ͨ���ַ�������������
		writer.write((int)'a');
		writer.write((int)'b');
		writer.write((int)'c');
		writer.write((int)'d');
		writer.write((int)'e');
		//3.ˢ����
		//writer.flush();
		//--�ر������ر��������л�������ˢ��һ����
		writer.close();
	}
}
