import java.util.Scanner;
public class ArraySearchDemo {
	
	public static void main(String[] args){
		
		/*
		int[] arr = {5,1,7,0,8,2,6};
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// ����һ��������¼λ��
		// �涨����Ҳ������Ԫ�أ����±��¼-1
		int index = -1;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == n){
				index = i;
				break;
			}
		}
		System.out.println(index);
		*/
		
		// ���ֲ���/�۰����
		// �ռ临�Ӷȣ�o(1)
		int[] arr = {5,9,15,16,28,37,45,48,56,59,60};
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// ��¼��Сֵ���±�
		int min = 0;
		// ��¼���ֵ���±�
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