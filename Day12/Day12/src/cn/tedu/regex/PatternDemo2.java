package cn.tedu.regex;

import java.util.Arrays;

public class PatternDemo2 {

	public static void main(String[] args) {

		String str = "0dhsol5bkldf62nlsdn3nl7752";

		// ��������Ϊ�и�����ַ����п�
		// ��Ϊ�и���ķ��Żᱻ�е�
		// ���ַ�����ĩβ���и���ᱻ�����е�
		// ������ĩβ���и�����⣬��������ڵ��и��֮��Ҳ���г�һ�����ַ���
		String[] strs = str.split("\\d");
		System.out.println(strs.length);
		System.out.println(Arrays.toString(strs));

	}

}
