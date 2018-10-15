import java.util.Scanner;
public class LoopDemo2 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// 标记这个数字是否是一个质数
		// 规定如果为true表示是一个质数，如果为false表示不是一个质数
		boolean b = true;
		
		// 判断一个数字是否是一个质数
		// 从2开始逐个往后取余，看是否还有别的因数，如果没有别的因数，那么就是一个质数，反之就说明不是质数
		for(int i = 2; i < n; i++){
			// 如果能够取余，说明n除了1和本身以外还有别的因数，那么n就不是质数
			if(n % i == 0){
				b = false;
				break;
			}
			
		}
		
		if(b)
			System.out.println(n + "是一个质数");
		else 
			System.out.println(n + "不是一个质数");
		
	}
	
}