package cn.tedu.extendsx;

public class ExtendsDemo {

	public static void main(String[] args) {

		Cat c = new Cat();
		// 通过继承，子类可以使用父类中定义的一部分属性和方法
		c.eat();

	}

}

// 父类
class Pet {

	String name;
	String color;

	public Pet(String name) {
	}

	public Pet(String name, String color) {
	}

	public void eat() {
		System.out.println("在吃东西~~~");
	}

}

// 利用extends关键字让原来的类与提取出来的新的类产生了联系 --- 继承
// 子类
class Cat extends Pet {

	public Cat() {
		// 在子类构造方法中，如果没有手动指定，那么默认添加super()
		// super语句 --- 表示调用父类中对应形式的构造方法
		// super() --- Pet()
		// 如果父类中只提供了含参构造
		// 那么子类中就必须手动提供对应形式的super语句
		// super语句必须放在构造方法的第一行
		super("波斯猫");
	}

	public void drink() {
		// 通过super代表父类对象
		// 通过父类对象调用父类中的方法和属性
		super.eat();
		System.out.println("吃完东西喝点水~~~");
	}

	public void catches() {
		System.out.println("这只猫在挠沙发玩~~~");
	}

}

class Dog extends Pet {

	public Dog() {
		// super("金毛", "绿色");
		super("二哈");
		super.color = "黑色";
	}

	public void bark() {
		System.out.println("这只狗在叫~~~");
	}

}