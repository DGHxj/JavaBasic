package cn.tedu.object;

public class ConstructorCodeDemo {

	public static void main(String[] args) {

		// Baby b1 = new Baby();
		// Baby b2 = new Baby("����");

	}

}

// ����һ������Ӥ������
class Baby {

	String name;

	// ��������/��ʼ�������
	// ���������ĸ����췽���������󣬹������鶼�����ڹ��췽��ִ��
	// ���ÿһ�����췽���ж���һЩҪ��ʼ���Ĳ��������Խ�������ȡ������������ִ��
	{
		this.cry();
		this.eat();
	}

	public Baby() {
		System.out.println("running~~~");
	}

	public Baby(String name) {
		// this();
		this.name = name;
		// this.cry();
		// this.eat();
	}

	public void cry() {
		System.out.println("���Ӥ���������۵Ŀ�~~~");
	}

	public void eat() {
		System.out.println("���Ӥ���ڳ���~~~");
	}

}