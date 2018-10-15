package cn.tedu.exception;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		System.out.println(m());
	}

	public static int m() {

		int i = 4;

		// 方法在栈内存中执行
		// 方法在执行过程中的计算和存储是分成了2块
		// 在代码执行过程中，会出现计算和存储分别进行的现象
		// 代码是从上到下来依次编译运行的
		try {
			// 先运行return i++;
			// 在计算区域将i的值从存储区域取出来进行计算
			// 在计算的时候由于++在后，所以将i的值4作为数据参与下一步运算
			// 下一步运算 return 4;
			// 在执行return 4准备返回的时候需要检查是否有后续操作执行：i的自增，finally
			// 先让i进行自增为5
			// 然后继续执行下一个后续操作是finally
			// 后续操作全部完成最后在执行刚才被挂起的return 4;
			return i++;
		} finally {
			// 在finally中对i再次自增为6
			i++;
			System.out.println("finally:" + i);
		}

	}

}
