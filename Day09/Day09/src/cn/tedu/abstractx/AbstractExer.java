package cn.tedu.abstractx;

public class AbstractExer {

	public static void main(String[] args) {

		// Shape s = new Rectangle(3.5, 2.4);
		Shape s = new Square(5);
		System.out.println(s.getArea());
		System.out.println(s.getGirth());

	}

}

abstract class Shape {

	public abstract double getArea();

	public abstract double getGirth();

}

// 代表矩形
class Rectangle extends Shape {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getGirth() {
		return 2 * (width + height);
	}
}

// 正方形
class Square extends Rectangle {

	public Square(double width) {
		super(width, width);
	}

}

// 椭圆形
class Oval extends Shape {

	private double a;
	private double b;

	public Oval(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double getArea() {
		return 3.14 * a * b;
	}

	@Override
	public double getGirth() {
		return 3.14 * (a + b);
	}

}

class Circle extends Oval {

	public Circle(double radis) {
		super(radis, radis);
	}

}