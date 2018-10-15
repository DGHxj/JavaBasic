package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();

		System.out.println(str.matches("0\\.\\d+") 
				|| str.matches("[1-9]\\d*\\.\\d+"));

	}

}
