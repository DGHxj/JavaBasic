package cn.tedu.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo1 {

	public static void main(String[] args) {

		String str = "abc";

		// �ж��ַ����Ƿ���abc
		// System.out.println(str.equals("abc"));
		// �������������ʽ
		// Pattern p = Pattern.compile("abc");
		// ���������ƥ��
		// Matcher m = p.matcher(str);
		// �����ж�
		// boolean b = m.matches();
		
		// �ж��ַ�����
		// ��3����ĸ���
		// ��һ����ĸ��a/b/c
		// �ڶ�����ĸ��d/e/f/g
		// ��������ĸ��x/y/z
		Pattern p = Pattern.compile("[bac][gedf][xyz]");
		Matcher m = p.matcher(str);
		boolean b = m.matches();
		System.out.println(b);

	}

}
