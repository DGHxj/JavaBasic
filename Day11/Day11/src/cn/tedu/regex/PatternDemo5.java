package cn.tedu.regex;

public class PatternDemo5 {

	public static void main(String[] args) {

		String str = "gbbsdardfdjvt";

		// ƥ����5��Сд��ĸ��ɵ��ַ���
		// {n} ��ʾ֮ǰ���ַ�ǡ�ó���n�� == n
		 System.out.println(str.matches("[a-z]{5}"));

		// ƥ��������5��Сд��ĸ��ɵ��ַ���
		// System.out.println(str.matches("[a-z]{5,}"));

		// ƥ����8-12��Сд��ĸ��ɵ��ַ���
		System.out.println(str.matches("[a-z]{8,13}"));
	}

}
