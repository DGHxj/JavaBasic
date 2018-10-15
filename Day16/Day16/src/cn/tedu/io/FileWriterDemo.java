package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

		// 在流使用完成之后会自动的进行关流操作
		// try-with-resources 从JDK1.7开始的
		// 要求能够使用try-with-resources方式的流必须实现AutoCloseable
		// 要求流的创建过程必须在try之内
		try (FileWriter writer = new FileWriter("D:\\c.txt")) {
			writer.write("def");
			writer.write("abe");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// public void m(FileWriter writer){
	// try(writer){
	//
	// }catch (Exception e) {
	// }
	// }

}
