package cn.tedu.collection;

import java.util.Arrays;

public class ListExer {

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
		// // 插入元素
		// data[index] = str;
		System.arraycopy(data, index, data, index + 1, size - index);

		size++;
	}

	public void remove(int index) {

		// 判断下标越界
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// for(int i = index; i < size - 1; i++){
		// data[i] = data[i + 1];
		// }
		System.arraycopy(data, index + 1, data, index, size - (index + 1));

		size--;

	}

}