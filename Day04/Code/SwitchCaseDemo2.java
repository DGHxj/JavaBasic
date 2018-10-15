import java.util.Scanner;
public class SwitchCaseDemo2 {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		// int i = s.nextInt();
		
		/*
		int j = 0;
		switch(i){
			
			// 如果没有break，那么代码从匹配的case开始，顺次往下执行，直到遇到break；
			case 0 : j += 3;
			case 2 : j += 6;break;
			case 1 : j += 4;break;
			case 3 : j += 7;break;
			
		}
		
		System.out.println(j);
		*/
		
		// 输入数字表示月份，然后输出这个月份对应的天数（平年）
		// 31天：1 3 5 7 8 10 12
		// 30天：4 6 9 11
		// 28天：2
		int month = s.nextInt();
		switch(month){
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(31);break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(30);
				break;
			case 2:
				System.out.println(28);
				break;
			default:
				System.out.println("Illegal month!!!");break;
		}
	}

}