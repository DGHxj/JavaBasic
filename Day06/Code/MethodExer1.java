import java.util.Scanner;
public class MethodExer1 {
	
	public static void main(String[] args){
		
		// ��ȡһ�����ڵ���6��ż��
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// ȷ���������һ���ǺϷ���
		while(n < 6 || n % 2 == 1){
			n = s.nextInt();
		}
		
		for(int i = 3; i <= n / 2; i += 2){
			
			if(isPrime(i) && isPrime(n - i))
				System.out.println(n + "=" + i + "+" + (n - i));
			
		}
	}
	
	public static boolean isPrime(int n){
		
		for(int i = 2; i <= n / 2; i++){
			if(n % i == 0)
				return false;
		}
		
		return true;
		
	}
	
	
}