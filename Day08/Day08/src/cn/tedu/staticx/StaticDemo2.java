package cn.tedu.staticx;

public class StaticDemo2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// B.m();
		// �����ɾ�̬���������ص�ʱ�򣬷�����ִ�п�����������
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