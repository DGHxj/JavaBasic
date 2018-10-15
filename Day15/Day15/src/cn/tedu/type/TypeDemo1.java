package cn.tedu.type;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class TypeDemo1 {

	public static void main(String[] args) {

		// 在早期没有泛型的限制的时候，集合中存储元素是Object类型
		// List list = new ArrayList();
		// List<String> list = new ArrayList();
		// List list = new ArrayList<String>();
		// List<String> list = new ArrayList<String>();
		// 从JDK1.7开始，后边实现类的泛型可以省略不写
		// 会根据程序的上文来进行类型的自动推导
		List<String> list = new ArrayList<>();

		list.add("a");
		// list.add(5);
		// list.add(3.5);
		// list.add(new Object());

		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// Object o = it.next();
		//
		// if (o instanceof String) {
		// String str = (String) o;
		// } else if (o instanceof Integer) {
		// Integer in = (Integer) o;
		// }
		// }

	}

	// public static void m(List list){}

}
