public class MethodExer2 {

	public static void main(String[] args){
		
		for(int a = 1; a <= 5000; a++){
			// 获取a的所有因子之和
			int b = sumAllFact(a);
			// 获取b的所有因子之和
			int i = sumAllFact(b);
			// 判断b的所有因子之和是否为a
			if(i == a && a < b)
				System.out.println(a + "," + b);
			
		}
		
	}
	
	// 求整数n的所有因子之和
	public static int sumAllFact(int n){
		
		int sum = 0;
		// 获取这个数的所有的因子
		for(int i = 1; i <= n / 2; i++){
			
			if(n % i == 0)
				sum += i;
			
		}
		
		return sum;
		
		
	}

}