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

	// ��ʾ����ǰ�ķ���������һ�������ķ���
	public <T> void m(T t) {
		System.out.println(t.getClass());
	}

}