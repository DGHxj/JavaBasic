package cn.tedu.other;

import java.util.Scanner;

public class AssertDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int age = s.nextInt();

		// 进行断言
		// 如果断言成功，则继续往下执行
		// 如果断言失败，则抛出错误AssertionError
		assert age > 0 : "预测年龄应该是大于0的数值，实际上是" + age;
		
		System.out.println(age);

	}

}
