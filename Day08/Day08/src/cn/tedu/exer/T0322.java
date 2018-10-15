package cn.tedu.exer;

import java.util.Scanner;

public class T0322 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		if (n == 1)
			System.out.println("0");
		else if (n == 2)
			System.out.println("0, 1");
		else {
			System.out.print("0, 1");

			// 记录第一项
			int first = 0;
			// 记录第二项
			int second = 1;

			for (int i = 3; i <= n; i++) {

				// 求第三项
				int third = first + second;
				System.out.print(", " + third);

				first = second;
				second = third;

			}

		}

	}

}
