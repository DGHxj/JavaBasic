package cn.tedu.io1;

import java.io.FileReader;
import java.io.Reader;

/**
 * 案例：编写一个流 来读取外部文件中的字符数据 	
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.创建文件字符输入流链接到 1.txt上
		Reader reader = new FileReader("1.txt");
		//2.通过流读取文件中的数据
		int i = 0;
		while((i=reader.read())!=-1){
			System.out.println((char)i);
		}
		//3.关闭流
		reader.close();
	}
}
