import java.util.Scanner;
public class IfElseIfExer {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		
		if(month < 1 || month > 12){
			System.out.println("Illegal month !!!");
		} else if(month > 2 && month < 6){
			System.out.println("Spring");
		} else if(month > 5 && month < 9){
			System.out.println("Summmer");
		} else if(month > 8 && month < 12){
			System.out.println("Autumn");
		} else {
			System.out.println("Winter");
		}
		
		
	}
	
}