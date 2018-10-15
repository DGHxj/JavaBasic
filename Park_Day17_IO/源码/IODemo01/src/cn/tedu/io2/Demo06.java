package cn.tedu.io2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) throws Exception {
//		System.setOut(new PrintStream(new FileOutputStream("out.txt")));
//		System.setErr(new PrintStream(new FileOutputStream("err.txt")));
//		System.out.println("abc");
//		System.err.println("xyz");
	
//		InputStream in = System.in;
//		System.out.println((char)in.read());
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String line = reader.readLine();
//		System.out.println(line);
	
//		Scanner scanner = new Scanner(System.in);
//		String line = scanner.nextLine();
//		System.out.println(line);
		
		
		System.setIn(new FileInputStream("in.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = reader.readLine())!=null){
			System.out.println(line);
		}
	}
}
