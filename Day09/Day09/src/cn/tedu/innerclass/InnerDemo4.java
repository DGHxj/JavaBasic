package cn.tedu.innerclass;

public class InnerDemo4 {

	public static void main(String[] args) {

		// 匿名内部类
		// a是匿名内部类产生的对象
		// 匿名内部类实际上是实现了对应的接口
		A a = new A() {

			@Override
			public void m() {
				System.out.println("running~~~");
			}

			@Override
			public void m2() {

			}
		};
		a.m();
		// 匿名内部类实际上是继承了对应的类
		B b = new B() {

			@Override
			public void m() {
				System.out.println("running~~~");
			}
		};
		b.m();

		// C c = new C() {
		// };
	}

}

interface A {

	void m();

	void m2();
}

abstract class B {

	public abstract void m();
}

final class C {
}