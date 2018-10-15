package cn.tedu.reflect;

/**
 * 反射 - Class - 获取Class
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.通过对象的getClass()来获取
		Person p = new Person();
		Class clz1 = p.getClass();
		
		//2.类名.class来获取
		Class clz2 = Person.class;
		
		//3.通过Class.forName()来获取
		Class clz3 = Class.forName("cn.tedu.reflect.Person");
		
		//--同一个类获取多次Class得到的是一个对象
		System.out.println(clz1 == clz2);
		System.out.println(clz2 == clz3);
	}
}
