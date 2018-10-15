package cn.tedu.io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * 案例：通过转换流 生成自定义码表的字符流 复制文件 解决乱码
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//1.创建字节流
		InputStream in = new FileInputStream("d://8.txt");
		OutputStream out = new FileOutputStream("d://9.txt");
	
		//2.创建转换流 将字节流转换为字符流 并显式指定码表为utf-8
		InputStreamReader reader = new InputStreamReader(in,"utf-8");
		OutputStreamWriter writer = new OutputStreamWriter(out,"utf-8");
		
		//3.对接流 复制文件
		char [] data = new char[1024];
		int i = 0;
		while((i=reader.read(data))!=-1){
			writer.write(data,0,i);
		}
		
		//4.关闭流
		reader.close();
		writer.close();
	}
}
