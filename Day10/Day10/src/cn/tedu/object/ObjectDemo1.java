package cn.tedu.object;

public class ObjectDemo1 implements Cloneable {

	int i;

	public static void main(String[] args) throws Exception {

		ObjectDemo1 od1 = new ObjectDemo1();

		od1.i = 7;

		// 表示克隆一个od1对象
		// 克隆之后的对象的属性值和原对象的属性值一样
		ObjectDemo1 od2 = (ObjectDemo1) od1.clone();
		// ObjectDemo1 od2 = od1;
		System.out.println(od2.i);
		System.out.println(od1);
		System.out.println(od2);
		
		Object o = "abc";
		// 获取的是对象的实际类型
		System.out.println(o.getClass());

	}

}
