package cn.tedu.test;

public class MethodDemo {

	// Alt + / 提示键
	// Ctrl+F11 运行
	// Ctrl + Shift + O 导包
	// Ctrl+D 删除一行
	// Ctrl+/ 单行注释/取消单行注释
	// Ctrl+Shift+/ 多行注释
	// Ctrl+Shift+\ 取消多行注释
	// Alt+↑/↓ 向上/下移动
	public static void main(String[] args) {

		System.out.println(add(100000));

	}

	public static int add(int n) {

		if (n == 1)
			return 1;

		return n + add(n - 1);

	}

}
