package cn.tedu.collection;

//import java.util.Comparator;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {

		// TreeSet<String> set = new TreeSet<String>();

		// 会根据自然顺序（往往是升序）进行排序
		// set.add("d");
		// set.add("g");
		// set.add("a");
		// set.add("r");
		// set.add("c");

		// System.out.println(set);

		TreeSet<Student> set = new TreeSet<Student>();
		// 按照分数进行降序排序
		// TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>()
		// {
		//
		// @Override
		// public int compare(Student o1, Student o2) {
		// return o2.getScore() - o1.getScore();
		// }
		// });

		// 要求set中的元素所对应的类必须实现Comparable
		set.add(new Student("金毛狮王", 20, 59));
		set.add(new Student("白眉鹰王", 50, 18));
		set.add(new Student("紫衫龙王", 49, 89));
		set.add(new Student("青翼蝠王", 38, 60));

		for (Student s : set) {
			System.out.println(s);
		}

	}

}

class Student implements Comparable<Student> {

	private String name;
	private int age;
	private int score;

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	// 排序规则就写在compareTo中
	// 在排序的时候会根据返回值的正负来确定元素的排序顺序
	// 如果返回了一个正数，那么this就会排在o之后
	// 如果返回了一个负数，那么this就会排在o之前
	public int compareTo(Student o) {
		return this.age - o.age;
	}

}
