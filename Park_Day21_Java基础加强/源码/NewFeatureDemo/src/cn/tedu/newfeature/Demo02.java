package cn.tedu.newfeature;

/**
 * 自动封箱拆箱
 */
public class Demo02 {
	public static void main(String[] args) {
		//--普通转换
		Integer ix1 = new Integer(1);
		int ix2 = ix1.intValue();
		
		//--自动封箱拆箱转换
		Integer ix3 = 1;
		int ix4 = new Integer(2);
	}
}
