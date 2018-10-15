package cn.tedu.type;

public class TypeDemo3 {

	public static void main(String[] args) {

		A a = new A();
		a.m(5);
		a.m(true);
		a.m("def");

	}

}

class A {

	// 表示给当前的方法定义了一个单独的泛型
	public <T> void m(T t) {
		System.out.println(t.getClass());
	}

}