public class MethodExer2 {

	public static void main(String[] args){
		
		for(int a = 1; a <= 5000; a++){
			// ��ȡa����������֮��
			int b = sumAllFact(a);
			// ��ȡb����������֮��
			int i = sumAllFact(b);
			// �ж�b����������֮���Ƿ�Ϊa
			if(i == a && a < b)
				System.out.println(a + "," + b);
			
		}
		
	}
	
	// ������n����������֮��
	public static int sumAllFact(int n){
		
		int sum = 0;
		// ��ȡ����������е�����
		for(int i = 1; i <= n / 2; i++){
			
			if(n % i == 0)
				sum += i;
			
		}
		
		return sum;
		
		
	}

}