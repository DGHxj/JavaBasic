package cn.tedu.exception;

public class ExceptionDemo7 {

	public static void main(String[] args) {
		System.out.println(m());
	}

	public static Person m() {

		Person p = new Person();

		try {
			p.setName("如花");
			p.setAge(80);
			// p是对象，所以return的是p的地址
			return p;
		} finally {
			p.setName("周星星");
			p.setAge(18);
		}

	}

}

class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}