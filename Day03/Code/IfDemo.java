import java.util.Scanner;
public class IfDemo {

	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		// 判断这个数字是否是3的倍数
		if(i % 3 == 0)
			System.out.println(i + "是3的倍数");
	
	}

}