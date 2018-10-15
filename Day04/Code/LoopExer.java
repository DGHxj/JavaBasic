public class LoopExer {

	public static void main(String[] args){
		
		/*
		for(int i = 1; i <= 9; i++){
			
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
			
		}
		*/
		
		/*
				*****
			   *****
			  *****
			 *****
			*****
		*/
		/*
		for(int i = 1; i <= 5; i++){
			
			for(int j = 1; j <= 5 - i; j++)
				System.out.print(" ");
			
			for(int j = 1; j <= 5; j++)
				System.out.print("*");
			
			System.out.println();
		}
		*/
		
		/*
				  **     **
				 ****   ****
				****** ******
			   ***************
			    *************
				 ***********
				  *********
				   *******
				    *****
					 ***
					  *
		*/
		
		// 百钱百鸡
		for(int i = 1; i < 33; i++){ // 表示公鸡的个数
			for(int j = 1; j < 50; j++){// 表示母鸡的个数
				// 计算小鸡的个数
				int k = 100 - i - j;
				if(k % 3 == 0 && i * 3 + j * 2 + k / 3 == 100){
					System.out.println("公鸡" + i);
					System.out.println("母鸡" + j);
					System.out.println("小鸡" + k);
					System.out.println("==================");
				}
			}
			
		}
		
	}

}