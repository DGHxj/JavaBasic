package cn.tedu.file;

import java.io.File;

public class FileDemo5 {

	public static void main(String[] args) {

		// ��Windows�У��ָ�Ŀ¼�õ�\
		// ��Linux�У��ָ�Ŀ¼�õ�/
		// ��Windows�У��ָ�·���õ�;
		// ��Linux�У��ָ�·���õ�:
		File file = new File("E:" + File.separatorChar + "aaa.txt");

		// ��ȡ��·��
		System.out.println(file.getParent());
		System.out.println(file.getName());

		// ��ȡ����·��
		// System.out.println(file.getAbsolutePath());
		// ��ȡ·��
		// System.out.println(file.getPath());

	}

}
