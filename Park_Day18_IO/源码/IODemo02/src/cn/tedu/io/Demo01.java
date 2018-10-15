package cn.tedu.io;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * 打印流
 *	更多的类型的输出方法
 *	自动刷新
 *	永远不抛出IOException
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
//		//1.创建文件输出流
//		FileOutputStream out = new FileOutputStream("1.txt");
//		//2.包装为打印流
//		PrintStream ps = new PrintStream(out);
//		//3.打印输出数据
//		ps.println("hello ps~");
//		ps.println(999);
//		ps.println(33.33);
//		ps.println(true);
//		//4.关闭流
//		ps.close();
		
		
		//1.创建文件输出流
		FileWriter writer = new FileWriter("2.txt");
		//2.包装为打印流
		PrintWriter pw = new PrintWriter(writer);
		//3.打印输出数据
		pw.println("hello pw~");
		pw.println(999);
		pw.println(33.33);
		pw.println(false);
		//4.关闭流
		pw.close();
	}
}
