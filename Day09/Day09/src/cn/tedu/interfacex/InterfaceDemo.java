package cn.tedu.interfacex;

import java.io.Serializable;

public class InterfaceDemo {

	public static void main(String[] args) {

		// 接口不允许实例化
		// Shape s = new Shape();
		System.out.println(Shape.girth);

	}

}

interface Shape extends Cloneable, Serializable {

	// 默认用 public static final 修饰
	static public final double girth = 0;

	// public Shape(){}

	// 接口中的方法默认public abstract修饰
	double getGirth();

	public double getArea();

}

// 利用implements关键字让类和接口产生了联系 --- 实现
// Rectangle实现了Shape接口
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