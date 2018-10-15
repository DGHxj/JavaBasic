import java.util.Scanner;
public class WhileExer {

	public static void main(String[] args){
		
		// 1. 求1-100以内所有的奇数的和
		/*
		// 记录和
		int sum = 0;
		int i = 1;
		while(i <= 100){
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		*/
		
		// 2. 打印100以内能被3整除而不能被7整除的数字
		// 思路：先获取所有的3的倍数，然后再判断这个倍数能否被7整除
		/*
		int i = 0;
		while(i <= 100){
			
			// 判断能否被7整除
			if(i % 7 != 0)
				System.out.println(i);
			
			i += 3;
		}
		*/
		
		// 3. 输入一个数字，输出这个数字是一个几位数
		// 思路：看能除以几次10
		/*
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		while(n != 0){
			n /= 10;
			count++;
		}
		System.out.println(count);
		*/
		
		// 4. 输入一个数字，输出这个数字的所有的因数
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i <= n){
			
			if(n % i == 0)
				System.out.println(i);
			
			i++;
		}
		
	}

}