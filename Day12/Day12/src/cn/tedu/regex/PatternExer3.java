package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();

		// ��¼�ַ�����ԭ���� --- ��Ƭ���ܳ���
		double len = str.length();

		// ���ַ��������еĵ����滻Ϊ����
		str = str.replaceAll("(.)\\1+", "$1");

		// �滻֮��ĳ��Ⱦ�����Ƭ�ĸ���
		// ������Ƭ��ƽ������
		System.out.println(len / str.length());
	}

}
