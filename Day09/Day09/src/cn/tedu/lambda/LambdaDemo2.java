package cn.tedu.lambda;

public class LambdaDemo2 {

	public static void main(String[] args) {

		// 方法体只有1句
		// 这一句方法体是直接操作参数
		// 这一句方法体是调用了已有类Math中的静态方法sqrt
		// 参数列表可以省略
		// Calculator c = d -> Math.sqrt(d);
		Calculator c = Math::sqrt;
		System.out.println(c.sqrt(9));

	}

}

interface Calculator {

	double sqrt(double d);

}