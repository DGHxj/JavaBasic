import java.util.Scanner;
public class IfDemo {

	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		// �ж���������Ƿ���3�ı���
		if(i % 3 == 0)
			System.out.println(i + "��3�ı���");
	
	}

}