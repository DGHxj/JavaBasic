package cn.tedu.string;

public class StringDemo {

	public static void main(String[] args) {

		// String str = "abc";
		// str = "def";
		// System.out.println(str);

		// s1ָ�򷽷���
		String s1 = "ab";
		// s2ָ����ڴ棬���ڴ�ָ�򷽷���
		String s2 = new String("ab");
		// �ַ����ڷ�������ֻ���һ��
		// ����ʹ�õ�ֵ��ȵ��ַ�����ʱ��ʹ�õ���ͬһ��
		String s3 = "ab";
		// "a"��"b"������������
		// �������ڲ��������ʱ��Ϊ�����Ч���ڱ���ʱ�ھͻ�����
		// String s4 = "a" + "b"; -> String s4 = "ab";
		String s4 = "a" + "b";
		// s5 = s5 + "b";�����Ż�
		// ʵ���ϵײ���������StringBuilder�е�append���������
		String s5 = "a";
		// s5 = new StringBuilder(s5).append("b").toString();
		// s5���ָ����ڴ棬���ڴ���ָ�򷽷���
		s5 = s5 + "b";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s2 == s5);

	}

}
