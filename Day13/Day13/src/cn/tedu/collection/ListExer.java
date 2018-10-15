package cn.tedu.collection;

import java.util.Arrays;

public class ListExer {

}

class ArrList {

	private String[] data;

	// ��¼Ԫ�صĸ���
	private int size = 0;

	public ArrList() {
		data = new String[10];
	}

	public ArrList(int initialCapacity) {

		if (initialCapacity < 0)
			throw new IllegalArgumentException();

		data = new String[initialCapacity];
	}

	// ���Ԫ��
	public void add(String str) {

		// �ж��Ƿ���Ҫ����
		if (size >= data.length)
			this.grow();

		data[size++] = str;

	}

	// ����
	private void grow() {
		if (data.length <= 1)
			data = Arrays.copyOf(data, data.length + 1);
		else
			data = Arrays.copyOf(data, data.length + (data.length >> 1));
	}

	// ����Ԫ��
	public void add(int index, String str) {

		// �ж��±�Խ��
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// �ж�����
		if (size >= data.length)
			this.grow();

		// Ų��Ԫ�ؿճ���Ӧ��λ��
		// for (int i = size - 1; i >= index; i--) {
		// data[i + 1] = data[i];
		// }
		// // ����Ԫ��
		// data[index] = str;
		System.arraycopy(data, index, data, index + 1, size - index);

		size++;
	}

	public void remove(int index) {

		// �ж��±�Խ��
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// for(int i = index; i < size - 1; i++){
		// data[i] = data[i + 1];
		// }
		System.arraycopy(data, index + 1, data, index, size - (index + 1));

		size--;

	}

}