import java.util.Scanner;
public class WhileExer {

	public static void main(String[] args){
		
		// 1. ��1-100�������е������ĺ�
		/*
		// ��¼��
		int sum = 0;
		int i = 1;
		while(i <= 100){
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		*/
		
		// 2. ��ӡ100�����ܱ�3���������ܱ�7����������
		// ˼·���Ȼ�ȡ���е�3�ı�����Ȼ�����ж���������ܷ�7����
		/*
		int i = 0;
		while(i <= 100){
			
			// �ж��ܷ�7����
			if(i % 7 != 0)
				System.out.println(i);
			
			i += 3;
		}
		*/
		
		// 3. ����һ�����֣�������������һ����λ��
		// ˼·�����ܳ��Լ���10
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
		
		// 4. ����һ�����֣����������ֵ����е�����
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