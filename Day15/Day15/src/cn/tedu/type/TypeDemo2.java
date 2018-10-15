package cn.tedu.type;

public class TypeDemo2 {

	public static void main(String[] args) {

		Demo<String, Integer> demo = new Demo<>();
		demo.set("abc");
		System.out.println(demo.get());
	}

}

// <T> 表示定义了一个泛型叫T
// 泛型的命名只要符合标识符的命名规则即可
// 习惯上泛型一般只使用一个大写字母进行命名
// T type
// E element
// K key
// V value
// R result/return
class Demo<T, E> {

	// 泛型定义的变量不能直接实例化
	private T t;
	E e;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}
