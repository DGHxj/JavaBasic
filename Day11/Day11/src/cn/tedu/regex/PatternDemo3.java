package cn.tedu.regex;

public class PatternDemo3 {

	public static void main(String[] args) {

		String str = ".";

		// ƥ����a��ͷ����2���ַ���ɵ��ַ���
		// . ��ʾͨ���������ƥ������һ�����͵��ַ�
		// System.out.println(str.matches("a."));

		// �ж��Ƿ���һ�� .
		// \\. Java��ת��Ϊ\. ,������ת��Ϊ.
		// System.out.println(str.matches("\\."));

		// ��ôƥ�� \
		// \\\\ Java��ת��Ϊ\\ ,������ת��Ϊ\
		System.out.println(str.matches("\\\\"));

	}

}
