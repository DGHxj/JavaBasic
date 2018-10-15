import java.util.Scanner;
public class IfElseDemo {

	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		if(i % 2 == 1){
			System.out.println(i + "是一个奇数");
		} else {
			System.out.println(i + "是一个偶数");
		}
	}
}