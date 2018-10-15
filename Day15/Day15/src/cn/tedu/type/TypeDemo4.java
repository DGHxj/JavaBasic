package cn.tedu.type;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo4 {

	public static void main(String[] args) {

		List<Integer> ins = new ArrayList<>();
		ins.add(3);
		ins.add(4);
		ins.add(6);
		ins.add(7);
		ins.add(0);
		List<Double> dos = new ArrayList<>();
		dos.add(3.6);
		dos.add(4.2);
		dos.add(6.8);
		dos.add(7.7);
		dos.add(0.2);

		// 泛型不存在向下兼容
		print(ins);
		print(dos);

		// List<String> strs = new ArrayList<>();
		// print(strs);

	}

	// 写一个新的方法来遍历元素类型是数字的列表
	// 元素类型是Number或者是其子类
	// ? extends 类/接口 表示传入这个类/接口或者是其子类/子接口对象
	// 所能传入的元素的最大类型限定为Number
	// 规定了泛型的上限
	public static void print(List<? extends Number> list) {

		// 不能再添加任何元素除非是null
		list.add(null);
		
		for (Number n : list) {
			System.out.println(n);
		}

	}
	
	// 泛型的下限
	// 传入元素类型是String及其父类的列表
	// ? super 类/接口 表示传入这个类/接口及其父类/父接口的对象
	// 表示传入的最小类型是String
	public static void m(List<? super String> list){
		
		list.add("abc");
		for (Object o : list) {
			System.out.println(o);
		}
		
	}

}
