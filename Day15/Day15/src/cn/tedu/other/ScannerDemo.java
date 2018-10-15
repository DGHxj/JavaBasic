package cn.tedu.other;

import java.util.Scanner;

public class ScannerDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 用空白字符进行分隔
		// int i = s.nextInt();
		// double d = s.nextDouble();
		// String str = s.next();
		// 用回车换行进行分隔
		// 以上次结束作为本次的开始
		String str2 = s.nextLine();

		// System.out.println(i);
		// System.out.println(d);
		// System.out.println(str);
		System.out.println(str2.replaceAll("", ""));

	}

}
