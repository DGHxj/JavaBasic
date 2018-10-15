package cn.tedu.baozhuang;

public class IntegerDemo {

	public static void main(String[] args) {
		
		System.out.println(new Integer(8).hashCode());
		System.out.println(new Long(8).hashCode());
		System.out.println(new Character('f').hashCode());
		System.out.println(new Boolean(true).hashCode());
	}
	
}
