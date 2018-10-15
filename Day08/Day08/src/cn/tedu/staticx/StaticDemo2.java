package cn.tedu.staticx;

public class StaticDemo2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// B.m();
		// 当构成静态方法的隐藏的时候，方法的执行看的是声明类
		A a = new B();
		a.m();
	}

}

class A {

	public static void m() {
		System.out.println("A ~~~");
	}

}

class B extends A {

	public static void m() {
		System.out.println("B ~~~");
	}
}