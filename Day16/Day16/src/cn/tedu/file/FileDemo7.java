package cn.tedu.file;

import java.io.File;

public class FileDemo7 {

	public static void main(String[] args) {

		File file = new File("E:\\b.txt");

		// ���ļ�������b.txt
		// file.renameTo(new File(file.getParent(),"b.txt"));
		// file.renameTo(new File("D:\\b.txt"));
		// ·���ı��ǰ���������Ǽ��в���
		// file.renameTo(new File("E:\\b.txt"));

		file.renameTo(new File("D:\\a.txt"));

	}

}
