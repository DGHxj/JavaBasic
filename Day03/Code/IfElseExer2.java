import java.util.Scanner;
public class IfElseExer2 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		double weight = s.nextDouble();
		
		double price = 0;
		if(weight < 0){
			System.out.println("不合法的重量！！！");
		} else {
			if(weight <= 20){
				price = weight * 0.35;
			} else {
				if(weight <= 100){
					price = 20 * 0.35 + (weight - 20) * 0.5;
				} else {
					price = 20 * 0.35 + 80 * 0.5 + (weight - 100) * 0.8;
				}
			}
			
		}
		
		System.out.println(price);
		
	}
	
}