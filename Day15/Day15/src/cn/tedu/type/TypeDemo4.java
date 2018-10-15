package cn.tedu.type;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo4 {

	public static void main(String[] args) {

		List<Integer> ins = new ArrayList<>();
		ins.add(3);
		ins.add(4);
		ins.add(6);
		ins.add(7);
		ins.add(0);
		List<Double> dos = new ArrayList<>();
		dos.add(3.6);
		dos.add(4.2);
		dos.add(6.8);
		dos.add(7.7);
		dos.add(0.2);

		// ���Ͳ��������¼���
		print(ins);
		print(dos);

		// List<String> strs = new ArrayList<>();
		// print(strs);

	}

	// дһ���µķ���������Ԫ�����������ֵ��б�
	// Ԫ��������Number������������
	// ? extends ��/�ӿ� ��ʾ���������/�ӿڻ�����������/�ӽӿڶ���
	// ���ܴ����Ԫ�ص���������޶�ΪNumber
	// �涨�˷��͵�����
	public static void print(List<? extends Number> list) {

		// ����������κ�Ԫ�س�����null
		list.add(null);
		
		for (Number n : list) {
			System.out.println(n);
		}

	}
	
	// ���͵�����
	// ����Ԫ��������String���丸����б�
	// ? super ��/�ӿ� ��ʾ���������/�ӿڼ��丸��/���ӿڵĶ���
	// ��ʾ�������С������String
	public static void m(List<? super String> list){
		
		list.add("abc");
		for (Object o : list) {
			System.out.println(o);
		}
		
	}

}
