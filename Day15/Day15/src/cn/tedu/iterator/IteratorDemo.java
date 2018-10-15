package cn.tedu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		list.add("abe");
		list.add("egs");
		list.add("dgse");
		list.add("dase");
		list.add("3sdf");
		list.add("sdh8");
		list.add("dbks");
		list.add("vn3hdso");
		
		// ͨ��iterator������ȡ��һ��Iterator����
		Iterator<String> it = list.iterator();
		
		// �ж��Ƿ�����һ��Ԫ��
		while(it.hasNext()){
			
			// Ų��ָ���ȡ���Ԫ��
			String str = it.next();
			System.out.println(str);
			
			// ͨ���������Դ���remove�������Ƴ���ǰ�ڵ�����Ԫ��
			// it.remove();
			list.remove(str);
		}
		
		System.out.println(list);

	}

}
