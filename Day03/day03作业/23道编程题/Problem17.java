package homework.day03;

public class Problem17 {
	public static boolean isSXH(int a){
		int b=a/100;
		int s=a%100/10;
		int g=a%10;
		if(a==(b*b*b+s*s*s+g*g*g)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		for(int i=100;i<=999;i++){
			if(isSXH(i)){
				System.out.println(i);
			}
		}
	}
}
