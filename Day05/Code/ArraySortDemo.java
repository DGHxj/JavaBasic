import java.util.Arrays;
public class ArraySortDemo {

	public static void main(String[] args){
		
		int[] arr = {5,1,7,0,8,2,6};
		
		// 冒泡排序
		// 定义一个循环控制轮数
		/*
		for(int i = 1; i < arr.length; i++){
			// 定义一个循环控制每一个轮的次数
			for(int j = 1; j <= arr.length - i; j++){
				if(arr[j - 1] > arr[j]){
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		*/
		// 选择排序
		// 控制轮数
		/*
		for(int i = 1; i < arr.length; i++){
			// 控制每一轮要比较的下标
			for(int j = i; j < arr.length; j++){
				// 拿选定的下标上的元素和比较的下标上的元素进行比较
				if(arr[i - 1] > arr[j]){
					int temp = arr[i - 1];
					arr[i - 1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		*/
		// 只能进行升序排序
		// 扩展：底层用的是快速排序+归并排序
		// 时间复杂度:O(nlogn)
		Arrays.sort(arr);
		// 反转数组
		// 方式一：
		// 时间复杂度O(n),空间复杂度o(n)
		/*
		int[] newArr = new int[arr.length];
		for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
			newArr[j] = arr[i];
		}
		*/
		// 方式二：头尾交换
		// 时间复杂度O(n),空间复杂度o(1)
		for(int i = 0, j = arr.length - 1; i <= j; i++, j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}