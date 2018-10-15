package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {

		// 表示创建了一个输出流指向D盘下的a.txt
		// 创建一个新的文件：如果原文件已存在则用新文件覆盖原文件
		// 如果原文件不存在，则将新文件作为目标文件进行操作
		// FileWriter writer = new FileWriter("D:\\a.txt");
		// 追加方式
		// 原文件已存在，不会创建新文件而是直接利用原文件
		FileWriter writer = new FileWriter("D:\\a.txt", true);

		// 写出数据
		// 数据不是直接写到文件中
		// 而是先写到缓冲区中
		// 缓冲区被填满之后再将缓冲区中的数据放到文件中
		// 缓冲区还没有被填满，然后程序结束了
		// 就导致有一部分数据死在缓冲区中没有来得及放到文件中
		// 导致数据产生了丢失
		writer.write("xyz");

		// 冲刷缓冲区
		// writer.flush();

		// 关闭流
		// 流在关闭的时候会自动冲刷一次缓冲区
		writer.close();

		// 流关闭了，流对象在内存中还存在吗？--- 存在
		System.out.println(writer);
		// 表示将流对象的引用置为null，手动标记它是一个垃圾对象可以被回收
		writer = null;
	}

}
