package cn.tedu.regex;

public class PatternDemo5 {

	public static void main(String[] args) {

		String str = "gbbsdardfdjvt";

		// 匹配由5个小写字母组成的字符串
		// {n} 表示之前的字符恰好出现n次 == n
		 System.out.println(str.matches("[a-z]{5}"));

		// 匹配至少由5个小写字母组成的字符串
		// System.out.println(str.matches("[a-z]{5,}"));

		// 匹配由8-12个小写字母组成的字符串
		System.out.println(str.matches("[a-z]{8,13}"));
	}

}
