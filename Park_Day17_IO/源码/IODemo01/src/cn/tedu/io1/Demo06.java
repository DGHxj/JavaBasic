package cn.tedu.io1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * BufferedReader和BufferedWriter提供的新方法
 * 
 * BufferedReader
 * 	readline()
 * 
 * BufferedWriter
 * 	newLine() 
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		//1.创建流 并用缓冲流包装
		BufferedReader reader = new BufferedReader(new FileReader("1.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("2.txt"));
		
		//2.对接流 拷贝文件
		String line = null;
		while((line = reader.readLine())!=null){
			writer.write(line);
			writer.newLine();
		}
		
		//3.关闭流
		reader.close();
		writer.close();
	
	}
}
