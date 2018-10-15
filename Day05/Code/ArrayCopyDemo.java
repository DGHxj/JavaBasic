import java.util.Arrays;
public class ArrayCopyDemo {

	public static void main(String[] args){
		
		// int[] arr1 = {5,1,7,0,8,2,6};
		
		// int[] arr2 = new int[9];
		
		// 表示从arr1下标为2的位置上复制4个元素放入arr2数组中，从arr2数组的下标为4的位置开始放
		// System.arraycopy(arr1, 2, arr2, 4, 4);
		
		// System.out.println(Arrays.toString(arr2));
		
		// 数组的扩容 --- 数组的复制 --- 产生一个新的数组，导致扩容之后的数组和原数组不是同一个
		int[] arr = {3,6,1,7,9};
		/*
		int[] newArr = new int[8];
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		arr = newArr;
		*/
		System.out.println(arr);
		arr = Arrays.copyOf(arr, 8);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}