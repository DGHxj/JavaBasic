package cn.tedu.annotation;

import java.util.Date;

/**
 * 注解 - jdk自带的注解
 */

class Person10{
	public void eat(){
		System.out.println("吃。。。");
	}
	public void say(){
		System.out.println("说。。。");
	}
}

class Teacher10 extends Person10{
	@Deprecated
	public void teach(){
		System.out.println("讲课。。。");
	}
	public void teach2(){
		System.out.println("边讲边记笔记。。。");
	}
	@Override
	public void say() {
		System.out.println("一本正经的说。。。");
	}
}

public class Demo01 {
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		Teacher10 t = new Teacher10();
		t.say();
		t.teach();
		Date date = new Date();
		
		date.toLocaleString();
		String str = "abc";
	}
}
