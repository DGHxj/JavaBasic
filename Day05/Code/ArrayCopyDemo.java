import java.util.Arrays;
public class ArrayCopyDemo {

	public static void main(String[] args){
		
		// int[] arr1 = {5,1,7,0,8,2,6};
		
		// int[] arr2 = new int[9];
		
		// ��ʾ��arr1�±�Ϊ2��λ���ϸ���4��Ԫ�ط���arr2�����У���arr2������±�Ϊ4��λ�ÿ�ʼ��
		// System.arraycopy(arr1, 2, arr2, 4, 4);
		
		// System.out.println(Arrays.toString(arr2));
		
		// ��������� --- ����ĸ��� --- ����һ���µ����飬��������֮��������ԭ���鲻��ͬһ��
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