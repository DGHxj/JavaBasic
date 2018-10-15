import java.util.Scanner;
public class IfElseExer {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		int k = s.nextInt();
		
		/*
		if(i < j){
			if(i < k){
				System.out.println(i);
			} else {
				System.out.println(k);
			}
		} else {
			if(j < k){
				System.out.println(j);
			} else {
				System.out.println(k);
			}
		}
		*/
		
		int min = i;
		
		if(min > j)
			min = j;
		
		if(min > k)
			min = k;
		
		System.out.println(min);
	}
	
}