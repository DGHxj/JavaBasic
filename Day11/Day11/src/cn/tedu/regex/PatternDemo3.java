package cn.tedu.regex;

public class PatternDemo3 {

	public static void main(String[] args) {

		String str = ".";

		// 匹配由a开头的由2个字符组成的字符串
		// . 表示通配符，可以匹配任意一个类型的字符
		// System.out.println(str.matches("a."));

		// 判断是否是一个 .
		// \\. Java先转义为\. ,正则再转义为.
		// System.out.println(str.matches("\\."));

		// 怎么匹配 \
		// \\\\ Java先转义为\\ ,正则再转义为\
		System.out.println(str.matches("\\\\"));

	}

}
