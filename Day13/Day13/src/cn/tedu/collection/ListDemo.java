package cn.tedu.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		// ��֤Ԫ�صĴ���˳��
		list.add("bdd");
		list.add("abd");
		list.add("egd");
		list.add("eds");
		list.add("abd");
		list.add(null);

		// ��ȡ���б�
		System.out.println(list.subList(1, 3));

		// ��ȡָ����Ԫ�����б��е�һ�γ��ֵ�λ��
		// System.out.println(list.indexOf("abd"));

		// List<String> list2 = new ArrayList<String>();
		// list2.add(new String("bdd"));
		// list2.add("abd");
		// list2.add("egd");
		// list2.add("eds");

		// �Ƚ������б��ʱ������λ�Ƚ��Ƿ�һ��
		// System.out.println(list.equals(list2));
		// for(int i = 0; i < list.size(); i++)
		// System.out.println(list.get(i));

		// ��ȡָ���±��ϵ�Ԫ��
		// System.out.println(list.get(1));

		// ���б��ָ�����±����ָ����Ԫ��
		// list.add(1,"fec");
		// list.add(4, "fec");
		// list.add(6, "fec");

		// �Ƴ�ָ���±��ϵ�Ԫ��
		// list.remove(0);
		// list.remove(5);

		// �滻ָ��λ���ϵ�Ԫ��
		// list.remove(2);
		// list.add(2, "abc");
		// list.set(2, "abc");

		System.out.println(list);

	}

}
