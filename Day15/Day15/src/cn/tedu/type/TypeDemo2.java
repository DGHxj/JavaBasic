package cn.tedu.type;

public class TypeDemo2 {

	public static void main(String[] args) {

		Demo<String, Integer> demo = new Demo<>();
		demo.set("abc");
		System.out.println(demo.get());
	}

}

// <T> ��ʾ������һ�����ͽ�T
// ���͵�����ֻҪ���ϱ�ʶ�����������򼴿�
// ϰ���Ϸ���һ��ֻʹ��һ����д��ĸ��������
// T type
// E element
// K key
// V value
// R result/return
class Demo<T, E> {

	// ���Ͷ���ı�������ֱ��ʵ����
	private T t;
	E e;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}
