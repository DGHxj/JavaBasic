import java.util.Scanner;
public class OperatorExer {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		// �ӿ���̨��ȡһ��С��
		double score = s.nextDouble();
		int i = s.nextInt();
		
		char level = score >= 90 ? 'A' : (score >= 80 ? 'B' : (score >= 70 ? 'C' : (score >= 60 ? 'D' : 'E')));
		
		System.out.println(level);
		
	}

}