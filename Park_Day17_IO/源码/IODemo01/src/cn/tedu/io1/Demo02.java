package cn.tedu.io1;

import java.io.FileWriter;
import java.io.Writer;

/**
 * 案例：编写一个流 来将指定的字符写出到外部文件中
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.创建文件字符输出流
		Writer writer = new FileWriter("2.txt");
		//2.通过字符输出流输出数据
		writer.write((int)'a');
		writer.write((int)'b');
		writer.write((int)'c');
		writer.write((int)'d');
		writer.write((int)'e');
		//3.刷新流
		//writer.flush();
		//--关闭流，关闭流过程中会隐含的刷新一次流
		writer.close();
	}
}
