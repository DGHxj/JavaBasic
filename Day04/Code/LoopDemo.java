public class LoopDemo {

	public static void main(String[] args){
		// *******
		/*
		for(int i = 1; i <= 7; i++){
			// �����д�ӡ
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
		// ѭ����Ƕ��
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
			������1 -> n
			��i��*�ĸ�����1->i
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
			������n -> 1
			ÿһ�е�*�ĸ�����i -> 1
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
			������1 -> n
			�ո�ĸ�����1 -> n-i
			*�ĸ�����1 -> i
		*/
		/*
		for(int i = 1; i <= 6; i++){
			// �ȴ�ӡ�ո�
			for(int j = 1; j <= 6 - i; j++){
				System.out.print(" ");
			}
			// ��ӡ*
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
			������ n -> 1
			�ո������ n-i -> 1
			*�ĸ����� i -> 1
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