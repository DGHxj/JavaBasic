import java.util.Scanner;
public class SwitchCaseExer2 {
	
	public static void main(String[] args){
		
		// 获取年月日
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		int month = s.nextInt();
		int day = s.nextInt();
		
		// 定义一个变量来记录总天数
		int sum = 0;
		
		// 根据月份确定到底要加上多少天
		switch(month){
			case 12:sum += 30; // 经历11月的30天
			case 11:sum += 31; // 经历10月的31天
			case 10:sum += 30;
			case 9: sum += 31;
			case 8: sum += 31;
			case 7: sum += 30;
			case 6: sum += 31;
			case 5: sum += 30;
			case 4: sum += 31;
			case 3: // 加上2月的天数 - 平年和闰年的判断
				if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
					sum += 29;
				} else {
					sum += 28;
				}
			case 2: sum += 31;
			case 1: sum += day;
		}
		System.out.println(sum);
		
	}
	
}