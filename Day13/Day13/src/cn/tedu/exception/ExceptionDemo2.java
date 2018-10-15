package cn.tedu.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) /* throws FileNotExistException */ {

		// try {
		// String msg = readTxt("E:\\a.jpg");
		// System.out.println(msg);
		// } catch (FileNotExistException e) {
		// System.out.println(e.getMessage());
		// System.out.println("�ڴ����������~~~");
		// } catch (FileFormatException e) {
		// System.out.println(e.getMessage());
		// } catch (NullPointerException e) {
		// System.out.println("�����ָ��~~~");
		// }

		// try {
		// String msg = readTxt("E:\\a.jpg");
		// System.out.println(msg);
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }

		// һ�����������쳣�����쳣
		try {
			String msg = readTxt("E:\\a.jpg");
			System.out.println(msg);
		} catch (FileNotExistException | FileFormatException e) {
			// System.out.println(e.getMessage());
			// ��ӡջ�켣
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("�����ָ��~~~");
		} catch (Exception e) {

		}

		System.out.println("running~~~");
	}

	public static String readTxt(String path) throws FileNotExistException, FileFormatException, NullPointerException {

		if (path == null)
			throw new NullPointerException("�ף�·�����ܲ��ҿ�~~~");

		// ����·��������
		if (path.startsWith("H:\\"))
			throw new FileNotExistException("�ף�����ļ�������Ŷ~~~");

		// �ļ���ʽ��һ��
		if (!path.endsWith(".txt"))
			throw new FileFormatException("�ף���Ҫһ��TXT�ļ�~~~");

		return "��ȡ�ɹ�~~~";
	}

}

@SuppressWarnings("serial")
class FileFormatException extends Exception {

	public FileFormatException() {
	}

	public FileFormatException(String msg) {
		super(msg);
	}
}

@SuppressWarnings("serial")
class FileNotExistException extends Exception {

	private String msg;

	public FileNotExistException() {
	}

	public FileNotExistException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}
