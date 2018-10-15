package cn.tedu.io1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用 缓冲流 BufferedReader BufferedWriter复制文本文件
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		//1.创建 带有缓冲区的 文件输入流 文件输出流 
		FileReader reader = new FileReader("4.txt");
		BufferedReader breader = new BufferedReader(reader);
		FileWriter writer = new FileWriter("5.txt");
		BufferedWriter bwriter = new BufferedWriter(writer);
		
		//2.连接流 复制文件
		int i = 0;
		char [] buf = new char[1024];
		while((i = breader.read(buf))!=-1){
			bwriter.write(buf,0,i);
		}
		
		//3.关闭流
		breader.close();
		bwriter.close();
		
	}
}
