package cn.tedu.fengzhuang;

public class DriverDemo {

	public static void main(String[] args) {

		Driver d = new Driver();
		// d.name = "Bob";
		// d.age = -28;
		d.setAge(-24);
		System.out.println(d.getAge());

	}

}

class Driver {

	private String name;
	private /* Ë½ÓĞµÄ */int age;
	private String no;
	private char gender;

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
		if (age >= 18 && age <= 70)
			this.age = age;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
