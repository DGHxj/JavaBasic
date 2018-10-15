package cn.tedu.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * ͨ���ַ��� �����ַ��ļ� ����Ч������
 */
public class Demo04 {
	public static void main(String[] args){
		//--��ʼʱ��
		long begin = System.currentTimeMillis();
		
		Reader reader = null;
		Writer writer = null;
		try {
			//1.������
			reader = new FileReader("4.txt");
			writer = new FileWriter("5.txt");
			//2.��������
			//int count = 0;
			int i = 0;
			char [] buf = new char [1024];
			while ((i = reader.read(buf)) != -1) {
				//System.out.println("��ȡ��"+(++count)+"��");
				writer.write(buf,0,i);
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
				} finally {
					writer = null;
				}
			}
		}
		//--����ʱ��
		long end = System.currentTimeMillis();
		System.out.println("====����ʱ��"+(end-begin)+"ms====");
	
	}
}
