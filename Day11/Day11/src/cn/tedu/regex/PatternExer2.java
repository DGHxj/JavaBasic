package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pwd = sc.nextLine();
		sc.close();
		System.out.println(check(pwd));

	}

	private static boolean check(String pwd) {

		if (!pwd.matches("[a-zA-z0-9]{8,20}"))
			return false;

		// 记录出现的字符的种类
		int count = 0;

		// 判断是否含有小写字母
		if (pwd.matches(".*[a-z].*"))
			count++;

		// 判断是否含有大写字母
		if (pwd.matches(".*[A-Z].*"))
			count++;

		// 判断是否含有数字
		if (pwd.matches(".*\\d.*"))
			count++;

		return count >= 2;
	}

}
