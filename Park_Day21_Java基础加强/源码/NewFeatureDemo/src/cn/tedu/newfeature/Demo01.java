package cn.tedu.newfeature;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ǿforѭ��
 */
public class Demo01 {
	public static void main(String[] args) {
		//1.��ͨfor - ʵ��ѭ��ִ�д���
		for(int i=0;i<5;i++){
			System.out.println("hello world~");
		}
		
		//2.��ǿfor - ��������
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		for(String str : list){
			System.out.println(str);
		}
	}
}
