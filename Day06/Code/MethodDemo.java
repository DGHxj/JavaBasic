public class MethodDemo {

	public static void main(String[] args){
		
		// ���÷�����ʱ����ʵ������ --- ʵ�ʲ��� - ʵ��
		// int sum1 = sum(5);
		// int sum2 = sum(20);
		printStar(8, '^');
	}
	
	// дһ��������1-n�ĺ�
	// ��ȷ�������1-n�ĺͣ���ô����һ����������ζ�Ž����int���ͣ����Է���ֵ����Ҳ����int����
	// ��ȷδ֪������1-n�ĺͣ�n�ڷ����в����Զ���������Ҫʹ�÷�������������һ��ֵ�����ʱ����Ҫ�Բ�����ʽ������
	// ���巽����ʱ����()�ж����˲��� --- ��ʽ���� - �β� 
	public static int sum(int n){
		
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		
		return sum;
	}
	
	// �ж�һ������n�Ƿ���һ������
	public static boolean isPrime(int n){
		
		// �ж��Ƿ���Ϸ�Χ
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
	
	// ��ӡ��*��ɵ�n��������
	// ��ȷ�����*��ֱ�Ӵ�ӡ������ִ�����֮��û�н��������ֵ���Ͷ���Ϊvoid
	public static void printStar(int n, char ch){
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
	
}