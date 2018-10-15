package cn.tedu.collection;

import java.util.Arrays;

public class ListExer {

	public static void main(String[] args) {

		ArrList list = new ArrList(1);

		list.add("abc");
		list.add("abc");
		list.add("def");

		// list.add(0, "hijk");

		list.remove(0);

		System.out.println(list);

	}

}

class ArrList {

	private String[] data;

	// 记录元素的个数
	private int size = 0;

	public ArrList() {
		data = new String[10];
	}

	public ArrList(int initialCapacity) {

		if (initialCapacity < 0)
			throw new IllegalArgumentException();

		data = new String[initialCapacity];
	}

	// 添加元素
	public void add(String str) {

		// 判断是否需要扩容
		if (size >= data.length)
			this.grow();

		data[size++] = str;

	}

	// 扩容
	private void grow() {
		if (data.length <= 1)
			data = Arrays.copyOf(data, data.length + 1);
		else
			data = Arrays.copyOf(data, data.length + (data.length >> 1));
	}

	// 插入元素
	public void add(int index, String str) {

		// 判断下标越界
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// 判断扩容
		if (size >= data.length)
			this.grow();

		// 挪动元素空出对应的位置
		// for (int i = size - 1; i >= index; i--) {
		// data[i + 1] = data[i];
		// }
		System.arraycopy(data, index, data, index + 1, size - index);
		// // 插入元素
		data[index] = str;

		size++;
	}

	private void out(int index) {
		// 判断下标越界
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

	}

	// 根据下标移除指定的元素
	public void remove(int index) {

		this.out(index);

		// for(int i = index; i < size - 1; i++){
		// data[i] = data[i + 1];
		// }
		System.arraycopy(data, index + 1, data, index, size - (index + 1));

		size--;

	}

	// 移除指定的元素
	public void remove(String str) {

		// 首先先找到这个元素出现的位置
		int index = indexOf(str);

		if (index != -1)
			this.remove(index);

	}

	// 找这个元素第一次出现的位置
	public int indexOf(String str) {

		for (int i = 0; i < size; i++) {

			if (data[i] == str || data[i] != null && data[i].equals(str))
				return i;
		}

		return -1;

	}

	public void clear() {
		data = new String[10];
		size = 0;
	}

	public boolean contains(String str) {
		return indexOf(str) != -1;
	}

	public String get(int index) {

		this.out(index);

		return data[index];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void set(int index, String str) {

		this.out(index);

		data[index] = str;

	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("[");

		for (int i = 0; i < size; i++) {
			sb.append(data[i]).append(", ");
		}

		String str = sb.toString();

		if (size > 0)
			str = str.substring(0, str.length() - 2);

		return str += "]";

	}
}
