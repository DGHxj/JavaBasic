import java.util.Scanner;
public class IfElseIfExer {
	
	public static void main(String[] args){
		
		// ��������
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// �ж���������Ƿ�Ϸ�
		if(n < 1 || n > 7){
			System.out.println("���ڲ��Ϸ�������");
		} else if(n == 1){
			System.out.println("����һ");
		} else if(n == 2){
			System.out.println("���ڶ�");
		} else if(n == 3){
			System.out.println("������");
		} else if(n == 4){
			System.out.println("������");
		} else if(n == 5){
			System.out.println("������");
		} else if(n == 6){
			System.out.println("������");
		} else {
			System.out.println("������");
		}
		
	}
	
}