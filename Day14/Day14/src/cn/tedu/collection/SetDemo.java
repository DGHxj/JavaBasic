package cn.tedu.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// ���Ԫ��
		set.add("dsa");
		set.add("egd");
		set.add("abd");
		set.add("hoj");
		// �������ظ���Ԫ�أ�����ظ���Ԫ�ػᱻ����
		set.add("egd");
		System.out.println(set);
		
	}

}
