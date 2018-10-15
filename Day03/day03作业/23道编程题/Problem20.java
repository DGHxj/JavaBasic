package homework.day03;

public class Problem20 {
	public static void main(String[] args) {
		for(int i=2;i<1000;i++){
			if(isPer(i)){
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isPer(int x){
		int sum=1;
		for(int i=x-1;i>1;i--){
			if(x%i==0){
				sum+=i;
			}
		}
		if(sum==x){
			return true;
		}
		return false;
	}
}
