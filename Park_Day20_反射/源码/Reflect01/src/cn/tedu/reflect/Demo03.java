package cn.tedu.reflect;

import java.lang.reflect.Constructor;

/**
 * ���� - Class - ���췽�� Constructor
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		//1.��ȡ��������еĹ��й��췽��
//		Constructor[] cs = Person.class.getConstructors();
		
		//2.��ȡָ�����췽��
//		Constructor<Person> cons1 = Person.class.getConstructor();
//		Constructor<Person> cons2 = Person.class.getConstructor(String.class,int.class);
		
		//3.�ù��췽����������
//		Person p = cons2.newInstance("zs",19);
//		p.sleep();
		
		//4.����˽�й��췽��
		Constructor<Person> constructor = Person.class.getDeclaredConstructor(String.class);
		constructor.setAccessible(true);
		Person p = constructor.newInstance("ww");
		System.out.println(p.name);
	}
}
