import java.util.Scanner;
public class SwitchCaseDemo {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		switch(n){
			case 4:
				System.out.println("������");break;
			case 2:
				System.out.println("���ڶ�");break;
			case 5:
				System.out.println("������");break;
			case 3:
				System.out.println("������");break;
			case 6:
				System.out.println("������");break;
			case 1:
				System.out.println("����һ");break;
			case 7:
				System.out.println("������");break;
			// ֻҪ������case�����������Զ����鵽default
			default:
				System.out.println("���ڲ��Ϸ�������");break;
		}
		
		
	}
	
	
}