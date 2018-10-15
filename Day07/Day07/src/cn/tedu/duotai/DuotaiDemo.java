package cn.tedu.duotai;

public class DuotaiDemo {

	public static void main(String[] args) {

		// 父类声明对象，用子类创建对象 --- 向上造型
		// 利用向上造型来创建的这个对象
		// 对象在编译过程中并不会检查到底使用的是哪个子类
		// 在编译期间只会检查声明类和实现类之间是否有继承关系
		// 直到运行的时候才会检查具体的子类然后根据子类来分配空间
		Pet p = new Cat();
		// 当使用向上造型来创建对象的时候，只能使用父类中声明的方法
		// 而不能使用子类中单独定义的方法
		// 但是方法的执行看的是具体的子类
		p.eat();

	}

}

class Pet {

	public void eat() {
		System.out.println("在吃东西~~~");
	}

}

class Cat extends Pet {

	@Override
	public void eat() {
		System.out.println("这只猫在吃草~~~");
	}

	public void catches() {
		System.out.println("这只猫在挠狗玩~~~");
	}

}

class Dog extends Pet {

	@Override
	public void eat() {
		System.out.println("这只狗在吃猫~~~");
	}

	public void bark() {
		System.out.println("这只狗在喵喵的叫~~~");
	}

}