package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("d", 4);
		map.put("h", 7);
		map.put("z", 7);
		map.put("o", 3);
		map.put("t", 3);

		// 遍历映射
		// 方式一：先获取映射中所有的键组成的集合，然后通过键获取对应的值
		// keySet表示将映射中的所有的键放入一个Set集合中
		// Set<String> set = map.keySet();
		// for (String key : set) {
		// System.out.println(key + "=" + map.get(key));
		// }
		// 方式二：将所有的键值对放入集合中，然后遍历集合获取这个键值对的数据
		// entrySet表示将映射中的所有的键值对放入一个Set集合中
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		// 遍历集合，然后从键值对中获取键和值
		for (Map.Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

	}

}
