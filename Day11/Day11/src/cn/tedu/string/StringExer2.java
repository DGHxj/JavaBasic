package cn.tedu.string;

import java.util.Scanner;

/**
 * 输入一个字符串，将其中的数字提取出来并求和
 */
public class StringExer2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// 获取到字符串
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		// 记录和
		int sum = 0;
		
		// 将字符串转化为字符数组
		char[] cs = str.toCharArray();
		
		// 遍历字符数组，提取其中的数字
		for (char c : cs) {
			
			if(c >= '0' && c <= '9')
				sum += (c - '0');
			
		}
		
		System.out.println(sum);
		
	}

}
