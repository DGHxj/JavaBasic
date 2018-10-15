package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.next();

		while (str.length() > 0) {

			// 获取字符串的第一个字符
			char c = str.charAt(0);

			// 记录字符串的原长度
			int len = str.length();

			// 替换掉所有和第一个字符相同的字符
			str = str.replaceAll("" + c, "");

			// 计算替换掉的字符的个数
			// 替换掉几个字符，字符串的长度就会变化几位
			// 所以字符串的长度之差就是替换掉的字符的个数
			System.out.println(c + ":" + (len - str.length()));

		}

	}

}
