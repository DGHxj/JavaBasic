package cn.tedu.abstractx;

public class AbstractDemo {

	public static void main(String[] args) {

		// ������ʵ����
		// Pet p = new Pet();
		// p.eat();

		// ������һ��Pet����Ӧ�������ڲ���Ķ���
		// Pet p = new Pet() {
		//
		// @Override
		// public void eat() {
		//
		// }
		// }; // �����ڲ���

	}

}

abstract class Animal {
}

// ������
abstract class Pet {

	public Pet() {
	}

	// �������п��Զ���һ�з���
	// ���󷽷�
	// Pet.eat();
	public abstract void eat();

	public void drink() {
		System.out.println("�ں�ˮ��~~~");
	}

}

// ����̳г�����֮�������д���еĳ��󷽷�,��������Ҳ�ǳ�����
abstract class Cat extends Pet {

}

class Dog extends Pet {

	@Override
	public void eat() {
		System.out.println("��ֻ���ڳ�è~~~");
	}

}