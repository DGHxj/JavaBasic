package cn.tedu.string;

public class StringDemo2 {

	public static void main(String[] args) {

		// ��ʾ��ȡ��1970-01-01 00:00:00�����ڵĺ���ֵ
		long begin = System.currentTimeMillis();

		// String str = "";
		// for (int i = 0; i < 100000; i++) {
		// str += "a";
		// }

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000000; i++) {
			sb.append("a");
		}
		// String str = sb.toString();

		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
