package cn.tedu.exception;

//import java.text.SimpleDateFormat;

public class ExceptionDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		 try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.out.println("在处理这个算术异常~~~");
		}

		// int[] arr = new int[3];
		// System.out.println(arr[5]);

		// String str = null;
		// System.out.println(str.length());

		// Object o = new Object();
		// String str = (String) o;

		// Integer in = new Integer("abc");

		new ExceptionDemo().clone();

		// "abc".getBytes("abc");

		// new SimpleDateFormat("yyyy").parse("2012");

	}

}
