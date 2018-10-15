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

		// �������ڲ���ʹ�����ڵķ����е����ݵ�ʱ��
		// Ҫ��������Ե���һ������
		// ��JDK1.8��ʼ�������ڲ���ʹ�õ���ǰ�����е����ݵ�ʱ��
		// ��������Ĭ��Ϊ����
		// ��������ʽ����
		int j = 10;

		// �����ڲ���
		// ֻ���ڶ������ķ�����ʹ��
		// ����ʹ���ⲿ���е����Ժͷ���
		// ����ڲ�����ⲿ�������ͬ�����Ի��߷�������ʹ���ڲ����ж���
		// ֻ����abstract/final
		// �����ڲ����п��Զ���Ǿ�̬�����ԺͷǾ�̬����
		// ���ǲ��ܶ��徲̬�����;�̬����
		// Ȼ�����徲̬����
		class Inner1 extends Object implements Cloneable {

			int k = 8;
			static final int x = 7;

			public void m() {
				System.out.println("Inner~~~");
				i += 5;
				m2();
				// �ⲿ��.this.�ⲿ��ķ�����������
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
