package homework.day03;

import java.util.Scanner;

public class Problem22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(faibo(i)+" ");
		}
	}
	public static int  faibo(int n){
		if(n==1||n==2){
			return 1;
		}
		return faibo(n-1)+faibo(n-2);
	}
}
