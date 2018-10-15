package cn.tedu.regex;

public class PatternDemo4 {

	public static void main(String[] args) {

		String str = "a";

		// 数量词
		// 匹配由a开头至少由2个字符组成的字符串
		// System.out.println(str.startsWith("a") && str.length() >= 2);
		// + 表示之前的字符至少出现1次 >= 1
		// System.out.println(str.matches("a.+"));

		// 匹配由小写字母开头由数字结尾的字符串
		// * 表示之前的字符可有可无 >= 0
		// System.out.println(str.matches("[a-z].*\\d"));
		
		// 匹配由a开头至多2个字符组成的字符串
		// ? 表示之前的字符至多出现1次 <= 1
		System.out.println(str.matches("a.?"));

	}

}
