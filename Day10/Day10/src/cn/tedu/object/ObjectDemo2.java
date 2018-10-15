package cn.tedu.object;

public class ObjectDemo2 {

	public static void main(String[] args) {

		// hashCode --- 哈希码
		// 哈希码是根据哈希散列算法计算出来的
		// 哈希散列算法保证同一个类产生的对象的哈希码能够是散列且比较均匀的分布在43亿值上
		// 产生重合的概率是相对较小的，因此人为的认为对象的哈希码是唯一的
		// 在存储对象的时候会将对象的哈希码作为元素的内存地址表示
		// System.out.println(new Object().hashCode());
		// System.out.println(new Object().hashCode());
		// System.out.println(new Object().hashCode());
		// System.out.println(new Object().hashCode());

		Object o = new Object();
		// 默认是打印对象的 类型@地址 的形式
		System.out.println(o.toString());
		// 直接打印对象是在底层调用了对象的toString
		System.out.println(o);

		Student s = new Student();
		System.out.println(s);

	}

}

class Student {

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
		return "Student [name=" + name + ", age=" + age + "]";
	}

	// @Override
	// public String toString() {
	// return "name:" + name + "\r\nage:" + age;
	// }

}
