public class OperatorDemo3 {

	public static void main(String[] args){
		
		// �������>��ϵ���ȼ���1+3=4�����Ƚ�3>4�����Ϊfalse
		// �����ϵ>�������ȼ���3>1=true,Ȼ��true+1�޷����㣬�ᱨ��
		// System.out.println(3 > 1 + 3);
		
		// �����ϵ>�߼����ȼ���3>4=false,Ȼ���ټ���true&false=false
		// ����߼�>��ϵ���ȼ���true&3,�޷����㣬�ᱨ��
		// System.out.println(true & 3 > 4);
		
		// System.out.println(1 & 6 + 3);
		
		// System.out.println(2 << 3 > 3);
		// System.out.println(2 & 3 > 2);
		// System.out.println(2 << 3 + 3);
		// System.out.println(~3 + 3);
		// int i = 3, j = 5;
		// System.out.println(i < j ? i : j + 10);
		// boolean b = i < j ? i : j > 4;
		// System.out.println(i < j ? i : j ^ 5);
		
		int i = 5;
		// i = ~i++;
		i = ~++i;
		System.out.println(i);
		
	}

}