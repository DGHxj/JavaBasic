import java.util.Scanner;
public class LoopDemo2 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// �����������Ƿ���һ������
		// �涨���Ϊtrue��ʾ��һ�����������Ϊfalse��ʾ����һ������
		boolean b = true;
		
		// �ж�һ�������Ƿ���һ������
		// ��2��ʼ�������ȡ�࣬���Ƿ��б�����������û�б����������ô����һ����������֮��˵����������
		for(int i = 2; i < n; i++){
			// ����ܹ�ȡ�࣬˵��n����1�ͱ������⻹�б����������ôn�Ͳ�������
			if(n % i == 0){
				b = false;
				break;
			}
			
		}
		
		if(b)
			System.out.println(n + "��һ������");
		else 
			System.out.println(n + "����һ������");
		
	}
	
}