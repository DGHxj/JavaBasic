package cn.tedu.file;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		
		File file = new File("D:\\a");
		
		// 判断file所代表的文件或者目录是否真实存在
		System.out.println(file.exists());
		
		// 判断是否可写
		System.out.println(file.canWrite());
		
		// 判断是否是一个隐藏文件
		System.out.println(file.isHidden());
		
		// 判断是不是一个绝对路径
		System.out.println(file.isAbsolute());
	}
	
}
