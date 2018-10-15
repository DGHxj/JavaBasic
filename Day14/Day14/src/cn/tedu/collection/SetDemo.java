package cn.tedu.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// 添加元素
		set.add("dsa");
		set.add("egd");
		set.add("abd");
		set.add("hoj");
		// 如果添加重复的元素，这个重复的元素会被舍弃
		set.add("egd");
		System.out.println(set);
		
	}

}
