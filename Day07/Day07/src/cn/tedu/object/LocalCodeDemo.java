package cn.tedu.object;

public class LocalCodeDemo {

	public static void main(String[] args) {

		int i = 8;

		// 定义在方法中代码块 --- 局部代码块
		{
			// j的作用范围变小，生命周期变短，释放内存 -> 提高栈内存的利用率
			int j = 10;
			System.out.println(i + j);
		}
		
		System.out.println(i);

	}

}
