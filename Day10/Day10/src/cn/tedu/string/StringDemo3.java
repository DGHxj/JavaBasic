package cn.tedu.string;

public class StringDemo3 {

	public static void main(String[] args) {

		// String str = "vhaovldasnoasbo";

		// ��ȡ�ַ����ĳ���
		// System.out.println(str.length());

		// ͨ��ָ�����±��ȡ�ַ�����Ӧλ���ϵ��ַ�
		// char c = str.charAt(4);
		// System.out.println(c);

		// ���ַ���ת��Ϊ�ַ�������ʽ
		// char[] cs = str.toCharArray();
		// for (char c : cs) {
		// System.out.println(c);
		// }

		char[] cs = { 'd', 'e', 'g', 'y', 'c', 'r', 'n', 'u', 'a', 'u' };

		// ���ַ�����ת��Ϊ�ַ���
		// String str = new String(cs);
		//�ӵ�3����ʼ  ת��5��
		String str = new String(cs, 3, 5);
		System.out.println(str);
	}

}
