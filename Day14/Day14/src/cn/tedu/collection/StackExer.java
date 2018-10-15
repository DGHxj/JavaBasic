package cn.tedu.collection;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackExer {

}

class LinkStack {

	private int size = 0;
	private Node first;

	public boolean empty() {
		return size == 0;
	}

	public void push(String str) {

		Node node = new Node(null, str);

		if (size != 0) {
			node.next = this.first;
		}
		this.first = node;
		size++;

	}

	public String peek() {
		if (size == 0)
			throw new EmptyStackException();

		return this.first.data;
	}

	public String pop() {
		String str = this.peek();
		this.first = this.first.next;
		size--;
		return str;
	}

	public int search(String str) {

		Node node = this.first;
		for (int i = 0; i < size; i++) {

			if (node.data == str || str != null && str.equals(node.data))
				return i + 1;

			node = node.next;

		}

		return -1;

	}

	private class Node {

		Node next;
		String data;

		public Node(Node next, String data) {
			super();
			this.next = next;
			this.data = data;
		}

	}

}

class ArrStack {

	private String[] data = new String[10];
	private int size = 0;

	public boolean empty() {
		return size == 0;
	}

	public String peek() {
		// 判断栈中是否有元素
		if (size == 0)
			throw new EmptyStackException();

		return data[size - 1];
	}

	public String pop() {

		String str = this.peek();
		size--;
		return str;

	}

	public void push(String str) {

		// 判断是否需要扩容
		if (size >= data.length)
			data = Arrays.copyOf(data, data.length * 2);

		data[size++] = str;

	}

	public int search(String str) {

		// for(int i = size - 1, j = 1; i >= 0; i--, j++){
		//
		// if(str == data[i] || str != null && str.equals(data[i]))
		// return j;
		//
		// }
		for (int i = size - 1; i >= 0; i--) {

			if (str == data[i] || str != null && str.equals(data[i]))
				return size - i;

		}

		return -1;

	}

}