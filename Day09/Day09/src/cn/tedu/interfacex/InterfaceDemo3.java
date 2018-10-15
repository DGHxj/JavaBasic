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

// ���һ���ӿ���ֻ������һ�����󷽷�����ô������ӿ�����Ϊ����ʽ�ӿ�
// ����ʽ�ӿ���@FunctionalInteface
@FunctionalInterface
interface Calc {

	public double add(double i, double j);

	// �ӿ��е�Ĭ�Ϸ��� --- Ĭ����public
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