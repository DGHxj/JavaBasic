package cn.tedu.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		// 保证元素的存入顺序
		list.add("bdd");
		list.add("abd");
		list.add("egd");
		list.add("eds");
		list.add("abd");
		list.add(null);

		// 截取子列表
		System.out.println(list.subList(1, 3));

		// 获取指定的元素在列表中第一次出现的位置
		// System.out.println(list.indexOf("abd"));

		// List<String> list2 = new ArrayList<String>();
		// list2.add(new String("bdd"));
		// list2.add("abd");
		// list2.add("egd");
		// list2.add("eds");

		// 比较两个列表的时候是逐位比较是否一致
		// System.out.println(list.equals(list2));
		// for(int i = 0; i < list.size(); i++)
		// System.out.println(list.get(i));

		// 获取指定下标上的元素
		// System.out.println(list.get(1));

		// 向列表的指定的下标插入指定的元素
		// list.add(1,"fec");
		// list.add(4, "fec");
		// list.add(6, "fec");

		// 移除指定下标上的元素
		// list.remove(0);
		// list.remove(5);

		// 替换指定位置上的元素
		// list.remove(2);
		// list.add(2, "abc");
		// list.set(2, "abc");

		System.out.println(list);

	}

}
