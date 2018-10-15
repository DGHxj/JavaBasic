package cn.tedu.regex;

public class PatternDemo1 {

	public static void main(String[] args) {

		// String str = "va87gg[bq;903h/0gvd'sga9gsd";

		// System.out.println(str.replace('0', '-'));
		// 将所有的数字替换为-
		// System.out.println(str.replaceAll("\\d", "-"));
		// 将所有非数字全部去掉
		// System.out.println(str.replaceAll("\\D", ""));

		// String str = "Cat Dog Pig Mouse Snake";
		// 交换Dog和Snake的顺序
		// 在replaceAll中可以$n的形式引用前一个正则中对应编号的捕获组
		// System.out.println(str.replaceAll("(Cat )(Dog)( Pig Mouse )(Snake)",
		// "$1$4$3$2"));
		
		String str = "我我我我我我我我爱爱爱爱学学学习习习习习习习习习习习";
		// 我爱学习
		System.out.println(str.replaceAll("(.)\\1+", "$1"));
		

	}

}
