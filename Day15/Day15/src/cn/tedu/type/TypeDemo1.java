package cn.tedu.type;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class TypeDemo1 {

	public static void main(String[] args) {

		// ������û�з��͵����Ƶ�ʱ�򣬼����д洢Ԫ����Object����
		// List list = new ArrayList();
		// List<String> list = new ArrayList();
		// List list = new ArrayList<String>();
		// List<String> list = new ArrayList<String>();
		// ��JDK1.7��ʼ�����ʵ����ķ��Ϳ���ʡ�Բ�д
		// ����ݳ�����������������͵��Զ��Ƶ�
		List<String> list = new ArrayList<>();

		list.add("a");
		// list.add(5);
		// list.add(3.5);
		// list.add(new Object());

		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// Object o = it.next();
		//
		// if (o instanceof String) {
		// String str = (String) o;
		// } else if (o instanceof Integer) {
		// Integer in = (Integer) o;
		// }
		// }

	}

	// public static void m(List list){}

}
