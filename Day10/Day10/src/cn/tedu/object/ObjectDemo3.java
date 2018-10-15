package cn.tedu.object;

public class ObjectDemo3 {

	public static void main(String[] args) {

		Person p1 = new Person();
		// p1.name = "Amy";
		p1.name = null;
		p1.age = 15;
		p1.gender = '女';

		Person p2 = new Person();
		p2.name = null;
		p2.age = 15;
		p2.gender = '女';

		// 底层默认使用==进行比较 --- 比较两个对象的地址是否一样
		System.out.println(p1.equals(p2));

	}

}

class Person {

	String name;
	int age;
	char gender;

	@Override
	public boolean equals(Object obj) {

		// 判断地址是否一样
		if (this == obj)
			return true;

		// 判断参数是否为空
		if (obj == null)
			return false;

		// 判断类型是否一致
		if (this.getClass() != obj.getClass())
			return false;

		// 判断属性值
		Person p = (Person) obj;

		// 判断属性age是否一致
		if (this.age != p.age)
			return false;

		// 判断属性gender是否一致
		if (this.gender != p.gender)
			return false;

		// 判断属性name是否一致
		if (this.name == null) {
			if (p.name != null)
				return false;
		} else if (!this.name.equals(p.name))
			return false;

		return true;
	}

}