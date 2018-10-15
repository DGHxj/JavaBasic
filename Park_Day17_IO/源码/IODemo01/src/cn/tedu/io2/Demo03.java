package cn.tedu.io2;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 案例：利用字符流拷贝非系统码文件产生乱码
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		//1.创建流
		FileReader reader = new FileReader("8.txt");
		FileWriter writer = new FileWriter("9.txt");
		//2.对接流 拷贝文件
		char [] data = new char[1024];
		int i = 0;
		while((i = reader.read(data))!=-1){
			writer.write(data,0,i);
		}
		
		//3.关闭流
		reader.close();
		writer.close();
		
	}
}
