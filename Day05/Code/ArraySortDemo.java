import java.util.Arrays;
public class ArraySortDemo {

	public static void main(String[] args){
		
		int[] arr = {5,1,7,0,8,2,6};
		
		// ð������
		// ����һ��ѭ����������
		/*
		for(int i = 1; i < arr.length; i++){
			// ����һ��ѭ������ÿһ���ֵĴ���
			for(int j = 1; j <= arr.length - i; j++){
				if(arr[j - 1] > arr[j]){
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		*/
		// ѡ������
		// ��������
		/*
		for(int i = 1; i < arr.length; i++){
			// ����ÿһ��Ҫ�Ƚϵ��±�
			for(int j = i; j < arr.length; j++){
				// ��ѡ�����±��ϵ�Ԫ�غͱȽϵ��±��ϵ�Ԫ�ؽ��бȽ�
				if(arr[i - 1] > arr[j]){
					int temp = arr[i - 1];
					arr[i - 1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		*/
		// ֻ�ܽ�����������
		// ��չ���ײ��õ��ǿ�������+�鲢����
		// ʱ�临�Ӷ�:O(nlogn)
		Arrays.sort(arr);
		// ��ת����
		// ��ʽһ��
		// ʱ�临�Ӷ�O(n),�ռ临�Ӷ�o(n)
		/*
		int[] newArr = new int[arr.length];
		for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
			newArr[j] = arr[i];
		}
		*/
		// ��ʽ����ͷβ����
		// ʱ�临�Ӷ�O(n),�ռ临�Ӷ�o(1)
		for(int i = 0, j = arr.length - 1; i <= j; i++, j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}