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
		
		// ��Ǯ�ټ�
		for(int i = 1; i < 33; i++){ // ��ʾ�����ĸ���
			for(int j = 1; j < 50; j++){// ��ʾĸ���ĸ���
				// ����С���ĸ���
				int k = 100 - i - j;
				if(k % 3 == 0 && i * 3 + j * 2 + k / 3 == 100){
					System.out.println("����" + i);
					System.out.println("ĸ��" + j);
					System.out.println("С��" + k);
					System.out.println("==================");
				}
			}
			
		}
		
	}

}