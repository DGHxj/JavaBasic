package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();

		// 记录字符串的原长度 --- 碎片的总长度
		double len = str.length();

		// 将字符串中所有的叠字替换为单字
		str = str.replaceAll("(.)\\1+", "$1");

		// 替换之后的长度就是碎片的个数
		// 计算碎片的平均长度
		System.out.println(len / str.length());
	}

}
