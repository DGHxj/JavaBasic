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
		System.arraycopy(data, index, data, index + 1, size - index);
		// // ����Ԫ��
		data[index] = str;

		size++;
	}

	private void out(int index) {
		// �ж��±�Խ��
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

	}

	// �����±��Ƴ�ָ����Ԫ��
	public void remove(int index) {

		this.out(index);

		// for(int i = index; i < size - 1; i++){
		// data[i] = data[i + 1];
		// }
		System.arraycopy(data, index + 1, data, index, size - (index + 1));

		size--;

	}

	// �Ƴ�ָ����Ԫ��
	public void remove(String str) {

		// �������ҵ����Ԫ�س��ֵ�λ��
		int index = indexOf(str);

		if (index != -1)
			this.remove(index);

	}

	// �����Ԫ�ص�һ�γ��ֵ�λ��
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
