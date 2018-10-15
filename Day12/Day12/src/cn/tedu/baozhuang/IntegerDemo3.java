package cn.tedu.baozhuang;

public class IntegerDemo3 {

	public static void main(String[] args) {

		Integer in = new Integer("-284");
		System.out.println(in);

		int i = Integer.parseInt("259");
		System.out.println(i);

		Double dou = new Double("3.954");
		System.out.println(dou);

		// 不考虑大小写的情况只要不是true那么就是false
		Boolean b = new Boolean("true");
		System.out.println(b);

		// NaN是唯一的一个值
		// NaN与任何东西都不相等，包括自己本身
		// System.out.println(Double.NaN == Double.NaN);
		System.out.println(Double.isNaN(5.8 / 4.32));
	}

}
