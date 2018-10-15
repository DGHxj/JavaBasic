package cn.tedu.string;

import java.util.Scanner;

public class StringExer6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// 获取到了2个字符串
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String sub = s.next();
		
		// 记录位置
		int index = 0;
		
		// 找子串出现的位置，从第0开始向后依次找
		// 找到之后打印这个位置然后从当前位置的下一位继续寻找
		// abcda  a
		while(index < str.length()){
			
			// 从指定的位置开始找元素
			index = str.indexOf(sub,index);
			
			if(index != -1){
				System.out.println(index);
				index++;
			} else 
				break;
		}
		
	}

}
