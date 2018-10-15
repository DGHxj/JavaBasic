package homework.day03;

import java.util.Scanner;

public class Problem23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=Integer.toBinaryString(n);
		System.out.println(str);
		int count=0;
		char[] cs = str.toCharArray();
		for(int i=0;i<cs.length;i++){
			if(cs[i]=='1'){
				count++;
			}
		}
		System.out.println(count);
	}
}
