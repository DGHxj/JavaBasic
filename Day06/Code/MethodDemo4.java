public class MethodDemo4 {

	public static void main(String[] args){
		System.out.println(add(100000));
	}
	
	public static int step(int n){
		
		if(n == 1)
			return 1;
		
		if(n == 2)
			return 2;
		
		return step(n - 1) + step(n - 2);
		
	}
	
	public static int add(int n){
		
		if(n == 1)
			return 1;
		
		// ��ǰn��ĺ��൱�����n�����ǰ(n-1)��ĺ�
		// �ڷ����е����˷�������---�ݹ�
		return n + add(n - 1);
	}
	
	public static long fac(int n){
		
		if(n == 1)
			return 1;
		
		return n * fac(n - 1);
	}
	
	/*
	public static int add(int n){
		
		int sum = 0;
		for(int i = n; i > 0; i--)
			sum += i;
		
		return sum;
		
	}
	*/

}