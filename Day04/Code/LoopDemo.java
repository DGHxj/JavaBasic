public class LoopDemo {

	public static void main(String[] args){
		// *******
		/*
		for(int i = 1; i <= 7; i++){
			// 不换行打印
			// ln -> line
			System.out.print("*");
		}
		System.out.println();
		*/

		/*
			*******
			*******
			*******
			*******
		*/
		// 循环的嵌套
		/*
		for(int count = 1; count <= 5; count++){
			for(int i = 1; i <= 7; i++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		/*
			*
			**
			***
			****
			*****
			******
			行数：1 -> n
			第i行*的个数：1->i
		*/
		/*
		for(int i = 1; i <= 6; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
			******
			*****
			****
			***
			**
			*
			行数：n -> 1
			每一行的*的个数：i -> 1
		*/
		/*		for(int i = 6; i > 0; i--){
			for(int j = i; j > 0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
			-----*
			----**
			---***
			--****
			-*****
			******
			行数：1 -> n
			空格的个数：1 -> n-i
			*的个数：1 -> i
		*/
		/*
		for(int i = 1; i <= 6; i++){
			// 先打印空格
			for(int j = 1; j <= 6 - i; j++){
				System.out.print(" ");
			}
			// 打印*
			for(int k = 1; k <= i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
			******
			 *****
			  ****
			   ***
			    **
				 *
			行数： n -> 1
			空格个数： n-i -> 1
			*的个数： i -> 1
		*/
		for(int i = 6; i > 0; i--){
			
			for(int j = 6 - i; j > 0; j--)
				System.out.print(" ");
			
			for(int j = i; j > 0; j--)
				System.out.print("*");
			
			System.out.println();
			
		}
		
		
		
		

	}

}