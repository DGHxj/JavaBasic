package cn.tedu.file;

import java.io.File;

public class FileDemo5 {

	public static void main(String[] args) {

		// 在Windows中，分隔目录用的\
		// 在Linux中，分隔目录用的/
		// 在Windows中，分隔路径用的;
		// 在Linux中，分隔路径用的:
		File file = new File("E:" + File.separatorChar + "aaa.txt");

		// 获取父路径
		System.out.println(file.getParent());
		System.out.println(file.getName());

		// 获取绝对路径
		// System.out.println(file.getAbsolutePath());
		// 获取路径
		// System.out.println(file.getPath());

	}

}
