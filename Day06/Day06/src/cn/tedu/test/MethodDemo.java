package cn.tedu.test;

public class MethodDemo {

	// Alt + / ��ʾ��
	// Ctrl+F11 ����
	// Ctrl + Shift + O ����
	// Ctrl+D ɾ��һ��
	// Ctrl+/ ����ע��/ȡ������ע��
	// Ctrl+Shift+/ ����ע��
	// Ctrl+Shift+\ ȡ������ע��
	// Alt+��/�� ����/���ƶ�
	public static void main(String[] args) {

		System.out.println(add(100000));

	}

	public static int add(int n) {

		if (n == 1)
			return 1;

		return n + add(n - 1);

	}

}
