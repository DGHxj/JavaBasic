package cn.tedu.math;

//import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {

		// 获取绝对值
		// System.out.println(Math.abs(-5.86));

		// 求立方根
		// System.out.println(Math.cbrt(27));

		// 向上取整
		// System.out.println(Math.ceil(4.06));

		// 乡下取整
		// System.out.println(Math.floor(8.95));

		// 四舍五入
		// System.out.println(Math.round(3.68));

		// 返回一个[0,1)的随机小数
		// System.out.println(Math.random());

		// 获取30-90之间的随机整数
		// int i = (int) (Math.random() * 61 + 30);
		// System.out.println(i);

		// 表示获取0-30之间的随机整数
		// Random r = new Random();
		// System.out.println(r.nextInt(30));

		// 0.15%
		for (int i = 0; i < 10000; i++)
			if (Math.random() * Math.random() > 0.95)
				System.out.println("亲，恭喜您，中奖了~~~");

	}

}
