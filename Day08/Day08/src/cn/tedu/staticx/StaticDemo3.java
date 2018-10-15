package cn.tedu.staticx;

public class StaticDemo3 {

	public static void main(String[] args) {

		new C();
		// new C();
		// C.m();
		// C.m();

	}

}

class C {

	// 静态代码块
	// 只在类加载（第一次使用）的时候执行一次
	static {
		System.out.println("C");
	}

	{
		System.out.println("C 2");
	}

	public C() {
		System.out.println("C 3");
	}

	public static void m() {
		System.out.println("running~~~");
	}

}