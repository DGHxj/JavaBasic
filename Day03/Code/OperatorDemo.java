public class OperatorDemo {
	
	public static void main(String[] args){
		
		/*
		int i = -9;
		int j = 4;
		System.out.println(i % j);
		*/
		// System.out.println(5 % 1.4);
		int i = 7;
		// �൱����ԭ���Ļ��������Լ�1
		// �Ƚ�i��ֵ7ȡ�������Ϊ�����Ȼ��i����Ϊ8������ٽ�7��ֵ��j
		// int j = i++;
		// �Ƚ�i����Ϊ8��Ȼ���ٽ�i��ֵ��ֵ��j
		// int j = ++i;
		// �Ƚ�i��ֵ7ȡ��������������㣬Ȼ��i����Ϊ8����7����˷����㣬�������14����󽫼����14��ֵ��j
		// int j = i++ * 2;
		// �Ƚ�i����Ϊ8��Ȼ��8ȡ��������˷����㣬��������16
		int j = ++i * 2;
		System.out.println(i);
		System.out.println(j);
	}
	
}