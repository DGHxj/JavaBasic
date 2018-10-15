package cn.tedu.fengzhuang;

public class FengzhuangExer {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(5.45, 3.87);
		System.out.println(r.getGirth());
		System.out.println(r.getArea());

	}

}

// 定义一个代表矩形的类
class Rectangle {

	private double width; // 宽
	private double height; // 高

	// 当矩形定义好之后，宽和高就固定下了
	public Rectangle(double width, double height) {
		// 判断宽和高是否合法
		if (width <= 0 || height <= 0)
			return;
		this.width = width;
		this.height = height;
	}

	// 矩形画好之后宽和高不能产生变动了，所以不需要再提供set方法
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// 计算周长
	public double getGirth() {
		return 2 * (width + height);
	}

	// 计算面积
	public double getArea() {
		return width * height;
	}

}
