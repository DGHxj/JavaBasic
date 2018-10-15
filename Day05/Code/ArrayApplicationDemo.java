import java.util.Arrays;
public class ArrayApplicationDemo {

	public static void main(String[] args){
		
		int[] arr = new int[]{5,1,7,0,8,1,3,4,12,6};
		
		// 获取最大值
		/*
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println(max);
		*/
		int max = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[max] < arr[i])
				max = i;
		}
		System.out.println(arr[max]);
		// 遍历数组
		// 方式一：下标是从0->length - 1
		// 先依次获取下标，然后利用下标获取对应位置上的元素
		/*
		for(int i = 0; i < arr.length; i++){
			// System.out.println(arr[i]);
			arr[i] += 10;
		}
		*/
		// 方式二：直接获取每一个位置上的元素
		// 每一个元素都是一个int类型元素，那么就可以定义一个int类型的变量来依次表示每一个位置上的值
		// 此时i会依次表示数组中的每一个元素
		// 增强for循环
		// 只能遍历数组但是不能改变数组中的元素
		/*
		for(int i : arr){
			// System.out.println(i);
			i += 10;
		}
		*/
		// 方式三：将数组中的元素一个个的拿出来拼接成字符串
		// String str = Arrays.toString(arr);
		// System.out.println(str);
		// 获取指定下标位置上的元素
		// arr[5] += 15;
		// System.out.println(arr[1]);
		
		// 获取数组的长度
		// int len = arr.length;
		// System.out.println(len);
	
	}

}