package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		// 添加元素
		map.put("d", 4);
		map.put("h", 7);
		map.put("z", 7);
		map.put("o", 3);
		map.put("t", 3);
		// 如果键相同则对应的值覆盖
		map.put("o", 0);
		map.put("e", null);

		// 获取键值对的个数
		System.out.println(map.size());

		// 移除键值对
		// map.remove("o");

		// 判断键是否存在
		// System.out.println(map.containsKey("f"));
		// 判断值是否存在
		// System.out.println(map.containsValue(4));

		// 根据指定的键获取对应的值
		// System.out.println(map.get("o"));
		// 如果键不存在则返回null
		// System.out.println(map.get("y"));

		System.out.println(map);

	}

}
