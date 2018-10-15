package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) {

		// ��writer�ŵ�try֮����������ֵΪnull
		FileWriter writer = null;
		try {
			// ��writer�ŵ�try֮�ڳ�ʼ��
			writer = new FileWriter("H:\\b.txt");
			writer.write("abc");
			// Ϊ�˷�ֹ������ʱ���Զ���ˢʧ�ܵ������ݵĶ�ʧ
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ��Ҫ�ж�writer�Ƿ��ʼ���ɹ�
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					// �������ʧ�ܣ���ǿ�ƽ���������Ϊnull���л������ͷ��ļ�
					// ��������ɹ�������������Ϊ��������
					writer = null;
				}
		}

	}

}
