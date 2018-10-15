package cn.tedu.finalx;

import java.util.Arrays;

public class FinalDemo1 {

	public static void main(String[] args) {

		// final int i = 9;
		final int i;
		i = 13;

		// arr是一个对象->地址不可变
		final int[] arr = { 3, 6, 1, 7, 0 };
		arr[1] = 8;

		// 传递的是i的实际值
		changeValue(i);
		System.out.println(i);

		expand(arr);
		System.out.println(arr.length);
	}

	// 在这个方法中并没有将参数i定义为常量
	public static void changeValue(int i) {
		i++;
	}

	public static void expand(int[] arr) {
		arr = Arrays.copyOf(arr, arr.length * 2);
	}

}

class A {

	// 成员常量
	// 成员常量i必须在对象完全创建完成之前给值
	// final int i = 6;
	final int i;
	int j;

	// 静态常量必须在类加载完成之前给值
	// static final int k = 0;
	static final int k;
	static {
		k = 7;
	}

	// {
	// i = 10;
	// }

	public A() {
		this.i = 8;
	}
}
