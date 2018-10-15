package homework.day03;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("北");
			break;
		case 2:
			System.out.println("京");
			break;
		case 3:
			System.out.println("欢");
			break;
		case 4:
			System.out.println("迎");
			break;
		case 5:
			System.out.println("你");
			break;
		default:
			System.out.println("北京欢迎你");
			break;
		}
	}
}
