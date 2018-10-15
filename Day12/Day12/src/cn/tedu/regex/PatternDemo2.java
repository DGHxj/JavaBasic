package cn.tedu.regex;

import java.util.Arrays;

public class PatternDemo2 {

	public static void main(String[] args) {

		String str = "0dhsol5bkldf62nlsdn3nl7752";

		// 以数字作为切割符将字符串切开
		// 作为切割符的符号会被切掉
		// 在字符串最末尾的切割符会被整个切掉
		// 除了在末尾的切割符以外，其余的相邻的切割符之间也会切出一个空字符串
		String[] strs = str.split("\\d");
		System.out.println(strs.length);
		System.out.println(Arrays.toString(strs));

	}

}
