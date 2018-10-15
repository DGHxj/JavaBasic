package cn.tedu.io1;

import java.io.FileWriter;
import java.io.StringReader;

/**
 * StringReader的用法
 */
public class Demo08 {
	public static void main(String[] args) throws Exception {
		//1.创建StringReader
		String str = "hello java~ hello world~ 这是一段中文~";
		StringReader reader = new StringReader(str);
		//2.创建FileWriter
		FileWriter writer = new FileWriter("7.txt");
		//2.对接流输出
		int i = 0;
		char [] cs = new char[1024];
		while((i = reader.read(cs))!=-1){
			writer.write(cs,0,i);
		}
		//3.关闭流
		reader.close();
		writer.close();
	}
}
