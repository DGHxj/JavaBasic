package cn.tedu.interfacex;

public class InterfaceDemo3 {
	
	public static void main(String[] args) {
		
		E e = new E();
		e.max(3, 7);
//		Calc c=new Calc() {
//			
//			@Override
//			public double add(double i, double j) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		System.out.println(Calc.min(3, 4));
	}

}

// 如果一个接口中只定义了一个抽象方法，那么把这个接口声明为函数式接口
// 函数式接口用@FunctionalInteface
@FunctionalInterface
interface Calc {

	public double add(double i, double j);

	// 接口中的默认方法 --- 默认是public
	public default double max(double i, double j) {
		return i > j ? i : j;
	}

	public static double min(double i, double j) {
		return i < j ? i : j;
	}

}

class E implements Calc  {

	@Override
	public double add(double i, double j) {
		return i + j;
	}
	
}