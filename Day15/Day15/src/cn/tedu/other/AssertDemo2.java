package cn.tedu.other;

import java.util.Scanner;

public class AssertDemo2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int age = s.nextInt();

		// ���ж���
		// ������Գɹ������������ִ��
		// �������ʧ�ܣ����׳�����AssertionError
		assert age > 0;
		
		System.out.println(age);

	}

}
