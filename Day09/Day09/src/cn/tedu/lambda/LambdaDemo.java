package cn.tedu.lambda;
/**
 * JDK1.8�������ԣ����õ�JDK1.7��ȥ������
 * @author DGHxj
 *
 */
public class LambdaDemo {

	public static void main(String[] args) {

		// �ӿ���ֻ������1�����󷽷�
		// ��������Lambda���ʽ����д��Ψһ��һ�����󷽷�
		Calc c = new Calc() {

			@Override
			public double add(double i, double j) {
				return i + j;
			}

		};

		// ��ʾ��дCalc�е�Ψһ��һ�����󷽷�add
		// Lambda���ʽֻ�������ں���ʽ�ӿ���
		 Calc c1 = (double a, double b) -> {
		 return a + b;
		 };
		// ������ֻ��һ�䣬����ʡ��{}��return��д
		// Ψһ��һ�䷽����ļ�����Ĭ��Ϊ��ǰ�����ķ���ֵ
		 Calc c2 = (double i, double j) -> i + j;

		// ��д����Calc�ӿ��еķ���add
		// add�����Ĳ����б����������֪��
		// ����ʡ�Բ������Ͳ�д
		// ����ʽ���
		Calc c3 = (x, y) -> x + y;

		System.out.println(c.add(5.8, 9.47));

	}

}

interface Calc {

	double add(double i, double j);

}
