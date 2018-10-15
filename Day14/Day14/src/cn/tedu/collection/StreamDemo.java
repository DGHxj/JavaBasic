package cn.tedu.collection;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("abe");
		list.add("egs");
		list.add("dgse");
		list.add("3sdf");
		list.add("sdh8");
		list.add("dbks");
		list.add("vn3hdso");

		// 流式结构，但不是流，可以批量的操作集合中的数据
		// JDK1.8的新特性之一
		Stream<String> stream = list.stream();
		// System.out.println(stream.allMatch(str -> str.matches(".*\\d.*")));

		// 判断集合中是否包含以字母a开头的字符串
		System.out.println(stream.anyMatch(str -> str.startsWith("a")));
		// stream.filter(new Predicate<String>() {
		//
		// @Override
		// public boolean test(String t) {
		// return t.matches(".*\\d.*");
		// }
		// }).forEach(new Consumer<String>() {
		//
		// @Override
		// public void accept(String t) {
		// System.out.println(t);
		// }
		// });
		// stream.filter(str -> str.matches(".*\\d.*"))
		// .map(str -> str.replaceAll("\\d", ""))
		// .forEach(str -> System.out.println(str));

		// for (String str : list) {
		// if (str.matches(".*\\d.*")) {
		// str = str.replaceAll("\\d", "");
		// System.out.println(str);
		// }
		// }

	}

}
