import java.util.Scanner;
public class ArraySearchDemo {
	
	public static void main(String[] args){
		
		/*
		int[] arr = {5,1,7,0,8,2,6};
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// 定义一个变量记录位置
		// 规定如果找不到这个元素，将下标记录-1
		int index = -1;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == n){
				index = i;
				break;
			}
		}
		System.out.println(index);
		*/
		
		// 二分查找/折半查找
		// 空间复杂度：o(1)
		int[] arr = {5,9,15,16,28,37,45,48,56,59,60};
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// 记录最小值的下标
		int min = 0;
		// 记录最大值的下标
		int max = arr.length - 1;
		int mid = (max + min) / 2;
		while(arr[mid] != n){
			
			if(arr[mid] > n)
				max = mid - 1;
			else
				min = mid + 1;
			
			if(min > max){
				mid = -1;
				break;
			}
			mid = (min + max) / 2;
			
		}
		
		System.out.println(mid);
		
	}

}