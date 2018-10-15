package cn.tedu.string;

import java.util.Scanner;

public class StringExer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		int begin = s.nextInt();
		int end = s.nextInt();

		String sub = subString(str, begin, end);
		System.out.println(sub);
	}

	public static String subString(String str, int begin, int end) {

		// 判断参数是否为空
		if (str == null)
			return null;

		// 判断起始下标 
		if (begin < 0 || begin >= str.length() || begin > end)
			return null;
		
		// 判断结束下标 
		if(end < 0 || end >= str.length())
			return null;
		
		char[] cs = str.toCharArray();
		String sub = new String(cs, begin, end - begin);
		
		return sub;

	}
}
