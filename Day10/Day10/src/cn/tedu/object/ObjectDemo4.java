package cn.tedu.object;

public class ObjectDemo4 {

	public static void main(String[] args) {

		// �����ڲ��࣬�������class�ļ�
		 Calc c = (i, j) -> i + j;
		 //Lambda���ʽ
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