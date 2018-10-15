package cn.tedu.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 案例：利用字符流实现字符文件的拷贝 1.txt -> 3.txt
 */
public class Demo03 {
	public static void main(String[] args) {
		Reader reader = null;
		Writer writer = null;
		try {
			//1.创建字符输入流 连接1.txt 创建字符输出流 连接3.txt
			reader= new FileReader("1.txt");
			writer = new FileWriter("3.txt");
			//2.从1.txt读取数据
			int i = 0;
			while((i = reader.read())!=-1){
				writer.write(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.关闭流
			if(reader!=null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					reader = null;
				}
			}
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					writer = null;
				}
			}
		}
		
	}
}
