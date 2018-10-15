package cn.tedu.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 通过字符流 拷贝字符文件 讨论效率问题
 */
public class Demo04 {
	public static void main(String[] args){
		//--开始时间
		long begin = System.currentTimeMillis();
		
		Reader reader = null;
		Writer writer = null;
		try {
			//1.创建流
			reader = new FileReader("4.txt");
			writer = new FileWriter("5.txt");
			//2.拷贝数据
			//int count = 0;
			int i = 0;
			char [] buf = new char [1024];
			while ((i = reader.read(buf)) != -1) {
				//System.out.println("读取了"+(++count)+"次");
				writer.write(buf,0,i);
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
				} finally {
					writer = null;
				}
			}
		}
		//--结束时间
		long end = System.currentTimeMillis();
		System.out.println("====共耗时："+(end-begin)+"ms====");
	
	}
}
