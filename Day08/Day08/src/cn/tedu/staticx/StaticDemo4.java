package cn.tedu.staticx;

public class StaticDemo4 {

	public static void main(String[] args) {

		// ���ظ��� --- ���ྲ̬
		// �������� --- ���ྲ̬
		// ����������� --- ���๹��
		// ����������� --- ���๹��
		new SB();
		new SB();

	}

}

class SA {

	SD d;

	static {
		System.out.println("A1");
	}

	{
		System.out.println("A2");
		d = new SD();
	}

	public SA() {
		System.out.println("A3");
	}

}

class SB extends SA {

	static SC c = new SC();

	static {
		System.out.println("B1");
	}

	{
		System.out.println("B2");
	}

	public SB() {
		System.out.println("B3");
	}

}

class SC {
	public SC() {
		System.out.println("C");
	}
}

class SD extends SC {
	public SD() {
		System.out.println("D");
	}
}