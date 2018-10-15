package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {

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

		// Collections.sort(list);

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.charAt(0) - o2.charAt(0);
			}
		});

		System.out.println(list);

	}

}
