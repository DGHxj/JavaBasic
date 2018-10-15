package cn.tedu.string;

public class StringDemo3 {

	public static void main(String[] args) {

		// String str = "vhaovldasnoasbo";

		// 获取字符串的长度
		// System.out.println(str.length());

		// 通过指定的下标获取字符串对应位置上的字符
		// char c = str.charAt(4);
		// System.out.println(c);

		// 将字符串转化为字符数组形式
		// char[] cs = str.toCharArray();
		// for (char c : cs) {
		// System.out.println(c);
		// }

		char[] cs = { 'd', 'e', 'g', 'y', 'c', 'r', 'n', 'u', 'a', 'u' };

		// 将字符数组转化为字符串
		// String str = new String(cs);
		//从第3个开始  转化5个
		String str = new String(cs, 3, 5);
		System.out.println(str);
	}

}
