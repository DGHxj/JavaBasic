import java.util.Scanner;
public class SwitchCaseDemo {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		switch(n){
			case 4:
				System.out.println("星期四");break;
			case 2:
				System.out.println("星期二");break;
			case 5:
				System.out.println("星期五");break;
			case 3:
				System.out.println("星期三");break;
			case 6:
				System.out.println("星期六");break;
			case 1:
				System.out.println("星期一");break;
			case 7:
				System.out.println("星期天");break;
			// 只要其他的case都不符合则自动划归到default
			default:
				System.out.println("星期不合法！！！");break;
		}
		
		
	}
	
	
}