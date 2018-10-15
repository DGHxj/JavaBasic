public class ContinueDemo {

	public static void main(String[] args){
	
		/*
		for(int i = 1; i < 5; i++){
			
			if(i % 2 == 0)
				// 表示这次循环直接跳过，执行下一次的循环
				continue;
			
			System.out.println(i);
			
		}
		*/
		for(int i = 1; i < 5; i++){
			
			for(int j = 1; j < 5; j++){
				
				if(j % 2 == 0)
					continue;
				
				System.out.println(i + "," + j);
				
			}
			
		}
	
	}

}