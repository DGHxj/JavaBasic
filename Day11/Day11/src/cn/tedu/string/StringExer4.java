package cn.tedu.string;

import java.util.Scanner;

/**
 * ����һ���ַ�����ͳ������ÿһ���ַ����ֵĴ���
 */
public class StringExer4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ��ȡ�ַ���
		Scanner s = new Scanner(System.in);
		String str = s.next();

		// ���˼��
		// ���ַ�����ÿһλ�ַ����б��
		// �涨���Ϊfalse��ʾ��һλû��ͳ�ƹ�
		// ���Ϊtrue˵����һλ�Ѿ���ͳ�ƹ�����Ҫ���ٴ�ͳ��
		boolean[] bs = new boolean[str.length()];

		// �����ַ���,���λ�ȡÿһλ�ַ�
		// ��ͷ��β�Ļ�ȡ�������е�λ���Ѿ�ͳ�ƹ�
		for (int i = 0; i < bs.length; i++) {
			// �ж���һλ�Ƿ��Ѿ���ͳ�ƹ�
			if (bs[i])
				continue;

			// ��ȡ��һλ�ַ�
			char c = str.charAt(i);

			// ��¼����ַ����ֵĴ���
			int count = 0;

			// �ӵ�ǰλ�ÿ�ʼ�������Ѱ����ͬ���ַ�
			for (int j = i; j < bs.length; j++) {

				if (c == str.charAt(j)) {
					count++;
					bs[j] = true;
				}

			}

			System.out.println(c + ":" + count);

		}
	}

}
