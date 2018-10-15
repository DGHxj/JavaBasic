package cn.tedu.staticx;

public class StaticDemo5 {

	public static void main(String[] args) {

		System.out.println(D.i);

	}

}

class D {

	static {
		i = 7;
	}
	static int i ;

}
