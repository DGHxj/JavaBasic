public class BreakDemo {

	public static void main(String[] args){
		
		/*
		for(int i = 1; i < 5; i++){
			
			if(i % 2 == 0)
				// 表示遇到了break之后，循环结构就会结束
				break;
			
			System.out.println(i);
			
		}
		*/
		
		for(int i = 1; i < 5; i++){
			
			for(int j = 1; j < 5; j++){
				
				if(j % 3 == 0)
					// 表示终止当前的一层结构
					break;
				
				System.out.println(i + "," + j);
				
			}
			
		}
		
		
	}

}