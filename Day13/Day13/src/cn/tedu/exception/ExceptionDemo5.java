package cn.tedu.exception;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		System.out.println(m());
	}

	@SuppressWarnings("finally")
	public static int m() {

		try {
			return 1;
		} finally {
			try {
				return 2;
			} finally {
				return 3;
			}
			// return 4;
		}

	}

}
