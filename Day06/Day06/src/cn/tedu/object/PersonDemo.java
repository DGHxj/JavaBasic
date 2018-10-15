package cn.tedu.object;

public class PersonDemo {

	public static void main(String[] args) {

		// 利用new关键字创建了一个Person对象
		Person p = new Person();

		// 表示给对象p的属性name进行赋值
		p.name = "秋香";
		// 表示给对象p的属性age进行赋值
		p.age = 66;
		// 0表示女生，1表示男生
		p.gender = 0;

		// 打印p的属性height的值
		System.out.println(p.weight);

		p.sleep();
		// 表示让p对象去执行eat方法
		p.eat();

	}

}

// 定义一个代表人的类
class Person {

	// 将人的特征用属性/成员变量来表示
	String name; // 姓名
	int age; // 年龄
	byte gender; // 性别
	double height; // 身高
	double weight; // 体重

	// 将人的行为用方法表示
	// 表示吃的行为
	public void eat() {
		System.out.println(name + "在吃东西~~~");
	}

	// 表示睡的行为
	public void sleep() {
		// 局部变量
		String tool = "床";
		System.out.println(name + "在" + tool + "上睡觉~~~");
	}

}