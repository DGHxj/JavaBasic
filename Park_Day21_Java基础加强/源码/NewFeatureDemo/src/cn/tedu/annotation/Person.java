package cn.tedu.annotation;

@First(addrs = { "bj","sh","gz" }, age = 19, name = "zs")
public class Person {
	@First("US")
	private String name;
	public Person() {
	}
	@First(addrs="sz")
	public void say(){
		System.out.println("˵...");
	}
	public void eat(){
		String food = "���⴮";
		System.out.println("��"+food);
	}
}
