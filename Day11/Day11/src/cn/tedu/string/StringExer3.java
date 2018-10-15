package cn.tedu.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个字符串，将其中的数字提取出来并进行升序排序
 */
public class StringExer3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.next();

		// 存储提取后的结果
		char[] ns = new char[str.length()];

		// 记录提取的数字的个数
		int count = 0;

		// 遍历字符串，判断其中的字符是否是数字
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c >= '0' && c <= '9')
				ns[count++] = c;

		}
		
		// 数组可能没有被填满，去除没有用到的位置
		ns = Arrays.copyOf(ns, count);
		
		// 排序
		Arrays.sort(ns);
		
		System.out.println(new String(ns));

	}

}
