package cn.tedu.regex;

public class PatternDemo1 {

	public static void main(String[] args) {

		// String str = "va87gg[bq;903h/0gvd'sga9gsd";

		// System.out.println(str.replace('0', '-'));
		// �����е������滻Ϊ-
		// System.out.println(str.replaceAll("\\d", "-"));
		// �����з�����ȫ��ȥ��
		// System.out.println(str.replaceAll("\\D", ""));

		// String str = "Cat Dog Pig Mouse Snake";
		// ����Dog��Snake��˳��
		// ��replaceAll�п���$n����ʽ����ǰһ�������ж�Ӧ��ŵĲ�����
		// System.out.println(str.replaceAll("(Cat )(Dog)( Pig Mouse )(Snake)",
		// "$1$4$3$2"));
		
		String str = "���������������Ұ�������ѧѧѧϰϰϰϰϰϰϰϰϰϰϰ";
		// �Ұ�ѧϰ
		System.out.println(str.replaceAll("(.)\\1+", "$1"));
		

	}

}
