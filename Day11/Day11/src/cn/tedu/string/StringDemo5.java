package cn.tedu.string;

public class StringDemo5 {

	public static void main(String[] args) {

		// String str = "vahoaoagaln";

		// System.out.println(str.toString());

		// 将字符串中所有的'a'替换为'+'
		// System.out.println(str.replace('a', '+'));

		// 截取子字符串
		// System.out.println(str.substring(5));
		// 在程序中，方法中使用范围的时候，往往是包头不包尾
		// System.out.println(str.substring(2, 5));
		
		// 去掉字符串前后的空白字符
		String str = "      bdhaon \t \r\n \t";
		System.out.println(str);
		System.out.println(str.trim());

	}

}
