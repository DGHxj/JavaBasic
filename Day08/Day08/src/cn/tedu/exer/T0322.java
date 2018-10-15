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

			// ��¼��һ��
			int first = 0;
			// ��¼�ڶ���
			int second = 1;

			for (int i = 3; i <= n; i++) {

				// �������
				int third = first + second;
				System.out.print(", " + third);

				first = second;
				second = third;

			}

		}

	}

}
