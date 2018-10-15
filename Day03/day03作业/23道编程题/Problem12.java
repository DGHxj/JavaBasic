package homework.day03;

public class Problem12 {
	public static void main(String[] args) {
		for (int i = 1; i <= 33; i++) {
			for(int j=1;j<=50;j++){
				int xj=(100-(i*3+j*2))*3;
				if((xj+i+j)==100)
					System.out.println("公鸡："+i+"只，"+"母鸡："+j+"只，"+"小鸡："+xj+"只。");
			}
		}
	}
}
