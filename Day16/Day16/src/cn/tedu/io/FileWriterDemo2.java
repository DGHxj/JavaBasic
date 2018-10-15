package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) {

		// 将writer放到try之外声明并赋值为null
		FileWriter writer = null;
		try {
			// 将writer放到try之内初始化
			writer = new FileWriter("H:\\b.txt");
			writer.write("abc");
			// 为了防止关流的时候自动冲刷失败导致数据的丢失
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 需要判断writer是否初始化成功
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					// 如果关流失败，则强制将流对象置为null进行回收以释放文件
					// 如果关流成功，则将流对象标记为垃圾对象
					writer = null;
				}
		}

	}

}
