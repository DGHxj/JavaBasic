package cn.tedu.io;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * ��ӡ��
 *	��������͵��������
 *	�Զ�ˢ��
 *	��Զ���׳�IOException
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
//		//1.�����ļ������
//		FileOutputStream out = new FileOutputStream("1.txt");
//		//2.��װΪ��ӡ��
//		PrintStream ps = new PrintStream(out);
//		//3.��ӡ�������
//		ps.println("hello ps~");
//		ps.println(999);
//		ps.println(33.33);
//		ps.println(true);
//		//4.�ر���
//		ps.close();
		
		
		//1.�����ļ������
		FileWriter writer = new FileWriter("2.txt");
		//2.��װΪ��ӡ��
		PrintWriter pw = new PrintWriter(writer);
		//3.��ӡ�������
		pw.println("hello pw~");
		pw.println(999);
		pw.println(33.33);
		pw.println(false);
		//4.�ر���
		pw.close();
	}
}
