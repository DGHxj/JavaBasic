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

		// ��ʽ�ṹ���������������������Ĳ��������е�����
		// JDK1.8��������֮һ
		Stream<String> stream = list.stream();
		// System.out.println(stream.allMatch(str -> str.matches(".*\\d.*")));

		// �жϼ������Ƿ��������ĸa��ͷ���ַ���
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
