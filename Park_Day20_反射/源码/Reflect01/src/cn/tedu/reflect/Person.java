package cn.tedu.reflect;

interface live{}
class Ani{}

public class Person extends Ani implements live {
	public String name;
	private int age;

	public Person() {
	}
	
	private Person(String name){
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void eat(String food,int count){
		System.out.println(name+"�������ĳԡ���"+count+"�ݡ�"+food);
	}
	public void sleep(){
		System.out.println(name+"��������˯������");
	}
	private void study(){
		System.out.println("͵͵������ѧϰ������");
	}
}
