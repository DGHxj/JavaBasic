package cn.tedu.file;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {

		File file = new File("E:\\");

		// 获取E盘下的所有的子目录和子文件
		File[] fs = file.listFiles();
		for (File f : fs) {
			// 获取文件的名字
			System.out.println(f.getName());
		}

		// 判断file对象是否是一个目录
		System.out.println(file.isDirectory());
		// 判断file对象是否是一个文件
		System.out.println(file.isFile());
	}

}
