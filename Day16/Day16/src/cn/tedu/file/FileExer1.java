package cn.tedu.file;

import java.io.File;

public class FileExer1 {

	public static void main(String[] args) {
		
		File file = new File("D:\\aaa");
		del(file);

	}

	public static void del(File file) {

		// �жϲ����Ƿ�Ϊ��
		if (file == null)
			throw new NullPointerException("�ף��ļ�����Ϊ��Ŷ~~~");

		// �ж�file�������ļ�����Ŀ¼
		if (file.isDirectory()) {

			// �����Ŀ¼����Ҫ��ȡ���Ŀ¼�µ����е����ļ�����Ŀ¼
			File[] fs = file.listFiles();
			for (File f : fs) {
				// �������ÿһ��Ԫ�أ��ж����Ԫ�����ļ�����Ŀ¼
				del(f);
			}

		}

		// �������ļ�����Ŀ¼����Ҫɾ��
		file.delete();
	}

}
