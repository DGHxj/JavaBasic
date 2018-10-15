package cn.tedu.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo1 {

	public static void main(String[] args) {

		String str = "abc";

		// 判断字符串是否是abc
		// System.out.println(str.equals("abc"));
		// 编译正则规则形式
		// Pattern p = Pattern.compile("abc");
		// 将正则进行匹配
		// Matcher m = p.matcher(str);
		// 进行判断
		// boolean b = m.matches();
		
		// 判断字符串：
		// 由3个字母组成
		// 第一个字母是a/b/c
		// 第二个字母是d/e/f/g
		// 第三个字母是x/y/z
		Pattern p = Pattern.compile("[bac][gedf][xyz]");
		Matcher m = p.matcher(str);
		boolean b = m.matches();
		System.out.println(b);

	}

}
