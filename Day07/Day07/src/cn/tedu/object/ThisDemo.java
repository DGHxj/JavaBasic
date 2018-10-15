package cn.tedu.object;

public class ThisDemo {

	public static void main(String[] args) {

		Student s1 = new Student("Amy");
		System.out.println("s1:" + s1);
		Student s2 = new Student("Sam");
		System.out.println("s2:" + s2);

		s1.name = "Lily";

	}

}

class Student {

	String name;
	int age;
	String no; // ѧ��

	// ��this����һ������Ķ���
	// this����ǰ�ڻ�Ķ���
	// this�ڱ����е��ñ����е����Ժͷ���
	public Student(String name) {
		this.name = name;
		// System.out.println("this:" + this);
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String no) {

		// this.name = name;
		// this.age = age;
		// this���õ�ʱ����õ���ͨ�ķ��������ǹ��췽��
		// this.Student(name,age);
		// this(�����б�)--- this���
		// ��ʾ���ñ����ж�Ӧ��ʽ�Ĺ��췽��
		// this(name, age) -> Student(String, int);
		// ������ڹ��췽��������
		this(name, age);
		this.no = no;

	}

}