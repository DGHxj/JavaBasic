package cn.tedu.exer;

public class T0317 {

	public static void main(String[] args) {

		for (int i = 100; i < 1000; i++) {

			int a = i / 100;
			int b = i / 10 % 10;
			int c = i % 10;

			// if (a * a * a + b * b * b + c * c * c == i)
			// Math.pow(double a, double b); -> 表示求a的b次方 ->
			if ((int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) == i)
				System.out.println(i);

		}

	}

}
