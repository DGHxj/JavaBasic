package cn.tedu.reflect;

import java.lang.reflect.Field;

/**
 * ���� - Class - ��Ա���� Fields
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//1.��ȡPerson������г�Ա����
//		Field[] fields = Person.class.getFields();
		//2.��ȡPerson���ָ����Ա����
//		Field field = Person.class.getField("name");
		//3.��ȡ��������
//		Field field = Person.class.getField("name");
//		System.out.println(field.getName());
		//4.��ȡ���Ե�����
//		Field field = Person.class.getField("name");
//		System.out.println(field.getType());
		//5.��ȡ����ֵ
//		Person p = new Person("zs",19);
//		Field field = Person.class.getField("name");
//		String name = (String) field.get(p);
//		System.out.println(name);
		//6.��������ֵ
//		Person p = new Person("zs",19);
//		Field field = Person.class.getField("name");
//		field.set(p, "ls");
//		System.out.println(p.name);
		
		//7.����˽������
		Person p = new Person("zs",19);
		Field field = Person.class.getDeclaredField("age");
		field.setAccessible(true);
		int age = (int) field.get(p);
		System.out.println(age);
	}
}
