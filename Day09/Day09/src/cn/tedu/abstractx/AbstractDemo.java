package cn.tedu.abstractx;

public class AbstractDemo {

	public static void main(String[] args) {

		// 不允许被实例化
		// Pet p = new Pet();
		// p.eat();

		// 创建了一个Pet所对应的匿名内部类的对象
		// Pet p = new Pet() {
		//
		// @Override
		// public void eat() {
		//
		// }
		// }; // 匿名内部类

	}

}

abstract class Animal {
}

// 抽象类
abstract class Pet {

	public Pet() {
	}

	// 抽象类中可以定义一切方法
	// 抽象方法
	// Pet.eat();
	public abstract void eat();

	public void drink() {
		System.out.println("在喝水中~~~");
	}

}

// 子类继承抽象类之后必须重写其中的抽象方法,除非子类也是抽象类
abstract class Cat extends Pet {

}

class Dog extends Pet {

	@Override
	public void eat() {
		System.out.println("这只狗在吃猫~~~");
	}

}