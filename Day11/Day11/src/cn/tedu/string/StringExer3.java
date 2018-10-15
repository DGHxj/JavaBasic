package cn.tedu.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ����һ���ַ����������е�������ȡ������������������
 */
public class StringExer3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ��ȡ�ַ���
		Scanner s = new Scanner(System.in);
		String str = s.next();

		// �洢��ȡ��Ľ��
		char[] ns = new char[str.length()];

		// ��¼��ȡ�����ֵĸ���
		int count = 0;

		// �����ַ������ж����е��ַ��Ƿ�������
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c >= '0' && c <= '9')
				ns[count++] = c;

		}
		
		// �������û�б�������ȥ��û���õ���λ��
		ns = Arrays.copyOf(ns, count);
		
		// ����
		Arrays.sort(ns);
		
		System.out.println(new String(ns));

	}

}
