package cn.tedu.string;

import java.util.Scanner;

/**
 * ����һ���ַ����������е�������ȡ���������
 */
public class StringExer2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// ��ȡ���ַ���
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		// ��¼��
		int sum = 0;
		
		// ���ַ���ת��Ϊ�ַ�����
		char[] cs = str.toCharArray();
		
		// �����ַ����飬��ȡ���е�����
		for (char c : cs) {
			
			if(c >= '0' && c <= '9')
				sum += (c - '0');
			
		}
		
		System.out.println(sum);
		
	}

}
