package cn.tedu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		list.add("abe");
		list.add("egs");
		list.add("dgse");
		list.add("dase");
		list.add("3sdf");
		list.add("sdh8");
		list.add("dbks");
		list.add("vn3hdso");
		
		// 通过iterator方法获取到一个Iterator对象
		Iterator<String> it = list.iterator();
		
		// 判断是否有下一个元素
		while(it.hasNext()){
			
			// 挪动指针获取这个元素
			String str = it.next();
			System.out.println(str);
			
			// 通过迭代器自带的remove方法来移除当前在迭代的元素
			// it.remove();
			list.remove(str);
		}
		
		System.out.println(list);

	}

}
