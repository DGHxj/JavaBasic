package cn.tedu.file;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {

		File file = new File("D:\\a.txt");

		// ��ȡ�ļ����޸�ʱ��
		System.out.println(file.lastModified());
		// �����ļ������һ���޸�ʱ��
		// file.setLastModified(74617964131L);

		// �����ļ��Ƿ��ִ��
		// System.out.println(file.setExecutable(false));
		// �����ļ��Ƿ�ɶ�
		// System.out.println(file.setReadable(false));
		// �����ļ��Ƿ��д
		// System.out.println(file.setWritable(false));

	}

}
