package homework.day03;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个整数：");
		int b = sc.nextInt();
		int a = sc.nextInt();
		System.out.println("请选择符号：1：+，2：-，3：*，4：/。");
		int s = sc.nextInt();
		switch (s) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println((double)a/(double)b);
			break;
		default:
			System.out.println("你在输些什么？");
			break;
		}
	}
}
