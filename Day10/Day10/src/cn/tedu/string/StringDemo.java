package cn.tedu.string;

public class StringDemo {

	public static void main(String[] args) {

		// String str = "abc";
		// str = "def";
		// System.out.println(str);

		// s1指向方法区
		String s1 = "ab";
		// s2指向堆内存，堆内存指向方法区
		String s2 = new String("ab");
		// 字符串在方法区中只存放一份
		// 后续使用到值相等的字符串的时候使用的是同一个
		String s3 = "ab";
		// "a"和"b"是两个字面量
		// 字面量在参与运算的时候为了提高效率在编译时期就会运算
		// String s4 = "a" + "b"; -> String s4 = "ab";
		String s4 = "a" + "b";
		// s5 = s5 + "b";不会优化
		// 实际上底层是利用了StringBuilder中的append方法来完成
		String s5 = "a";
		// s5 = new StringBuilder(s5).append("b").toString();
		// s5最后指向堆内存，堆内存再指向方法区
		s5 = s5 + "b";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s2 == s5);

	}

}
