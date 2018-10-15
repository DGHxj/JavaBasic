import java.util.Scanner;
public class SwitchCaseExer {
	
	public static void main(String[] args){
		
		// 获取两个数字和一个符号
		Scanner s = new Scanner(System.in);
		double m = s.nextDouble();
		double n = s.nextDouble();
		String symbol = s.next();
		
		// 根据符号确定要进行的运算
		switch(symbol){
			case "+":
				System.out.println(m + n);
				break; // 表示结束当前的选项
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
				System.out.println("符号非法！！！");
				break;
		}
		
	}
	
}