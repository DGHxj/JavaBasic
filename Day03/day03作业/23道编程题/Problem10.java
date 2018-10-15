package homework.day03;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=1;
		if(n>=10){
			System.out.println("非法数据！");
			return;
		}
		for(int i=1;i<=n;i++){
			m*=i;
		}
		System.out.println(m);
	}
}
