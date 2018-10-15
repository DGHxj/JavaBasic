package cn.tedu.newfeature;

class Live{}
class Person extends Live{}
class Teacher extends Person{}
class BigTeacher extends Teacher{}
class Dog extends Live{}
class Cat extends Live{}
class Table{}

class God<T extends Live>{
	public static <T> void xiaban(T t){
		
	}
	
	public T kill(T t){
		System.out.println("上帝弄死了"+t);
		return t;
	}
	
	public T save(T t){
		System.out.println("上帝弄活了"+t);
		return t;
	}
}

public class Demo09 {
	public static void main(String[] args) {
		God<Person> personGod = new God<Person>();
		Person p = personGod.kill(new Person());
		p = personGod.save(p);
		
		God<Dog> dogGod = new God<Dog>();
		Dog dog = dogGod.kill(new Dog());
		dogGod.save(dog);
		
//		God<Table> tableGod = new God<>();
//		Table tab = tableGod.kill(new Table());
//		tab = tableGod.save(tab);
	}
}
