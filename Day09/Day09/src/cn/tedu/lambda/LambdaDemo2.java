package cn.tedu.lambda;

public class LambdaDemo2 {

	public static void main(String[] args) {

		// ������ֻ��1��
		// ��һ�䷽������ֱ�Ӳ�������
		// ��һ�䷽�����ǵ�����������Math�еľ�̬����sqrt
		// �����б����ʡ��
		// Calculator c = d -> Math.sqrt(d);
		Calculator c = Math::sqrt;
		System.out.println(c.sqrt(9));

	}

}

interface Calculator {

	double sqrt(double d);

}