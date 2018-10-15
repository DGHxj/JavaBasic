package homework.day03;

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		double price=0;
		if(n<0){
			System.out.println("非法数据！");
		}else if(n<=20){
			price=5;
		}else if(n<=100){
			price=5+(n-20)*0.2;
		}else{
			price=5+(100-20)*0.2+(n-100)*0.15;
		}
		System.out.println(price);
	}
}
