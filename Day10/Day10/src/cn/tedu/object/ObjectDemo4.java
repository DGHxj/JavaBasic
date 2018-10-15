package cn.tedu.object;

public class ObjectDemo4 {

	public static void main(String[] args) {

		// 不是内部类，不会产生class文件
		 Calc c = (i, j) -> i + j;
		 //Lambda表达式
		// Object c = (Calc) (i, j) -> i + j;

//		Calc c = new Calc() {
//
//			@Override
//			public double add(double i, double j) {
//				return i + j;
//			}
//		};
		System.out.println(c.add(1, 2));

	}

}

interface Calc {

	public double add(double i, double j);

}