package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 输入一个字符串，统计其中每一个字符出现的次数
 */
public class MapExer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.next();

		// 定义一个映射，键存储字符，值存储个数
		Map<Character, Integer> map = new HashMap<>();

		// 遍历字符串，然后统计每一个字符出现的次数
		for (int i = 0; i < str.length(); i++) {
			// 获取对应位置的字符
			char c = str.charAt(i);
			// 判断这个字符在映射是否出现过
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		// 遍历映射
		for (Map.Entry<Character, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());

	}

}
