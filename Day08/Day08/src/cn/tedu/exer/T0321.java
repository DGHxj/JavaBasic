package cn.tedu.exer;

public class T0321 {
	
	public static void main(String[] args) {
		
		// ����һ��������ʾԲ����
		double PI = 0.0;
		
		// ����һ����������¼����
		int count = 0;
		
		// ��¼��ĸ
		double base = 1;
		
		// ���Ʒ��ŵı仯
		double sym = 1;
		
		while(PI > 3.1415927 || PI < 3.1415926){
			// ����Բ����
			PI += 4.0 * sym / base;
			// ����+1
			count++;
			// ��ĸ+2
			base += 2;
			// ���Ÿı�
			sym *= -1;
		}
		
		System.out.println(count);
		
	}

}
