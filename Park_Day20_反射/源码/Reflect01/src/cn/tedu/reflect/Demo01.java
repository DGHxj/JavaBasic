package cn.tedu.reflect;

/**
 * ���� - Class - ��ȡClass
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.ͨ�������getClass()����ȡ
		Person p = new Person();
		Class clz1 = p.getClass();
		
		//2.����.class����ȡ
		Class clz2 = Person.class;
		
		//3.ͨ��Class.forName()����ȡ
		Class clz3 = Class.forName("cn.tedu.reflect.Person");
		
		//--ͬһ�����ȡ���Class�õ�����һ������
		System.out.println(clz1 == clz2);
		System.out.println(clz2 == clz3);
	}
}
