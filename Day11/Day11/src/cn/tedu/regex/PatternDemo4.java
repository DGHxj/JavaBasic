package cn.tedu.regex;

public class PatternDemo4 {

	public static void main(String[] args) {

		String str = "a";

		// ������
		// ƥ����a��ͷ������2���ַ���ɵ��ַ���
		// System.out.println(str.startsWith("a") && str.length() >= 2);
		// + ��ʾ֮ǰ���ַ����ٳ���1�� >= 1
		// System.out.println(str.matches("a.+"));

		// ƥ����Сд��ĸ��ͷ�����ֽ�β���ַ���
		// * ��ʾ֮ǰ���ַ����п��� >= 0
		// System.out.println(str.matches("[a-z].*\\d"));
		
		// ƥ����a��ͷ����2���ַ���ɵ��ַ���
		// ? ��ʾ֮ǰ���ַ��������1�� <= 1
		System.out.println(str.matches("a.?"));

	}

}
