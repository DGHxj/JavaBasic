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

	private int size = 0; // �ڵ����
	private Node first; // ��һ���ڵ�
	private Node last; // ���һ���ڵ�

	public LinkList() {
	}

	public void add(String str) {

		// �����ڵ�洢����
		Node node = new Node(null, str, null);

		// �б��ʱΪ��
		if (size == 0) {
			// ����б�Ϊ�գ���ͷ���ָ���½ڵ�
			this.first = node;
		} else {
			// ԭ����β�ڵ����һλ��Ϊ�½ڵ�
			this.last.next = node;
			// �½ڵ����һλ��ԭ����β�ڵ�
			node.prev = this.last;
		}
		// �µĽڵ�����β�ڵ�
		this.last = node;
		size++;
	}

	public void add(int index, String str) {

		// �ж��±��Ƿ�Խ��
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// ��β��׷��
		if (index == size) {
			this.add(str);
			return;
		}

		Node node = new Node(null, str, null);
		// �����ͷ��
		if (index == 0) {
			node.next = this.first;
			this.first.prev = node;
			this.first = node;
		} else {

			Node no = this.getNode(index);

			// ԭ�ڵ����һ���ڵ����һλ����µĽڵ�
			no.prev.next = node;
			// �µĽڵ����һλ��ԭ�ڵ����һλ
			node.prev = no.prev;
			// �½ڵ����һλ��ԭ���Ľڵ�
			node.next = no;
			// ԭ�ڵ����һλ���µĽڵ�
			no.prev = node;

		}
		size++;

	}

	private Node getNode(int index) {
		// ��ȡָ��λ�õĽڵ�
		Node no = this.first;
		for (int i = 0; i < index; i++) {
			no = no.next;
		}
		return no;
	}

	private void out(int index) {
		// �ж��±�Խ��
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

	}

	public void remove(int index) {

		this.out(index);

		// ͷ��
		if (index == 0) {
			this.first = this.first.next;
			this.first.prev = null;
		} /* β�� */ else if (index == size - 1) {
			this.last = this.last.prev;
			this.last.next = null;
		} else {
			Node node = this.getNode(index);

			// ԭ�ڵ����һ���ڵ����һλ���ԭ�ڵ����һλ
			node.prev.next = node.next;
			// ԭ�ڵ����һ���ڵ����һλ���ԭ�ڵ����һλ
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

	// ���ýڵ�洢����
	private class Node {

		Node prev; // ��һ���ڵ�
		String data; // Ԫ��
		Node next; // ��һ���ڵ�

		public Node(Node prev, String data, Node next) {
			super();
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

	}

}