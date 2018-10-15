package cn.tedu.reiew;

public class StaticDemo {

	public static void main(String[] args) {

		System.out.println(A.i);
		System.out.println(A.j);

	}

}

class A {

	// 先加载a,i,j
	// 其中a先标记为null，i和j标记为0
	// 进行初始化操作
	// 先执行 static A a = new A();
	// 这个时候a的具体地址来覆盖掉标记的null
	// a的实际对象是存在堆内存中，然后方法区中存储a的地址
	// 创建a对象那么就得执行a的构造方法
	// 意味着要执行i++,j++,在创建对象将标记值先认为是默认值
	// i->1 j->1
	// a的构造方法执行完成，然后初始化i和j
	// i = 5;利用实际数据5覆盖掉标记值1
	// 注意：在类加载过程中不允许计算标记值/
	// 但是在创建对象或者其他方式使用的时候会将标记值认为是默认值使用
	static A a = new A();
	static int i = 5;
	static int j;

	public A() {
		i++;
		j++;
		System.out.println(i);
		System.out.println(j);
	}

}