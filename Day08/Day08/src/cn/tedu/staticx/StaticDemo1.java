package cn.tedu.staticx;

public class StaticDemo1 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// System.out.println(Student.classroom);

		Student s1 = new Student();
		s1.name = "����";
		s1.classroom = "����";

		Student s2 = new Student();
		s2.name = "������";
		s2.classroom = "�軨ɽׯ";

		s1.study();
		s2.study();

	}

}

// �������ѧ������
class Student {

	String name;
	int age;
	static String classroom;

	@SuppressWarnings("static-access")
	public void study() {
		System.out.println(this.name + "��" + this.classroom + "������ѧϰ~~~");
	}

}