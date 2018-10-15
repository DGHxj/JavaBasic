package cn.tedu.string;

public class StringDemo1 {

	public static void main(String[] args) {

		// String str1 = "hobfdvsdaho";
		// String str2 = "HOBFDVSDAHO";

		// 按照自然顺序比较两个字符串
		// 字符串在底层是以字符数组形式来存储，所以底层也是以字符数组形式来操作
		// 在比较俩字符数组的时候，会遍历两个字符数组
		// 在遍历过程中会利用两个字符数组对应位置上的字符进行相减
		// 相减的差如果不为0，则将这个差作为结果进行返回
		// 如果当前位置的字符相减的差为0，则继续下一位相减
		// 在相减过程可能每一位字符相减都为0，但是有一个字符串首先遍历完
		// 返回两个字符串的长度之差
		// 如果返回值是一个正数，表示对象str1 > 参数str2
		// 如果返回值是一个负数，表示对象str1 < 参数str2
		// System.out.println(str1.compareTo(str2));
		// System.out.println(str1.compareToIgnoreCase(str2));

		// String s1 = "abc";
		// String s2 = "def";
		// 表示将参数拼接到末尾 --- 实际上是返回了一个新的字符串
		// 本质上是利用数组复制产生了一个新的数组
		// System.out.println(s1 = s1.concat(s2));
		// System.out.println(s1);

		String str = "chaodbv9aobno";
		// 判断是否包含指定的子串
		System.out.println(str.contains("bo"));

	}

}
