package homework.day03;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%100!=0&&n%4==0||n%400==0){
			System.out.println("闰年");
		}else{
			System.out.println("平年");
		}
	}
}
