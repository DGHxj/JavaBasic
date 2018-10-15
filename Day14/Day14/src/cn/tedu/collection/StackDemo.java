package cn.tedu.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();

		// 添加元素
		s.push("d");
		s.push("a");
		s.push("e");
		s.push("s");
		s.push("h");
		
		// 从栈顶到栈底依次查找，以1基数
		System.out.println(s.search("a"));
		
		// 判断栈是否为空
		// System.out.println(s.empty());

		// 查看栈顶元素
		// 如果栈为空，则抛出空栈异常
		// System.out.println(s.peek());

		// 移除栈顶元素
		// System.out.println(s.pop());

		System.out.println(s);
	}

}
