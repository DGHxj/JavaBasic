package cn.tedu.math;

import java.math.BigDecimal;

public class BigDecimalDemo {

	// ԭ���ڳ���������64λ������������С��
	// strictfpҪ�󷽷��ڼ����������80λ������������С��
	// ���Ǽ������֮����ȻҪ������64λ�����������д洢
	public strictfp static void main(String[] args) {

		// ʮ����С��ת��Ϊ�����Ƶ�ʱ����Ͳ���ȷ
		double d1 = 3.54;
		double d2 = 2.989;
		System.out.println(d1 - d2);

		// �����Ҫ��ȷ���㣬��Ҫ���������ַ�����ʽ����
		BigDecimal bd1 = new BigDecimal("3.546564");
		BigDecimal bd2 = new BigDecimal("2.989347");
		System.out.println(bd1.subtract(bd2));

	}

}
