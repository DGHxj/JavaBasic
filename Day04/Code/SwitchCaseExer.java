import java.util.Scanner;
public class SwitchCaseExer {
	
	public static void main(String[] args){
		
		// ��ȡ�������ֺ�һ������
		Scanner s = new Scanner(System.in);
		double m = s.nextDouble();
		double n = s.nextDouble();
		String symbol = s.next();
		
		// ���ݷ���ȷ��Ҫ���е�����
		switch(symbol){
			case "+":
				System.out.println(m + n);
				break; // ��ʾ������ǰ��ѡ��
			case "-":
				System.out.println(m - n);
				break;
			case "*":
				System.out.println(m * n);
				break;
			case "/":
				System.out.println(m / n);
				break;
			case "%":
				System.out.println(m % n);
				break;
			default:
				System.out.println("���ŷǷ�������");
				break;
		}
		
	}
	
}