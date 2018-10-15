package cn.tedu.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		// Vector<String> v = new Vector<String>();
		// 表示向量的初始容量是10，每次扩容增加5个
		// Vector<String> v = new Vector<String>(10, 5);
		// System.out.println(v.capacity());
		//
		// for (int i = 0; i < 21; i++) {
		// v.add("a");
		// }
		//
		// System.out.println(v.capacity());

		Vector<String> v = new Vector<String>();

		v.add("a");
		v.add("d");
		v.add("t");
		v.add("h");

		// 获取迭代器
		Enumeration<String> e = v.elements();

		// 判断后续是否还有元素
		while (e.hasMoreElements()) {

			// 挪动指针获取这一个元素
			String str = e.nextElement();
			System.out.println(str);

			// 无法清空集合
			// v.remove(str);
		}

		System.out.println(v);
	}

}
