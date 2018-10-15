package cn.tedu.string;

public class StringDemo2 {

	public static void main(String[] args) {

		String str = "DHAOngda";
		String str2 = new String("DhaONgda");
		
		// 将字符串转化为大写
		System.out.println(str.toUpperCase());
		// 将字符串转化为小写
		System.out.println(str2.toLowerCase());

		// 比较两个字符串是否相等
		// 重写equals，底层实际上是逐位比较
		// System.out.println(str.equals(str2));
		// System.out.println(str.equalsIgnoreCase(str2));

		// 判断是否以指定的子串作为结尾
		// System.out.println(str.endsWith("a"));

		// 判断是否以指定的子串作为开头
		// System.out.println(str.startsWith("f"));

	}

}
