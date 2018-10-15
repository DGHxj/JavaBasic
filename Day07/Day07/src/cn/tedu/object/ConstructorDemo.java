package cn.tedu.object;

public class ConstructorDemo {

	public static void main(String[] args) {

		// ���ù��췽������Person����
		// Person p = new Person();
		Person p = new Person("�仨");
		p.name = "�绨";
		p.eat();

	}

}

class Person {

	String name;
	int age;
	char gender;
	String no; // ���֤��

	// ���췽�� --- ��������
	// ������û���ֶ�ָ�����췽����ʱ����ô�ڱ����ʱ����Զ����һ���޲εĹ��췽��
	// �ص㣺û�з���ֵ���ͣ�����ͬ��
	// ���췽�����Թ�������
	public Person() {
	}

	// �ڴ������ֶ�ָ���˺��ι��죬��ô�Ͳ�����Ĭ������޲ι���
	public Person(String n) {
		// ��ѭ�ͽ�ԭ��
		name = n;
	}

	// Person p = new Person("����", -18);
	// ���췽���п���дreturn�����ڹ��һЩ���ϳ��������
	public Person(String n, int a) {
		name = n;
		if (a < 0)
			return;
		age = a;
	}

	public void eat() {
		System.out.println(name + "�ڳԶ���~~~");
	}

}