package cn.tedu.reflect;

import java.lang.reflect.Method;

/**
 * ���� - Class - ��Ա���� Method
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		//1.��ȡ�������еĳ�Ա����
//		Method[] methods = Person.class.getMethods();
		//2.��ȡ����ָ���ĳ�Ա����
//		Method method = Person.class.getMethod("eat", String.class,int.class);
		//3.��ȡ������ ��ȡ����ֵ����
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
		//4.ִ�з���
//		Person p = new Person("zs",19);
//		Method method = Person.class.getMethod("eat", String.class,int.class);
//		method.invoke(p, "���⴮",10);
		
		//5.����˽�з���
		Person p = new Person("zs",19);
		Method method = Person.class.getDeclaredMethod("study", null);
		method.setAccessible(true);
		method.invoke(p, null);
	}
}
