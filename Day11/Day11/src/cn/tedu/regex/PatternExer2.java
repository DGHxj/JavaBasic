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

		// ��¼���ֵ��ַ�������
		int count = 0;

		// �ж��Ƿ���Сд��ĸ
		if (pwd.matches(".*[a-z].*"))
			count++;

		// �ж��Ƿ��д�д��ĸ
		if (pwd.matches(".*[A-Z].*"))
			count++;

		// �ж��Ƿ�������
		if (pwd.matches(".*\\d.*"))
			count++;

		return count >= 2;
	}

}
