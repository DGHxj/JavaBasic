package cn.tedu.file;

import java.io.File;
//import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo6 {

	public static void main(String[] args) {

		File file = new File("E:\\");

		// 获取指定目录下的所有的子目录和子文件
		// File[] fs = file.listFiles();

		// 获取E盘下所有的子文件
		// File[] fs = file.listFiles(new FileFilter() {
		//
		// @Override
		// // 写过滤规则
		// // 过滤之后如果返回true，则自动放入数组中
		// public boolean accept(File pathname) {
		// return pathname.isFile();
		// }
		// });
		// 获取E盘下名字中含有数字的子文件或者是子目录
		// File[] fs = file.listFiles(new FileFilter() {
		//
		// @Override
		// public boolean accept(File pathname) {
		// return pathname.getName().matches(".*\\d.*");
		// }
		// });
		File[] fs = file.listFiles(new FilenameFilter() {

			@Override
			// dir表示文件所存储的路径
			public boolean accept(File dir, String name) {
				return name.matches(".*\\d.*");
			}
		});

		for (File f : fs) {
			System.out.println(f);
		}

		// 获取内存空间 --- 返回的是字节个数
		// long count = file.getTotalSpace();
		// System.out.println(count);

		// 获取可以使用的空间大小
		// System.out.println(file.getUsableSpace());

	}

}
