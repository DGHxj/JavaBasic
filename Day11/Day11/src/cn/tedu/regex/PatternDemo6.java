package cn.tedu.regex;

public class PatternDemo6 {

	public static void main(String[] args) {

//		String str = "fabtab";

		// 判断含有至少2个ab的字符串
		// () 捕获组
		// 正则表达式会对其中的捕获组进行自动的编号
		// 编号是从1开始的
		// System.out.println(str.matches(".*(ab).*(ab).*"));
		// \\n 表示引用前边编号为n的捕获组
//		 System.out.println(str.matches(".*(ab).*\\1.*"));

		// 捕获组的编号是从捕获组的左半边括号出现的位置开始计算的
		// (A((BC)(D))E)(F)
		// \\1 A((BC)(D))E
		// \\2 (BC)(D)
		// \\3 BC
		// \\4 D
		// \\5 F

		// 判断一个字符串是否是一个叠字字符串
		// 哈哈哈 啊啊啊啊
		 String str = "笑哈哈";
		 System.out.println(str.matches("哈{2,}"));
		 System.out.println(str.matches("(.)\\1+"));
		// 表示匹配由至少2个字符组成的字符串
		// System.out.println(str.matches("(.){2,}"));

		// 匹配AABB形式的词语
		// 欢欢喜喜
		// String str = "上上下下";
		// System.out.println(str.matches("(.)\\1(.)\\2"));

		// 匹配ABAB形式的词语
		// 休息休息 溜达溜达
		// String str = "休息休息";
		// System.out.println(str.matches("(..)\\1"));

	}

}
