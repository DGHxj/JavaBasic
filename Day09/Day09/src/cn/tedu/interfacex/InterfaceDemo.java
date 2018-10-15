package cn.tedu.interfacex;

import java.io.Serializable;

public class InterfaceDemo {

	public static void main(String[] args) {

		// �ӿڲ�����ʵ����
		// Shape s = new Shape();
		System.out.println(Shape.girth);

	}

}

interface Shape extends Cloneable, Serializable {

	// Ĭ���� public static final ����
	static public final double girth = 0;

	// public Shape(){}

	// �ӿ��еķ���Ĭ��public abstract����
	double getGirth();

	public double getArea();

}

// ����implements�ؼ�������ͽӿڲ�������ϵ --- ʵ��
// Rectangleʵ����Shape�ӿ�
@SuppressWarnings("serial")
class Rectangle implements Shape, Cloneable {

	@Override
	public double getGirth() {
		return 0;
	}

	@Override
	public double getArea() {
		return 0;
	}
}