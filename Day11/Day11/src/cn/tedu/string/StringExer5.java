package cn.tedu.string;

import java.util.Scanner;

public class StringExer5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		// ��ȡ��һ���ַ�����һ������
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = s.nextInt();

		// ���ַ���ת��Ϊһ���ֽ�����
		byte[] bs = str.getBytes("gbk");

		// ����ָ�����ֽڸ�����ȡ����ַ���
		String sub = new String(bs, 0, n, "gbk");

		// ȷ���Ӵ������һλ�Ƿ�ת������
		if (sub.charAt(sub.length() - 1) != str.charAt(sub.length() - 1))
			sub = new String(bs, 0, n - 1, "gbk");
		
		System.out.println(sub);
	}

}
