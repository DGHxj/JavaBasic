package cn.tedu.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		// Vector<String> v = new Vector<String>();
		// ��ʾ�����ĳ�ʼ������10��ÿ����������5��
		// Vector<String> v = new Vector<String>(10, 5);
		// System.out.println(v.capacity());
		//
		// for (int i = 0; i < 21; i++) {
		// v.add("a");
		// }
		//
		// System.out.println(v.capacity());

		Vector<String> v = new Vector<String>();

		v.add("a");
		v.add("d");
		v.add("t");
		v.add("h");

		// ��ȡ������
		Enumeration<String> e = v.elements();

		// �жϺ����Ƿ���Ԫ��
		while (e.hasMoreElements()) {

			// Ų��ָ���ȡ��һ��Ԫ��
			String str = e.nextElement();
			System.out.println(str);

			// �޷���ռ���
			// v.remove(str);
		}

		System.out.println(v);
	}

}
