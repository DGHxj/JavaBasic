package cn.tedu.object;

public class ObjectDemo2 {

	public static void main(String[] args) {

		// hashCode --- ��ϣ��
		// ��ϣ���Ǹ��ݹ�ϣɢ���㷨���������
		// ��ϣɢ���㷨��֤ͬһ��������Ķ���Ĺ�ϣ���ܹ���ɢ���ұȽϾ��ȵķֲ���43��ֵ��
		// �����غϵĸ�������Խ�С�ģ������Ϊ����Ϊ����Ĺ�ϣ����Ψһ��
		// �ڴ洢�����ʱ��Ὣ����Ĺ�ϣ����ΪԪ�ص��ڴ��ַ��ʾ
		// System.out.println(new Object().hashCode());
		// System.out.println(new Object().hashCode());
		// System.out.println(new Object().hashCode());
		// System.out.println(new Object().hashCode());

		Object o = new Object();
		// Ĭ���Ǵ�ӡ����� ����@��ַ ����ʽ
		System.out.println(o.toString());
		// ֱ�Ӵ�ӡ�������ڵײ�����˶����toString
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
