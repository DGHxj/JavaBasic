package cn.tedu.extendsx;

public class ExtendsDemo {

	public static void main(String[] args) {

		Cat c = new Cat();
		// ͨ���̳У��������ʹ�ø����ж����һ�������Ժͷ���
		c.eat();

	}

}

// ����
class Pet {

	String name;
	String color;

	public Pet(String name) {
	}

	public Pet(String name, String color) {
	}

	public void eat() {
		System.out.println("�ڳԶ���~~~");
	}

}

// ����extends�ؼ�����ԭ����������ȡ�������µ����������ϵ --- �̳�
// ����
class Cat extends Pet {

	public Cat() {
		// �����๹�췽���У����û���ֶ�ָ������ôĬ�����super()
		// super��� --- ��ʾ���ø����ж�Ӧ��ʽ�Ĺ��췽��
		// super() --- Pet()
		// ���������ֻ�ṩ�˺��ι���
		// ��ô�����оͱ����ֶ��ṩ��Ӧ��ʽ��super���
		// super��������ڹ��췽���ĵ�һ��
		super("��˹è");
	}

	public void drink() {
		// ͨ��super���������
		// ͨ�����������ø����еķ���������
		super.eat();
		System.out.println("���궫���ȵ�ˮ~~~");
	}

	public void catches() {
		System.out.println("��ֻè����ɳ����~~~");
	}

}

class Dog extends Pet {

	public Dog() {
		// super("��ë", "��ɫ");
		super("����");
		super.color = "��ɫ";
	}

	public void bark() {
		System.out.println("��ֻ���ڽ�~~~");
	}

}