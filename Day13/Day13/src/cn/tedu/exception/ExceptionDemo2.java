package cn.tedu.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) /* throws FileNotExistException */ {

		// try {
		// String msg = readTxt("E:\\a.jpg");
		// System.out.println(msg);
		// } catch (FileNotExistException e) {
		// System.out.println(e.getMessage());
		// System.out.println("在处理这个问题~~~");
		// } catch (FileFormatException e) {
		// System.out.println(e.getMessage());
		// } catch (NullPointerException e) {
		// System.out.println("处理空指针~~~");
		// }

		// try {
		// String msg = readTxt("E:\\a.jpg");
		// System.out.println(msg);
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }

		// 一定是先子类异常后父类异常
		try {
			String msg = readTxt("E:\\a.jpg");
			System.out.println(msg);
		} catch (FileNotExistException | FileFormatException e) {
			// System.out.println(e.getMessage());
			// 打印栈轨迹
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("处理空指针~~~");
		} catch (Exception e) {

		}

		System.out.println("running~~~");
	}

	public static String readTxt(String path) throws FileNotExistException, FileFormatException, NullPointerException {

		if (path == null)
			throw new NullPointerException("亲，路径不能并且空~~~");

		// 可能路径不存在
		if (path.startsWith("H:\\"))
			throw new FileNotExistException("亲，这个文件不存在哦~~~");

		// 文件格式不一样
		if (!path.endsWith(".txt"))
			throw new FileFormatException("亲，需要一个TXT文件~~~");

		return "读取成功~~~";
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
