package cn.tedu.object;

public class PersonDemo {

	public static void main(String[] args) {

		// ����new�ؼ��ִ�����һ��Person����
		Person p = new Person();

		// ��ʾ������p������name���и�ֵ
		p.name = "����";
		// ��ʾ������p������age���и�ֵ
		p.age = 66;
		// 0��ʾŮ����1��ʾ����
		p.gender = 0;

		// ��ӡp������height��ֵ
		System.out.println(p.weight);

		p.sleep();
		// ��ʾ��p����ȥִ��eat����
		p.eat();

	}

}

// ����һ�������˵���
class Person {

	// ���˵�����������/��Ա��������ʾ
	String name; // ����
	int age; // ����
	byte gender; // �Ա�
	double height; // ���
	double weight; // ����

	// ���˵���Ϊ�÷�����ʾ
	// ��ʾ�Ե���Ϊ
	public void eat() {
		System.out.println(name + "�ڳԶ���~~~");
	}

	// ��ʾ˯����Ϊ
	public void sleep() {
		// �ֲ�����
		String tool = "��";
		System.out.println(name + "��" + tool + "��˯��~~~");
	}

}