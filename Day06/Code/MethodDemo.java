public class MethodDemo {

	public static void main(String[] args){
		
		// 调用方法的时候传入实际数据 --- 实际参数 - 实参
		// int sum1 = sum(5);
		// int sum2 = sum(20);
		printStar(8, '^');
	}
	
	// 写一个方法求1-n的和
	// 明确结果：求1-n的和，那么和是一个整数，意味着结果是int类型，所以返回值类型也就是int类型
	// 明确未知量：求1-n的和，n在方法中不能自动产生，需要使用方法的人来传入一个值，这个时候需要以参数形式来体现
	// 定义方法的时候在()中定义了参数 --- 形式参数 - 形参 
	public static int sum(int n){
		
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		
		return sum;
	}
	
	// 判断一个数字n是否是一个质数
	public static boolean isPrime(int n){
		
		// 判断是否符合范围
		if(n < 2)
			return false;
		
		if(n == 2)
			return true;
		
		if(n % 2 == 0)
			return false;
		
		for(int i = 3; i < n; i++){
			
			if(n % i == 0)
				return false;
			
		}
		
		return true;
		
	}
	
	// 打印由*组成的n行三角形
	// 明确结果：*是直接打印，方法执行完成之后没有结果，返回值类型定义为void
	public static void printStar(int n, char ch){
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
	
}