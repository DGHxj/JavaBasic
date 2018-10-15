package cn.tedu.staticx;

public class StaticExer {

	public static void main(String[] args) {

		new SDemo();

		System.out.println(SDemo.count);

	}

}

class SDemo {

	static int count = 0;

	{
		count++;
	}

}
