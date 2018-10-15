package cn.tedu.string;

import java.util.Scanner;

/**
 * 输入一个字符串，统计字符串中字母、数字和其他符号的个数
 */
public class StringExer1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 输入字符串
		Scanner s = new Scanner(System.in);
		// next在获取数据的时候是以空白字符（空格、制表符、回车）作为结束
		// String str = s.next();
		// nextLine在获取数据的时候是以回车作为结束
		String str = s.nextLine();

		// 记录字母、数字以及其他符号的个数
		int letter = 0;
		int number = 0;
		int symbol = 0;

		// 遍历字符串，然后依次判断每一个字符的类型
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c >= 65 && c <= 90 || c >= 97 && c <= 122)
				letter++;
			else if (c >= 48 && c <= 57)
				number++;
			else
				symbol++;

		}

		System.out.println("字母：" + letter);
		System.out.println("数字：" + number);
		System.out.println("符号：" + symbol);
	}

}
