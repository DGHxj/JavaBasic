package cn.tedu.type;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo5 {
	
	public static void main(String[] args) {
		
		List<Integer> ins = new ArrayList<>();
		ins.add(7);
		ins.add(3);
		ins.add(6);
		ins.add(0);
		ins.add(4);
		
		sort(ins);
	}
	
	// ���Խ����������ͣ������ڲ����ڼ䲻��������ɾ����
	public static void sort(List<?> list){
		
		list.add(null);
		
	}

}
