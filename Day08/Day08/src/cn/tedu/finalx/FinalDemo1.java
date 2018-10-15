package cn.tedu.finalx;

import java.util.Arrays;

public class FinalDemo1 {

	public static void main(String[] args) {

		// final int i = 9;
		final int i;
		i = 13;

		// arr��һ������->��ַ���ɱ�
		final int[] arr = { 3, 6, 1, 7, 0 };
		arr[1] = 8;

		// ���ݵ���i��ʵ��ֵ
		changeValue(i);
		System.out.println(i);

		expand(arr);
		System.out.println(arr.length);
	}

	// ����������в�û�н�����i����Ϊ����
	public static void changeValue(int i) {
		i++;
	}

	public static void expand(int[] arr) {
		arr = Arrays.copyOf(arr, arr.length * 2);
	}

}

class A {

	// ��Ա����
	// ��Ա����i�����ڶ�����ȫ�������֮ǰ��ֵ
	// final int i = 6;
	final int i;
	int j;

	// ��̬������������������֮ǰ��ֵ
	// static final int k = 0;
	static final int k;
	static {
		k = 7;
	}

	// {
	// i = 10;
	// }

	public A() {
		this.i = 8;
	}
}
