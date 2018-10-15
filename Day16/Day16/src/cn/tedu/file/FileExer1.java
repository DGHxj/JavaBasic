package cn.tedu.file;

import java.io.File;

public class FileExer1 {

	public static void main(String[] args) {
		
		File file = new File("D:\\aaa");
		del(file);

	}

	public static void del(File file) {

		// 判断参数是否为空
		if (file == null)
			throw new NullPointerException("亲，文件不能为空哦~~~");

		// 判断file对象是文件还是目录
		if (file.isDirectory()) {

			// 如果是目录，需要获取这个目录下的所有的子文件和子目录
			File[] fs = file.listFiles();
			for (File f : fs) {
				// 逐个遍历每一个元素，判断这个元素是文件还是目录
				del(f);
			}

		}

		// 无论是文件还是目录都需要删除
		file.delete();
	}

}
