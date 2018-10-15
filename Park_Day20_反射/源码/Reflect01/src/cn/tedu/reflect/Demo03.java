package cn.tedu.reflect;

import java.lang.reflect.Constructor;

/**
 * 反射 - Class - 构造方法 Constructor
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		//1.获取该类的所有的公有构造方法
//		Constructor[] cs = Person.class.getConstructors();
		
		//2.获取指定构造方法
//		Constructor<Person> cons1 = Person.class.getConstructor();
//		Constructor<Person> cons2 = Person.class.getConstructor(String.class,int.class);
		
		//3.用构造方法创建对象
//		Person p = cons2.newInstance("zs",19);
//		p.sleep();
		
		//4.访问私有构造方法
		Constructor<Person> constructor = Person.class.getDeclaredConstructor(String.class);
		constructor.setAccessible(true);
		Person p = constructor.newInstance("ww");
		System.out.println(p.name);
	}
}
