package cn.tedu.regex;

public class PatternDemo2 {

	public static void main(String[] args) {

		String str = "d";

		// �ж��ַ�����
		// ��3����ĸ���
		// ��һ����ĸ��a/b/c
		// �ڶ�����ĸ��d/e/f/g
		// ��������ĸ��x/y/z
		// System.out.println(str.matches("[abc][defg][xyz]"));

		// ƥ����һ����ĸ��ɵ��ַ���
		// System.out.println(str.matches("[a-zA-Z]"));
		// ƥ����һ��������ɵ��ַ���
		// System.out.println(str.matches("[0-9]"));
		// System.out.println(str.matches("\\d"));

		// ƥ����һ���ַ���ɵ��ַ�����������a/b/c
		// [^...] ��ʾ������Щ�ַ�
		System.out.println(str.matches("[^abc]"));
	}

}
