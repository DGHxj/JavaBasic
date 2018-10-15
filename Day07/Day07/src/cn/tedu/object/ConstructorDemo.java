package cn.tedu.object;

public class ConstructorDemo {

	public static void main(String[] args) {

		// 调用构造方法创建Person对象
		// Person p = new Person();
		Person p = new Person("翠花");
		p.name = "如花";
		p.eat();

	}

}

class Person {

	String name;
	int age;
	char gender;
	String no; // 身份证号

	// 构造方法 --- 创建对象
	// 在类中没有手动指定构造方法的时候，那么在编译的时候会自动添加一个无参的构造方法
	// 特点：没有返回值类型，与类同名
	// 构造方法可以构成重载
	public Person() {
	}

	// 在代码中手动指定了含参构造，那么就不会再默认添加无参构造
	public Person(String n) {
		// 遵循就近原则
		name = n;
	}

	// Person p = new Person("珠子", -18);
	// 构造方法中可以写return，用于规避一些不合常理的数据
	public Person(String n, int a) {
		name = n;
		if (a < 0)
			return;
		age = a;
	}

	public void eat() {
		System.out.println(name + "在吃东西~~~");
	}

}