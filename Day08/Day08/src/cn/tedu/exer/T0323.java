package cn.tedu.exer;

import java.util.Scanner;

public class T0323 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// 记录次数
		int count = 0;
		
		for(int i = 0; i < 32; i++){
			
			// 逐位判断每一位是0还是1
			if((n & 1) == 1)
				count++;
			
			n >>= 1;
			
		}
		
		System.out.println(count);
	}

}
