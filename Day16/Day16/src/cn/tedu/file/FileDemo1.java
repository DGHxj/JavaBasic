package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {

		// 表示创建了一个代表D盘下a.txt的File对象
		// file对象创建的时候并不会去计算机中检查文件是否真实存在
		// 只是将传入的路径标记为了一个file对象
		File file = new File("test/a.txt");

		// 删除文件/目录 --- 不可逆
		// 表示将文件/目录从计算机中彻底移除，不可撤销
		// 在删除目录的时候要求目录是空目录
		boolean b = file.delete();

		// 创建文件
		// 如果这个文件不存在，则创建该文件
		// 如果文件已经存在，则创建失败
		// 在创建这个文件的时候要求这个文件的存放路径必须真实存在
		// 只能创建文件不能创建目录
		// boolean b = file.createNewFile();

		// 创建目录
		// make directory
		// 当且仅当这个目录不存在的时候才会创建
		// 只能创建一层目录
		// boolean b = file.mkdir();
		// 表示可以创建一层或者多层目录
		// boolean b = file.mkdirs();

		System.out.println(b);
	}

}
