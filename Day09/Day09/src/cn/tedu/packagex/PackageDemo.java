package cn.tedu.packagex;

// * ͨ���
// * ��ʾ���뵱ǰ���µ����е��൫�ǲ������Ӱ��µ���
import java.util.*;

public class PackageDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		Arrays.sort(arr);

	}

}
