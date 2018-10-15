package cn.tedu.string;

public class StringDemo6 {
	
	public static void main(String[] args) {
		
		// String.valueOf表示将参数转化为字符串
		System.out.println(String.valueOf(4));
		
		// 打印对象的时候是先调用了String.valueOf方法
		// 将对象转化为字符串的时候实际上最底层调用了toString
		Object o = new Object();
		System.out.println(String.valueOf(o));
		System.out.println(o);
		
		char[] cs = {'a','d','f','e'};
		System.out.println(cs);
		// 底层是将字符数组转化为字符串
		System.out.println(String.valueOf(cs));
		System.out.println(cs.toString());
	}

}
