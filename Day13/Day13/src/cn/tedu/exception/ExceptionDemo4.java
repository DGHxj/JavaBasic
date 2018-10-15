package cn.tedu.exception;

public class ExceptionDemo4 {

	public static void main(String[] args) {

		try {
			// System.out.println(1 / 0);
			System.out.println(10 / 2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 无论出现了异常与否，finally都会执行一次。
			System.out.println("finally running~~~");
		}
		
		System.out.println(m());

	}

	@SuppressWarnings("finally")
	public static int m() {

		// 在try-catch出现的情况下，
		// JVM在编译的时候认为try不一定能够执行成功
		// 就意味着try中不一定能够正常返回结果
		try {
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			// return 3;
		} finally {
			return 9;
		}

		// return 4;
	}

}
