package cn.tedu.other;

import java.util.Scanner;

public class ScannerDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// �ÿհ��ַ����зָ�
		// int i = s.nextInt();
		// double d = s.nextDouble();
		// String str = s.next();
		// �ûس����н��зָ�
		// ���ϴν�����Ϊ���εĿ�ʼ
		String str2 = s.nextLine();

		// System.out.println(i);
		// System.out.println(d);
		// System.out.println(str);
		System.out.println(str2.replaceAll("", ""));

	}

}
