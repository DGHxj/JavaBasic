package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ��ȡ�ַ���
		Scanner s = new Scanner(System.in);
		String str = s.next();

		while (str.length() > 0) {

			// ��ȡ�ַ����ĵ�һ���ַ�
			char c = str.charAt(0);

			// ��¼�ַ�����ԭ����
			int len = str.length();

			// �滻�����к͵�һ���ַ���ͬ���ַ�
			str = str.replaceAll("" + c, "");

			// �����滻�����ַ��ĸ���
			// �滻�������ַ����ַ����ĳ��Ⱦͻ�仯��λ
			// �����ַ����ĳ���֮������滻�����ַ��ĸ���
			System.out.println(c + ":" + (len - str.length()));

		}

	}

}
