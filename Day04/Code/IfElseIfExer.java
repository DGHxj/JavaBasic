import java.util.Scanner;
public class IfElseIfExer {
	
	public static void main(String[] args){
		
		// 输入数字
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// 判断这个数字是否合法
		if(n < 1 || n > 7){
			System.out.println("星期不合法！！！");
		} else if(n == 1){
			System.out.println("星期一");
		} else if(n == 2){
			System.out.println("星期二");
		} else if(n == 3){
			System.out.println("星期三");
		} else if(n == 4){
			System.out.println("星期四");
		} else if(n == 5){
			System.out.println("星期五");
		} else if(n == 6){
			System.out.println("星期六");
		} else {
			System.out.println("星期天");
		}
		
	}
	
}