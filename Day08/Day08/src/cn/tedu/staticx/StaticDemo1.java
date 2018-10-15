package cn.tedu.staticx;

public class StaticDemo1 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// System.out.println(Student.classroom);

		Student s1 = new Student();
		s1.name = "段誉";
		s1.classroom = "大理";

		Student s2 = new Student();
		s2.name = "王语嫣";
		s2.classroom = "茶花山庄";

		s1.study();
		s2.study();

	}

}

// 定义代表学生的类
class Student {

	String name;
	int age;
	static String classroom;

	@SuppressWarnings("static-access")
	public void study() {
		System.out.println(this.name + "在" + this.classroom + "教室中学习~~~");
	}

}