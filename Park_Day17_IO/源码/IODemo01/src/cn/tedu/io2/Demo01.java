package cn.tedu.io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 利用字节流实现文件的复制
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.创建流
		InputStream in = new FileInputStream("1.wmv");
		OutputStream out = new FileOutputStream("2.wmv");
		//2.对接流 实现复制
		int i = 0;
		while((i = in.read())!=-1){
			out.write(i);
		}
		//3.关闭流
		in.close();
		out.close();
	}
}
