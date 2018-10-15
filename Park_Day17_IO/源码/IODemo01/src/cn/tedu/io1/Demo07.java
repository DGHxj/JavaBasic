package cn.tedu.io1;


public class Demo07 {
	public static void main(String[] args) {
		//--继承
//		Man man = new Man("zs",19);
//		man.eat();
//		man.sleep();
//		
//		SuperMan1 sp = new SuperMan1("zs", 19);
//		sp.eat();
//		sp.sleep();
//		sp.fly();
		
		//--装饰
		Man man = new Man("ls",20);
		man.eat();
		man.sleep();
		
		SuperMan2 sman = new SuperMan2(man);
		sman.eat();
		sman.sleep();
		sman.fly();
	}
}

/**
 * 装饰设计模式
 */
class SuperMan2 implements Ani{
	private Man man = null; 
	public SuperMan2(Man man) {
		this.man = man;
	}
	@Override
	public void eat() {
		System.out.println("绕地球飞一圈。。");
		man.eat();
		System.out.println("到太平洋里游一圈。。");
	}
	@Override
	public void sleep() {
		man.sleep();
	}
	
	public void fly(){
		System.out.println(man.name + "飞。。。");
	}
}


interface Ani{
	public void eat();
	public void sleep();
}

class Man implements Ani{
	protected String name;
	protected int age;
	
	public Man() {
	}
	
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		System.out.println(name+"吃。。。");
	}
	public void sleep(){
		System.out.println(name+"睡。。。");
	}
	
}

/**
 * 继承方式
 */
class SuperMan1 extends Man{
	public SuperMan1() {
	}
	public SuperMan1(String name,int age){
		super(name,age);
	}
	
	public void fly(){
		System.out.println(super.name+"飞。。。");
	}
}