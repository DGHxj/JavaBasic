package cn.tedu.reflect;

import java.lang.reflect.Method;

/**
 * 反射 - Class - 成员方法 Method
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		//1.获取类上所有的成员方法
//		Method[] methods = Person.class.getMethods();
		//2.获取类上指定的成员方法
//		Method method = Person.class.getMethod("eat", String.class,int.class);
		//3.获取方法名 获取返回值类型
//		Method[] methods = Person.class.getMethods();
//		for(Method method : methods){
//			System.out.println(method.getName());
//			System.out.println(method.getReturnType());
//			Class<?>[] parameterTypes = method.getParameterTypes();
//			for(Class pt : parameterTypes){
//				System.out.println(pt.getName());
//			}
//			System.out.println("----");
//		}
		//4.执行方法
//		Person p = new Person("zs",19);
//		Method method = Person.class.getMethod("eat", String.class,int.class);
//		method.invoke(p, "羊肉串",10);
		
		//5.操作私有方法
		Person p = new Person("zs",19);
		Method method = Person.class.getDeclaredMethod("study", null);
		method.setAccessible(true);
		method.invoke(p, null);
	}
}
