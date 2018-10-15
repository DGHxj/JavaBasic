package homework.day03;

import java.util.Scanner;

public class Problem19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				System.out.println("不是质数");
			}
			else{
				System.out.println("是质数");
			}
		}
	}
}
