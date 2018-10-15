package cn.tedu.lambda;
/**
 * JDK1.8的新特性，别拿到JDK1.7上去丢人了
 * @author DGHxj
 *
 */
public class LambdaDemo {

	public static void main(String[] args) {

		// 接口中只定义了1个抽象方法
		// 可以利用Lambda表达式来重写这唯一的一个抽象方法
		Calc c = new Calc() {

			@Override
			public double add(double i, double j) {
				return i + j;
			}

		};

		// 表示重写Calc中的唯一的一个抽象方法add
		// Lambda表达式只能作用在函数式接口上
		 Calc c1 = (double a, double b) -> {
		 return a + b;
		 };
		// 方法体只有一句，可以省略{}和return不写
		// 唯一的一句方法体的计算结果默认为当前方法的返回值
		 Calc c2 = (double i, double j) -> i + j;

		// 重写的是Calc接口中的方法add
		// add方法的参数列表的类型是已知的
		// 可以省略参数类型不写
		// 函数式编程
		Calc c3 = (x, y) -> x + y;

		System.out.println(c.add(5.8, 9.47));

	}

}

interface Calc {

	double add(double i, double j);

}
