package cn.tedu.innerclass;

public class InnerDemo4 {

	public static void main(String[] args) {

		// �����ڲ���
		// a�������ڲ�������Ķ���
		// �����ڲ���ʵ������ʵ���˶�Ӧ�Ľӿ�
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
		// �����ڲ���ʵ�����Ǽ̳��˶�Ӧ����
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