package cn.tedu.string;

import java.util.Scanner;

public class StringExer6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// ��ȡ����2���ַ���
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String sub = s.next();
		
		// ��¼λ��
		int index = 0;
		
		// ���Ӵ����ֵ�λ�ã��ӵ�0��ʼ���������
		// �ҵ�֮���ӡ���λ��Ȼ��ӵ�ǰλ�õ���һλ����Ѱ��
		// abcda  a
		while(index < str.length()){
			
			// ��ָ����λ�ÿ�ʼ��Ԫ��
			index = str.indexOf(sub,index);
			
			if(index != -1){
				System.out.println(index);
				index++;
			} else 
				break;
		}
		
	}

}
