package cn.tedu.exer;

import java.util.Scanner;

public class T0323 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// ��¼����
		int count = 0;
		
		for(int i = 0; i < 32; i++){
			
			// ��λ�ж�ÿһλ��0����1
			if((n & 1) == 1)
				count++;
			
			n >>= 1;
			
		}
		
		System.out.println(count);
	}

}
