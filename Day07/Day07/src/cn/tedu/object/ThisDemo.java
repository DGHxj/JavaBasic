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
	String no; // 学号

	// 用this代替一个具体的对象
	// this代表当前在活动的对象
	// this在本类中调用本类中的属性和方法
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
		// this调用的时候调用的普通的方法而不是构造方法
		// this.Student(name,age);
		// this(参数列表)--- this语句
		// 表示调用本类中对应形式的构造方法
		// this(name, age) -> Student(String, int);
		// 必须放在构造方法的首行
		this(name, age);
		this.no = no;

	}

}