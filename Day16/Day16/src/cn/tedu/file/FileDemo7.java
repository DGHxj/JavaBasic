package cn.tedu.file;

import java.io.File;

public class FileDemo7 {

	public static void main(String[] args) {

		File file = new File("E:\\b.txt");

		// 将文件重命名b.txt
		// file.renameTo(new File(file.getParent(),"b.txt"));
		// file.renameTo(new File("D:\\b.txt"));
		// 路径改变的前提下做的是剪切操作
		// file.renameTo(new File("E:\\b.txt"));

		file.renameTo(new File("D:\\a.txt"));

	}

}
