package cn.tedu.baozhuang;

public class IntegerDemo2 {

	public static void main(String[] args) {

		// Integer i1 = Integer.valueOf
		// 如果值不在-128~127范围内
		// 底层的valueOf方法是调用了构造方法来返回一个新的对象
		// 如果值在-128~127的范围内的时候
		// 从cache数组中的对应下标位置上取值
		Integer i1 = -125;
		Integer i2 = -125;

		System.out.println(i1 == i2);

		Integer in = 400;
		int i = 400;
		// 当包装类和对应的基本类型在运算的时候会进行自动拆箱
		System.out.println(in == i);

	}

}
