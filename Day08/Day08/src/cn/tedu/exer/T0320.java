package cn.tedu.exer;

public class T0320 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 1001; i++) {
			
			// ¼ÇÂ¼ºÍ
			int sum = 0;
			
			for(int j = 1; j <= i / 2; j++){
				if(i % j == 0)
					sum += j;
			}
			
			if(sum == i)
				System.out.println(i);
		}
		
	}

}
