package cn.tedu.extendsx.b;

import cn.tedu.extendsx.a.A;

public class E extends A {

	public static void main(String[] args) {

		// D d = new D();
		// d对象的声明类是D类，所以d对象所对应的子类是D类
		// 因此d对象使用m方法需要在对应的子类D类中使用
		// 子类对象使用的时候必须在对应的子类中使用
		// d.m();

	}

}
// public class E {
//
// public static void main(String[] args) {
//
// D d = new D();
// // 虽然D通过继承A可以使用A类中m方法，但是m方法最终定义在A类中
// // m方法的权限是protected：本类中、子类中、同包类中
// // m方法的本类是A类，E和A是本类中？--- 不是
// // m方法是在E类中，E是A的子类吗？ --- 不是
// // E类所在的包是b包，A类所在的包是a包，所以E和A是同包类吗？---不是
// d.m();
//
// }
//
// }
