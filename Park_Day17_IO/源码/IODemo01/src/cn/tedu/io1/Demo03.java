package cn.tedu.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * �����������ַ���ʵ���ַ��ļ��Ŀ��� 1.txt -> 3.txt
 */
public class Demo03 {
	public static void main(String[] args) {
		Reader reader = null;
		Writer writer = null;
		try {
			//1.�����ַ������� ����1.txt �����ַ������ ����3.txt
			reader= new FileReader("1.txt");
			writer = new FileWriter("3.txt");
			//2.��1.txt��ȡ����
			int i = 0;
			while((i = reader.read())!=-1){
				writer.write(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.�ر���
			if(reader!=null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					reader = null;
				}
			}
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					writer = null;
				}
			}
		}
		
	}
}
