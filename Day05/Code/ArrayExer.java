import java.util.Scanner;
public class ArrayExer {
	
	public static void main(String[] args){
		
		// ��ȡ����
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		// �����ά�������洢�������
		int[][] arr = new int[row][];
		
		// �������飬�������Ԫ��
		for(int i = 0; i < row; i++){
			// �ȸ�ÿһ��һά���鶨���С
			arr[i] = new int[i + 1];
			// �������һά���飬�������Ԫ��
			for(int j = 0; j <= i; j++){
				// �ж�ͷβԪ��
				if(j == 0 || j == i)
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				// ������֮���ӡ�������Ԫ��
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
			
		}
		
		
	}
	
	
}