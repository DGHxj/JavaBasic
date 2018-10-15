package cn.tedu.regex;

public class PatternDemo2 {

	public static void main(String[] args) {

		String str = "d";

		// 判断字符串：
		// 由3个字母组成
		// 第一个字母是a/b/c
		// 第二个字母是d/e/f/g
		// 第三个字母是x/y/z
		// System.out.println(str.matches("[abc][defg][xyz]"));

		// 匹配由一个字母组成的字符串
		// System.out.println(str.matches("[a-zA-Z]"));
		// 匹配由一个数字组成的字符串
		// System.out.println(str.matches("[0-9]"));
		// System.out.println(str.matches("\\d"));

		// 匹配由一个字符组成的字符串，但不是a/b/c
		// [^...] 表示除了这些字符
		System.out.println(str.matches("[^abc]"));
	}

}
