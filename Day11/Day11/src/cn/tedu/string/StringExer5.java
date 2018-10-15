package cn.tedu.string;

import java.util.Scanner;

public class StringExer5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		// 获取到一个字符串和一个数字
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = s.nextInt();

		// 将字符串转化为一个字节数组
		byte[] bs = str.getBytes("gbk");

		// 根据指定的字节个数截取这个字符串
		String sub = new String(bs, 0, n, "gbk");

		// 确定子串的最后一位是否转化出来
		if (sub.charAt(sub.length() - 1) != str.charAt(sub.length() - 1))
			sub = new String(bs, 0, n - 1, "gbk");
		
		System.out.println(sub);
	}

}
