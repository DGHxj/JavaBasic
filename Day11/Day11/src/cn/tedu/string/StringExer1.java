package cn.tedu.string;

import java.util.Scanner;

/**
 * ����һ���ַ�����ͳ���ַ�������ĸ�����ֺ��������ŵĸ���
 */
public class StringExer1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// �����ַ���
		Scanner s = new Scanner(System.in);
		// next�ڻ�ȡ���ݵ�ʱ�����Կհ��ַ����ո��Ʊ�����س�����Ϊ����
		// String str = s.next();
		// nextLine�ڻ�ȡ���ݵ�ʱ�����Իس���Ϊ����
		String str = s.nextLine();

		// ��¼��ĸ�������Լ��������ŵĸ���
		int letter = 0;
		int number = 0;
		int symbol = 0;

		// �����ַ�����Ȼ�������ж�ÿһ���ַ�������
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c >= 65 && c <= 90 || c >= 97 && c <= 122)
				letter++;
			else if (c >= 48 && c <= 57)
				number++;
			else
				symbol++;

		}

		System.out.println("��ĸ��" + letter);
		System.out.println("���֣�" + number);
		System.out.println("���ţ�" + symbol);
	}

}
