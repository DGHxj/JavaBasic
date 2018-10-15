package cn.tedu.file;

import java.io.File;

public class FileExer2 {

	static int javaCount = 0;
	static int classCount = 0;

	public static void main(String[] args) {

		File file = new File("F:\\workspace");
		count(file);

		System.out.println(javaCount);
		System.out.println(classCount);

	}

	public static void count(File file) {

		// �ж�file�����Ƿ�Ϊ��
		if (file == null)
			throw new NullPointerException();

		// �ж��Ƿ���һ��Ŀ¼
		if (file.isDirectory()) {
			// ��ȡ���Ŀ¼�µ����е����ļ�����Ŀ¼
			File[] fs = file.listFiles();
			for (File f : fs) {
				count(f);
			}
		} /* file�������Ŀ¼�����ļ� */ else if (file.getName().endsWith(".java"))
			javaCount++;
		else if (file.getName().endsWith(".class"))
			classCount++;

	}

}
