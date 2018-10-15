package cn.tedu.reflect;

/**
 * Class类的普通方法
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.cast()
		Object obj = new Person("zs",19);
		Person p1 = (Person) obj;
		Person p2 = Person.class.cast(obj);
		
		//2.getInterfaces() 
		Class<?>[] intfs = Person.class.getInterfaces();
		for(Class intf : intfs){
			System.out.println(intf.getName());
		}
		
		//3.getSuperclass() 
		System.out.println(Person.class.getSuperclass());
		
		//4.getPackage() 
		System.out.println(Person.class.getPackage().getName());
		
		//5.getName() getSimpleName()
		System.out.println(Person.class.getName());
		System.out.println(Person.class.getSimpleName());
		
		//6.newInstance()
		Person p = Person.class.newInstance();
		p.sleep();
	}
}
