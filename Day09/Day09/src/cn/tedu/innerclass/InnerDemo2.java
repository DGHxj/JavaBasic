package cn.tedu.innerclass;

public class InnerDemo2 {

	public static void main(String[] args) {

		// Outer2 o2 = new Outer2();
		// System.out.println(o2.i);
		// o2.m();
		Outer2.Inner2 oi2 = new Outer2().new Inner2();
		System.out.println(oi2.j);

	}

}

class Outer2 {

	public int i = 3;

	// Inner2 i2 = new Inner2();

	// ��Ա�ڲ���
	// ����ʹ���ⲿ���е����Ժͷ���
	// ���Զ���Ǿ�̬���ԺͷǾ�̬����
	// ���ǲ��ܶ��徲̬�����;�̬����
	// Ȼ�����徲̬����
	class Inner2 {

		int j = 10;
		static final int k = 8;

		public void m() {
			i += 3;
			Outer2.this.m();
		}

	}

	public void m() {
		System.out.println("Outer");
	}

}