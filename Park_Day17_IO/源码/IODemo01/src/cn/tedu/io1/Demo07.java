package cn.tedu.io1;


public class Demo07 {
	public static void main(String[] args) {
		//--�̳�
//		Man man = new Man("zs",19);
//		man.eat();
//		man.sleep();
//		
//		SuperMan1 sp = new SuperMan1("zs", 19);
//		sp.eat();
//		sp.sleep();
//		sp.fly();
		
		//--װ��
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
 * װ�����ģʽ
 */
class SuperMan2 implements Ani{
	private Man man = null; 
	public SuperMan2(Man man) {
		this.man = man;
	}
	@Override
	public void eat() {
		System.out.println("�Ƶ����һȦ����");
		man.eat();
		System.out.println("��̫ƽ������һȦ����");
	}
	@Override
	public void sleep() {
		man.sleep();
	}
	
	public void fly(){
		System.out.println(man.name + "�ɡ�����");
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
		System.out.println(name+"�ԡ�����");
	}
	public void sleep(){
		System.out.println(name+"˯������");
	}
	
}

/**
 * �̳з�ʽ
 */
class SuperMan1 extends Man{
	public SuperMan1() {
	}
	public SuperMan1(String name,int age){
		super(name,age);
	}
	
	public void fly(){
		System.out.println(super.name+"�ɡ�����");
	}
}