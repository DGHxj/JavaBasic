package cn.tedu.baozhuang;

public class IntegerDemo3 {

	public static void main(String[] args) {

		Integer in = new Integer("-284");
		System.out.println(in);

		int i = Integer.parseInt("259");
		System.out.println(i);

		Double dou = new Double("3.954");
		System.out.println(dou);

		// �����Ǵ�Сд�����ֻҪ����true��ô����false
		Boolean b = new Boolean("true");
		System.out.println(b);

		// NaN��Ψһ��һ��ֵ
		// NaN���κζ���������ȣ������Լ�����
		// System.out.println(Double.NaN == Double.NaN);
		System.out.println(Double.isNaN(5.8 / 4.32));
	}

}
