package cn.tedu.reflect;

import java.lang.reflect.Field;

/**
 * 反射 - Class - 成员属性 Fields
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//1.获取Person类的所有成员属性
//		Field[] fields = Person.class.getFields();
		//2.获取Person类的指定成员属性
//		Field field = Person.class.getField("name");
		//3.获取属性名称
//		Field field = Person.class.getField("name");
//		System.out.println(field.getName());
		//4.获取属性的类型
//		Field field = Person.class.getField("name");
//		System.out.println(field.getType());
		//5.获取属性值
//		Person p = new Person("zs",19);
//		Field field = Person.class.getField("name");
//		String name = (String) field.get(p);
//		System.out.println(name);
		//6.设置属性值
//		Person p = new Person("zs",19);
//		Field field = Person.class.getField("name");
//		field.set(p, "ls");
//		System.out.println(p.name);
		
		//7.访问私有属性
		Person p = new Person("zs",19);
		Field field = Person.class.getDeclaredField("age");
		field.setAccessible(true);
		int age = (int) field.get(p);
		System.out.println(age);
	}
}
