package cn.tedu.object;

public class ConstructorCodeDemo {

	public static void main(String[] args) {

		// Baby b1 = new Baby();
		// Baby b2 = new Baby("铁蛋");

	}

}

// 定义一个代表婴儿的类
class Baby {

	String name;

	// 构造代码块/初始化代码块
	// 无论利用哪个构造方法创建对象，构造代码块都会先于构造方法执行
	// 如果每一个构造方法中都有一些要初始化的操作，可以将它们提取到构造代码块中执行
	{
		this.cry();
		this.eat();
	}

	public Baby() {
		System.out.println("running~~~");
	}

	public Baby(String name) {
		// this();
		this.name = name;
		// this.cry();
		// this.eat();
	}

	public void cry() {
		System.out.println("这个婴儿在哇哇哇的哭~~~");
	}

	public void eat() {
		System.out.println("这个婴儿在吃奶~~~");
	}

}