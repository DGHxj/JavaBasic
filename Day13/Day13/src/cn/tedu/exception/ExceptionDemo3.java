package cn.tedu.exception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionDemo3 {

	// ��������������׳��쳣����ʾ������쳣�׸���Java�����
	// JVMĬ�ϴ�ӡ�쳣��ջ�켣
	public static void main(String[] args) throws Exception {

		// Integer in = new Integer("abc");
		A a = new B();
		try {
			a.m(5);
		} catch (IOException e) {
			System.out.println("����IO�쳣~~~");
		}

	}

}

class A {

	// �쳣�Է���������û��Ӱ��
	public void m() throws ParseException {
		System.out.println("m()~~~");
	}

	public void m(int i) throws IOException {
		System.out.println("m(int)~~~");
	}
}

class B extends A {

	// ��������д���෽����ʱ��
	// ���׳��ı���ʱ�쳣���ܳ����������ʱ�쳣�ķ�Χ
	// ���಻���׳��ȸ��������쳣 --- ��Χ���ܸ��󣬱���ʱ�쳣
	public void m(int i) throws EOFException, FileNotFoundException {
	}

}
