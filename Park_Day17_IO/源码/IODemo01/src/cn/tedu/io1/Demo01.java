package cn.tedu.io1;

import java.io.FileReader;
import java.io.Reader;

/**
 * ��������дһ���� ����ȡ�ⲿ�ļ��е��ַ����� 	
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.�����ļ��ַ����������ӵ� 1.txt��
		Reader reader = new FileReader("1.txt");
		//2.ͨ������ȡ�ļ��е�����
		int i = 0;
		while((i=reader.read())!=-1){
			System.out.println((char)i);
		}
		//3.�ر���
		reader.close();
	}
}
