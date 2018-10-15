package cn.tedu.innerclass;

public class InnerDemo3 {

	public static void main(String[] args) {

		Outer3.Inner3 oi3 = new Outer3.Inner3();
		oi3.m();
	}

}

class Outer3 {

	int i = 0;

	// 静态内部类
	// 只能使用外部类中的静态属性和静态方法
	// 静态内部类中可以定义一切的方法和属性
	static class Inner3 {

		int j = 8;
		static int k = 4;

		public void m() {
			// System.out.println(i);
		}

	}

}
