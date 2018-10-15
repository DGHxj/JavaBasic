package cn.tedu.file;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {

		File file = new File("D:\\a.txt");

		// 获取文件的修改时间
		System.out.println(file.lastModified());
		// 设置文件的最后一次修改时间
		// file.setLastModified(74617964131L);

		// 设置文件是否可执行
		// System.out.println(file.setExecutable(false));
		// 设置文件是否可读
		// System.out.println(file.setReadable(false));
		// 设置文件是否可写
		// System.out.println(file.setWritable(false));

	}

}
