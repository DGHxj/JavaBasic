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

	// ��̬�����
	// ֻ������أ���һ��ʹ�ã���ʱ��ִ��һ��
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