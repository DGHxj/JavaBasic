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

		// �жϲ����Ƿ�Ϊ��
		if (str == null)
			return null;

		// �ж���ʼ�±� 
		if (begin < 0 || begin >= str.length() || begin > end)
			return null;
		
		// �жϽ����±� 
		if(end < 0 || end >= str.length())
			return null;
		
		char[] cs = str.toCharArray();
		String sub = new String(cs, begin, end - begin);
		
		return sub;

	}
}
