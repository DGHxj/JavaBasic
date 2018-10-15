package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

		// �����д洢��Ԫ��������String
		Collection<String> c = new ArrayList<String>();

		// ���Ԫ��
		c.add("gwe");
		c.add("hred");
		c.add("hrd");
		c.add("ater");

		// ������ת��Ϊ����
		// String[] os = (String[]) c.toArray();
		// Object[] os = c.toArray();
		// for (Object o : os) {
		// System.out.println(((String) o).length());
		// }
		String[] strs = c.toArray(new String[0]);
		for (String str : strs) {
			System.out.println(str.length());
		}

		// ��ȡ�����е�Ԫ�ظ���
		// System.out.println(c.size());

		// ��ռ���
		// c.clear();

		// �жϼ����Ƿ�Ϊ��
		// System.out.println(c.isEmpty());

		// �ж�Ԫ���Ƿ����
		// System.out.println(c.contains("hrd"));
		// System.out.println(c.contains("aft"));

		// �Ӽ������Ƴ�ָ����Ԫ��
		// c.remove("gwe");
		// ���Ԫ�ز����ڣ���ֱ������
		// c.remove("age");

		System.out.println(c);

	}

}
