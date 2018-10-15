package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ����һ���ַ�����ͳ������ÿһ���ַ����ֵĴ���
 */
public class MapExer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ��ȡ�ַ���
		Scanner s = new Scanner(System.in);
		String str = s.next();

		// ����һ��ӳ�䣬���洢�ַ���ֵ�洢����
		Map<Character, Integer> map = new HashMap<>();

		// �����ַ�����Ȼ��ͳ��ÿһ���ַ����ֵĴ���
		for (int i = 0; i < str.length(); i++) {
			// ��ȡ��Ӧλ�õ��ַ�
			char c = str.charAt(i);
			// �ж�����ַ���ӳ���Ƿ���ֹ�
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		// ����ӳ��
		for (Map.Entry<Character, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());

	}

}
