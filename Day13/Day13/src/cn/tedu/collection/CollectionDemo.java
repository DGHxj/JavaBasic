package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

		// 集合中存储的元素类型是String
		Collection<String> c = new ArrayList<String>();

		// 添加元素
		c.add("gwe");
		c.add("hred");
		c.add("hrd");
		c.add("ater");

		// 将集合转化为数组
		// String[] os = (String[]) c.toArray();
		// Object[] os = c.toArray();
		// for (Object o : os) {
		// System.out.println(((String) o).length());
		// }
		String[] strs = c.toArray(new String[0]);
		for (String str : strs) {
			System.out.println(str.length());
		}

		// 获取集合中的元素个数
		// System.out.println(c.size());

		// 清空集合
		// c.clear();

		// 判断集合是否为空
		// System.out.println(c.isEmpty());

		// 判断元素是否存在
		// System.out.println(c.contains("hrd"));
		// System.out.println(c.contains("aft"));

		// 从集合中移除指定的元素
		// c.remove("gwe");
		// 如果元素不存在，会直接跳过
		// c.remove("age");

		System.out.println(c);

	}

}
