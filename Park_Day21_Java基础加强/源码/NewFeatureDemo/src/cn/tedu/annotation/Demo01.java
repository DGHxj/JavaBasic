package cn.tedu.annotation;

import java.util.Date;

/**
 * ע�� - jdk�Դ���ע��
 */

class Person10{
	public void eat(){
		System.out.println("�ԡ�����");
	}
	public void say(){
		System.out.println("˵������");
	}
}

class Teacher10 extends Person10{
	@Deprecated
	public void teach(){
		System.out.println("���Ρ�����");
	}
	public void teach2(){
		System.out.println("�߽��߼Ǳʼǡ�����");
	}
	@Override
	public void say() {
		System.out.println("һ��������˵������");
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
