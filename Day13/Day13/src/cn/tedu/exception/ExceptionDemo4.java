package cn.tedu.exception;

public class ExceptionDemo4 {

	public static void main(String[] args) {

		try {
			// System.out.println(1 / 0);
			System.out.println(10 / 2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ���۳������쳣���finally����ִ��һ�Ρ�
			System.out.println("finally running~~~");
		}
		
		System.out.println(m());

	}

	@SuppressWarnings("finally")
	public static int m() {

		// ��try-catch���ֵ�����£�
		// JVM�ڱ����ʱ����Ϊtry��һ���ܹ�ִ�гɹ�
		// ����ζ��try�в�һ���ܹ��������ؽ��
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
