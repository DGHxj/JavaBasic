package cn.tedu.duotai;

public class DuotaiDemo {

	public static void main(String[] args) {

		// �����������������ഴ������ --- ��������
		// ���������������������������
		// �����ڱ�������в������鵽��ʹ�õ����ĸ�����
		// �ڱ����ڼ�ֻ�����������ʵ����֮���Ƿ��м̳й�ϵ
		// ֱ�����е�ʱ��Ż�����������Ȼ���������������ռ�
		Pet p = new Cat();
		// ��ʹ���������������������ʱ��ֻ��ʹ�ø����������ķ���
		// ������ʹ�������е�������ķ���
		// ���Ƿ�����ִ�п����Ǿ��������
		p.eat();

	}

}

class Pet {

	public void eat() {
		System.out.println("�ڳԶ���~~~");
	}

}

class Cat extends Pet {

	@Override
	public void eat() {
		System.out.println("��ֻè�ڳԲ�~~~");
	}

	public void catches() {
		System.out.println("��ֻè���ӹ���~~~");
	}

}

class Dog extends Pet {

	@Override
	public void eat() {
		System.out.println("��ֻ���ڳ�è~~~");
	}

	public void bark() {
		System.out.println("��ֻ���������Ľ�~~~");
	}

}