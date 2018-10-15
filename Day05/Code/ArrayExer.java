import java.util.Scanner;
public class ArrayExer {
	
	public static void main(String[] args){
		
		// 获取行数
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		// 定义二维数组来存储杨辉三角
		int[][] arr = new int[row][];
		
		// 遍历数组，向里填充元素
		for(int i = 0; i < row; i++){
			// 先给每一个一维数组定义大小
			arr[i] = new int[i + 1];
			// 遍历这个一维数组，向里填充元素
			for(int j = 0; j <= i; j++){
				// 判断头尾元素
				if(j == 0 || j == i)
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				// 填充完成之后打印这个填充的元素
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
			
		}
		
		
	}
	
	
}