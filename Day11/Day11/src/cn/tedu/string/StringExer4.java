package cn.tedu.string;

import java.util.Scanner;

/**
 * 输入一个字符串，统计其中每一个字符出现的次数
 */
public class StringExer4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.next();

		// 标记思想
		// 给字符串的每一位字符进行标记
		// 规定如果为false表示这一位没有统计过
		// 如果为true说明这一位已经被统计过不需要被再次统计
		boolean[] bs = new boolean[str.length()];

		// 遍历字符串,依次获取每一位字符
		// 从头到尾的获取过程中有的位置已经统计过
		for (int i = 0; i < bs.length; i++) {
			// 判断这一位是否已经被统计过
			if (bs[i])
				continue;

			// 获取这一位字符
			char c = str.charAt(i);

			// 记录这个字符出现的次数
			int count = 0;

			// 从当前位置开始继续向后寻找相同的字符
			for (int j = i; j < bs.length; j++) {

				if (c == str.charAt(j)) {
					count++;
					bs[j] = true;
				}

			}

			System.out.println(c + ":" + count);

		}
	}

}
