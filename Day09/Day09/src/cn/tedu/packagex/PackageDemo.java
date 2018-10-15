package cn.tedu.packagex;

// * 通配符
// * 表示导入当前包下的所有的类但是不包括子包下的类
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
