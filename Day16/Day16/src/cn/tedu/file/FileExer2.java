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

		// 判断file对象是否为空
		if (file == null)
			throw new NullPointerException();

		// 判断是否是一个目录
		if (file.isDirectory()) {
			// 获取这个目录下的所有的子文件和子目录
			File[] fs = file.listFiles();
			for (File f : fs) {
				count(f);
			}
		} /* file如果不是目录就是文件 */ else if (file.getName().endsWith(".java"))
			javaCount++;
		else if (file.getName().endsWith(".class"))
			classCount++;

	}

}
