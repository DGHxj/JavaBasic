package cn.tedu.baozhuang;

public class IntegerDemo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// int i = 7;
		// 利用基本类型的数据构建了对应的引用类型的对象 --- 封箱
		// Integer in = new Integer(i);

		// 自动封箱/拆箱是JDK1.5的特性之一
		// 将基本类型的数据直接赋值给了对应的引用类型的对象 --- 自动封箱
		// 自动封箱在底层会默认调用Integer类身上的静态方法valueOf
		// Integer in = Integer.valueOf(i);
		// Integer in = i;

		// double d = 3.5;
		// Double dou = Double.valueOf(d);
		// Double dou = d;

		// char c = 'a';
		// Character ch = c;

		Integer in = new Integer(5);
		// 将引用类型的对象直接赋值给了对应的基本类型的变量 --- 自动拆箱
		// 自动拆箱在底层会默认调用对象身上的***Value()
		// int i = in.intValue();
		int i = in;

		Double dou = new Double(2.8);
		// Double d = dou.doubleValue();
		double d = dou;

		Boolean bo = new Boolean(false);
		// boolean b = bo.booleanValue();
		boolean b = bo;

	}

}
