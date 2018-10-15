package cn.tedu.collection;

//import java.util.Comparator;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {

		// TreeSet<String> set = new TreeSet<String>();

		// �������Ȼ˳�����������򣩽�������
		// set.add("d");
		// set.add("g");
		// set.add("a");
		// set.add("r");
		// set.add("c");

		// System.out.println(set);

		TreeSet<Student> set = new TreeSet<Student>();
		// ���շ������н�������
		// TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>()
		// {
		//
		// @Override
		// public int compare(Student o1, Student o2) {
		// return o2.getScore() - o1.getScore();
		// }
		// });

		// Ҫ��set�е�Ԫ������Ӧ�������ʵ��Comparable
		set.add(new Student("��ëʨ��", 20, 59));
		set.add(new Student("��üӥ��", 50, 18));
		set.add(new Student("��������", 49, 89));
		set.add(new Student("��������", 38, 60));

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
	// ��������д��compareTo��
	// �������ʱ�����ݷ���ֵ��������ȷ��Ԫ�ص�����˳��
	// ���������һ����������ôthis�ͻ�����o֮��
	// ���������һ����������ôthis�ͻ�����o֮ǰ
	public int compareTo(Student o) {
		return this.age - o.age;
	}

}
