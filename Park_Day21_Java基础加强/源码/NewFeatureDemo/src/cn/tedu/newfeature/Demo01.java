package cn.tedu.newfeature;

import java.util.ArrayList;
import java.util.List;

/**
 * 增强for循环
 */
public class Demo01 {
	public static void main(String[] args) {
		//1.普通for - 实现循环执行代码
		for(int i=0;i<5;i++){
			System.out.println("hello world~");
		}
		
		//2.增强for - 遍历集合
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
