package cn.tedu.fengzhuang;

public class FengzhuangExer {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(5.45, 3.87);
		System.out.println(r.getGirth());
		System.out.println(r.getArea());

	}

}

// ����һ��������ε���
class Rectangle {

	private double width; // ��
	private double height; // ��

	// �����ζ����֮�󣬿�͸߾͹̶�����
	public Rectangle(double width, double height) {
		// �жϿ�͸��Ƿ�Ϸ�
		if (width <= 0 || height <= 0)
			return;
		this.width = width;
		this.height = height;
	}

	// ���λ���֮���͸߲��ܲ����䶯�ˣ����Բ���Ҫ���ṩset����
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// �����ܳ�
	public double getGirth() {
		return 2 * (width + height);
	}

	// �������
	public double getArea() {
		return width * height;
	}

}
