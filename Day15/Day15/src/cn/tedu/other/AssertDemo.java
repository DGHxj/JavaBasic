package cn.tedu.other;

import java.util.Scanner;

public class AssertDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int age = s.nextInt();

		// ���ж���
		// ������Գɹ������������ִ��
		// �������ʧ�ܣ����׳�����AssertionError
		assert age > 0 : "Ԥ������Ӧ���Ǵ���0����ֵ��ʵ������" + age;
		
		System.out.println(age);

	}

}
