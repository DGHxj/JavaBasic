package cn.tedu.exer;

public class T0314 {
	
	public static void main(String[] args) {
		
		for (int i = 1000; i < 10000; i++) {
			
			int ab = i / 100;
			int cd = i % 100;
			
			if((ab + cd) * (ab + cd) == i)
				System.out.println(i);
			
		}
		
	}

}
