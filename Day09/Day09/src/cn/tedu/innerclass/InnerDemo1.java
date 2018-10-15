package cn.tedu.innerclass;

public class InnerDemo1 {

	public static void main(String[] args) {

		new Outer1().m();

	}

}

class Outer1 {

	int i = 10;

	public void m() {
		System.out.println("Outer~~~");

		// 当方法内部类使用所在的方法中的数据的时候
		// 要求这个属性得是一个常量
		// 从JDK1.8开始，方法内部类使用到当前方法中的数据的时候
		// 将该数据默认为常量
		// 常量的隐式声明
		int j = 10;

		// 方法内部类
		// 只能在定义它的方法中使用
		// 可以使用外部类中的属性和方法
		// 如果内部类和外部类存在了同名属性或者方法，则使用内部类中定义
		// 只能用abstract/final
		// 方法内部类中可以定义非静态的属性和非静态方法
		// 但是不能定义静态变量和静态方法
		// 然而定义静态常量
		class Inner1 extends Object implements Cloneable {

			int k = 8;
			static final int x = 7;

			public void m() {
				System.out.println("Inner~~~");
				i += 5;
				m2();
				// 外部类.this.外部类的方法或者属性
				Outer1.this.m2();
				System.out.println(j);
				// j += 6;
				System.out.println(k);
				System.out.println(x);
			}

			public void m2() {
				System.out.println("Inner m2~~~");
			}
		}

		Inner1 i1 = new Inner1();
		i1.m();
	}

	public void m2() {
		System.out.println("Outer m2~~~");
	}

}
