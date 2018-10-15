package cn.tedu.collection;

public class ListExer2 {

	public static void main(String[] args) {

		LinkList list = new LinkList();

		list.add("a");
		list.add("b");
		list.add("c");

		// list.add(0,"d");
		// list.add(1, "e");

		// list.remove(0);
		// list.remove(2);
		for(int i=0;i<3;i++){
			list.remove(0);
			System.out.println(list);
		}

	}

}

class LinkList {

	private int size = 0; // 节点个数
	private Node first; // 第一个节点
	private Node last; // 最后一个节点

	public LinkList() {
	}

	public void add(String str) {

		// 创建节点存储数据
		Node node = new Node(null, str, null);

		// 列表此时为空
		if (size == 0) {
			// 如果列表为空，则头结点指向新节点
			this.first = node;
		} else {
			// 原来的尾节点的下一位置为新节点
			this.last.next = node;
			// 新节点的上一位是原来的尾节点
			node.prev = this.last;
		}
		// 新的节点变成了尾节点
		this.last = node;
		size++;
	}

	public void add(int index, String str) {

		// 判断下标是否越界
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// 在尾部追加
		if (index == size) {
			this.add(str);
			return;
		}

		Node node = new Node(null, str, null);
		// 插入的头部
		if (index == 0) {
			node.next = this.first;
			this.first.prev = node;
			this.first = node;
		} else {

			Node no = this.getNode(index);

			// 原节点的上一个节点的下一位变成新的节点
			no.prev.next = node;
			// 新的节点的上一位是原节点的上一位
			node.prev = no.prev;
			// 新节点的下一位是原来的节点
			node.next = no;
			// 原节点的上一位是新的节点
			no.prev = node;

		}
		size++;

	}

	private Node getNode(int index) {
		// 获取指定位置的节点
		Node no = this.first;
		for (int i = 0; i < index; i++) {
			no = no.next;
		}
		return no;
	}

	private void out(int index) {
		// 判断下标越界
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

	}

	public void remove(int index) {

		this.out(index);

		// 头部
		if (index == 0) {
			this.first = this.first.next;
			this.first.prev = null;
		} /* 尾部 */ else if (index == size - 1) {
			this.last = this.last.prev;
			this.last.next = null;
		} else {
			Node node = this.getNode(index);

			// 原节点的上一个节点的下一位变成原节点的下一位
			node.prev.next = node.next;
			// 原节点的下一个节点的上一位变成原节点的上一位
			node.next.prev = node.prev;
		}
		size--;
	}

	public int indexOf(String str) {

		Node node = this.first;
		for (int i = 0; i < size; i++) {
			String data = node.data;
			if (data == str || data != null && data.equals(str))
				return i;

			node = node.next;

		}

		return -1;

	}

	public String toString() {

		StringBuilder sb = new StringBuilder("[");
		Node node = this.first;
		for (int i = 0; i < size; i++) {
			sb.append(node.data).append(", ");
			node = node.next;
		}

		String str = sb.toString();
		if (size > 0)
			str = str.substring(0, str.length() - 2);

		return str += "]";
	}

	// 利用节点存储数据
	private class Node {

		Node prev; // 上一个节点
		String data; // 元素
		Node next; // 下一个节点

		public Node(Node prev, String data, Node next) {
			super();
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

	}

}