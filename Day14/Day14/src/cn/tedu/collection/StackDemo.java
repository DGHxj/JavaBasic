package cn.tedu.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();

		// ���Ԫ��
		s.push("d");
		s.push("a");
		s.push("e");
		s.push("s");
		s.push("h");
		
		// ��ջ����ջ�����β��ң���1����
		System.out.println(s.search("a"));
		
		// �ж�ջ�Ƿ�Ϊ��
		// System.out.println(s.empty());

		// �鿴ջ��Ԫ��
		// ���ջΪ�գ����׳���ջ�쳣
		// System.out.println(s.peek());

		// �Ƴ�ջ��Ԫ��
		// System.out.println(s.pop());

		System.out.println(s);
	}

}
