package cn.tedu.math;

import java.math.BigDecimal;

public class BigDecimalDemo {

	// 原来在程序中是以64位二进制来计算小数
	// strictfp要求方法在计算过程中以80位二进制来计算小数
	// 但是计算完成之后仍然要求结果以64位二进制来进行存储
	public strictfp static void main(String[] args) {

		// 十进制小数转化为二进制的时候本身就不精确
		double d1 = 3.54;
		double d2 = 2.989;
		System.out.println(d1 - d2);

		// 如果想要精确运算，需要将参数以字符串形式传递
		BigDecimal bd1 = new BigDecimal("3.546564");
		BigDecimal bd2 = new BigDecimal("2.989347");
		System.out.println(bd1.subtract(bd2));

	}

}
