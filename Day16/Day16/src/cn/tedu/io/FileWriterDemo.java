package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

		// ����ʹ�����֮����Զ��Ľ��й�������
		// try-with-resources ��JDK1.7��ʼ��
		// Ҫ���ܹ�ʹ��try-with-resources��ʽ��������ʵ��AutoCloseable
		// Ҫ�����Ĵ������̱�����try֮��
		try (FileWriter writer = new FileWriter("D:\\c.txt")) {
			writer.write("def");
			writer.write("abe");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// public void m(FileWriter writer){
	// try(writer){
	//
	// }catch (Exception e) {
	// }
	// }

}
