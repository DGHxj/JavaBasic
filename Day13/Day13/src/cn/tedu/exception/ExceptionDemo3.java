package cn.tedu.exception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionDemo3 {

	// 如果在主函数上抛出异常，表示将这个异常抛给了Java虚拟机
	// JVM默认打印异常的栈轨迹
	public static void main(String[] args) throws Exception {

		// Integer in = new Integer("abc");
		A a = new B();
		try {
			a.m(5);
		} catch (IOException e) {
			System.out.println("处理IO异常~~~");
		}

	}

}

class A {

	// 异常对方法的重载没有影响
	public void m() throws ParseException {
		System.out.println("m()~~~");
	}

	public void m(int i) throws IOException {
		System.out.println("m(int)~~~");
	}
}

class B extends A {

	// 子类在重写父类方法的时候
	// 所抛出的编译时异常不能超过父类编译时异常的范围
	// 子类不能抛出比父类更多的异常 --- 范围不能更大，编译时异常
	public void m(int i) throws EOFException, FileNotFoundException {
	}

}
