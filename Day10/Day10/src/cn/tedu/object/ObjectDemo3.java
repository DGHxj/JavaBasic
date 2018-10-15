package cn.tedu.object;

public class ObjectDemo3 {

	public static void main(String[] args) {

		Person p1 = new Person();
		// p1.name = "Amy";
		p1.name = null;
		p1.age = 15;
		p1.gender = 'Ů';

		Person p2 = new Person();
		p2.name = null;
		p2.age = 15;
		p2.gender = 'Ů';

		// �ײ�Ĭ��ʹ��==���бȽ� --- �Ƚ���������ĵ�ַ�Ƿ�һ��
		System.out.println(p1.equals(p2));

	}

}

class Person {

	String name;
	int age;
	char gender;

	@Override
	public boolean equals(Object obj) {

		// �жϵ�ַ�Ƿ�һ��
		if (this == obj)
			return true;

		// �жϲ����Ƿ�Ϊ��
		if (obj == null)
			return false;

		// �ж������Ƿ�һ��
		if (this.getClass() != obj.getClass())
			return false;

		// �ж�����ֵ
		Person p = (Person) obj;

		// �ж�����age�Ƿ�һ��
		if (this.age != p.age)
			return false;

		// �ж�����gender�Ƿ�һ��
		if (this.gender != p.gender)
			return false;

		// �ж�����name�Ƿ�һ��
		if (this.name == null) {
			if (p.name != null)
				return false;
		} else if (!this.name.equals(p.name))
			return false;

		return true;
	}

}