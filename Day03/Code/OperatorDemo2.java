public class OperatorDemo2 {
	
	public static void main(String[] args){
		
		/*
		byte b = 127;
		// �ڵײ��Զ�����һ��ǿ��ת��
		b++;
		System.out.println(b);
		*/
		
		/*
		char c = '0';
		System.out.println(c + 3);
		*/
		
		// byte b = 130;
		// 3��5���������������������ڲ��������ʱ����Զ����Ż�
		// �ڱ���ʱ�ھͻ��Զ�����
		// byte b = 8;
		// byte b = 3 + 5;
		// System.out.println(b);
		
		// byte i = 5;
		// i = i + 3;
		// i += 33;
		// i = i % 5;
		// i %= 5;
		// System.out.println(i);
		
		// int i = j = k = 10;
		// int i, j, k;
		// i = j = k = 10;
		
		/*
		int i = 5;
		i += i *= i -= 3;
		System.out.println(i);
		*/
		
		/*
		System.out.println(3 == 5);
		System.out.println(3 != 5);
		int i = 5;
		System.out.println(3 < i < 7);
		*/
		
		/*
		int i = 5, j = 7;
		// boolean b = i++ >= 6 && j++ > 3;
		boolean b = j++ > 3 || i++ > 4;
		System.out.println(i);
		System.out.println(j);
		System.out.println(b);
		*/
		
		// int i = 3, j = 5, k = 6;
		// boolean b = i++ > 0 || j++ > 5 && k++ < 10;
		/*
		boolean b = i++ > 5 && j++ > 4 || k++ > 3;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(b);
		*/
		
		int i = 5, j = 7, k = 4;
		// int max = i > j ? i : j;
		// System.out.println(max);
		// i > j ? System.out.println(i) : System.out.println(j);
		// ��Ԫ���ʽ��Ƕ��
		int max = i > j ? (i > k ? i : k) : (j > k ? j : k);
		System.out.println(max);
		
		
		
		
		
		
		
	}

}