import java.util.Arrays;
public class ArrayApplicationDemo {

	public static void main(String[] args){
		
		int[] arr = new int[]{5,1,7,0,8,1,3,4,12,6};
		
		// ��ȡ���ֵ
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
		// ��������
		// ��ʽһ���±��Ǵ�0->length - 1
		// �����λ�ȡ�±꣬Ȼ�������±��ȡ��Ӧλ���ϵ�Ԫ��
		/*
		for(int i = 0; i < arr.length; i++){
			// System.out.println(arr[i]);
			arr[i] += 10;
		}
		*/
		// ��ʽ����ֱ�ӻ�ȡÿһ��λ���ϵ�Ԫ��
		// ÿһ��Ԫ�ض���һ��int����Ԫ�أ���ô�Ϳ��Զ���һ��int���͵ı��������α�ʾÿһ��λ���ϵ�ֵ
		// ��ʱi�����α�ʾ�����е�ÿһ��Ԫ��
		// ��ǿforѭ��
		// ֻ�ܱ������鵫�ǲ��ܸı������е�Ԫ��
		/*
		for(int i : arr){
			// System.out.println(i);
			i += 10;
		}
		*/
		// ��ʽ�����������е�Ԫ��һ�������ó���ƴ�ӳ��ַ���
		// String str = Arrays.toString(arr);
		// System.out.println(str);
		// ��ȡָ���±�λ���ϵ�Ԫ��
		// arr[5] += 15;
		// System.out.println(arr[1]);
		
		// ��ȡ����ĳ���
		// int len = arr.length;
		// System.out.println(len);
	
	}

}