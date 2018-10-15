package cn.tedu.newfeature;

/**
 * Ã¶¾Ù
 */
public class Demo05 {
	public static void main(String[] args) {
	}
}

enum WeekEnum05{
	Mon,Tue,Wed,Thu,Fri,Sat,Sun
}

class Week05{
	private Week05() {
	}
	public static final Week05 Mon = new Week05();
	public static final Week05 Tue = new Week05();
	public static final Week05 Wed = new Week05();
	public static final Week05 Thu = new Week05();
	public static final Week05 Fri = new Week05();
	public static final Week05 Sat = new Week05();
	public static final Week05 Sun = new Week05();
}
