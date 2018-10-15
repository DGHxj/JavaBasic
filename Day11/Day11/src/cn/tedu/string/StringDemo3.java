package cn.tedu.string;

public class StringDemo3 {

	public static void main(String[] args) throws Exception {

		// String str = "字符串";

		// 将字符串转化为对应的字节数组
		// 在没有指定编码的情况下，默认使用的是当前工程的编码
		// byte[] bs = str.getBytes();
		// byte[] bs = str.getBytes("utf-8");
		// System.out.println(bs.length);

		// 将字节数组转化为字符串
		// String s = new String(bs);
		// String s = new String(bs, 3, 3, "utf-8");
		// System.out.println(s);
		
		// 同一个字符串的哈希码不随时间和环境而改变
		System.out.println(new String("abe").hashCode());
	}

}
