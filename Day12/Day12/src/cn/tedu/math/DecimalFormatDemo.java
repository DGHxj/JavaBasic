package cn.tedu.math;

//import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalFormatDemo {

	public static void main(String[] args) {

		double price = 10.00;
		double real = price * 0.95;

		// 0 表示一位数字，如果这一位上没有计算出数字来，那么会默认以0作为填充
		// # 表示这一位上如果有数字则填充，如果没有数字则不填充
		// DecimalFormat df = new DecimalFormat("#0.00");
		DecimalFormat df = new DecimalFormat("00.00");
		String str = df.format(real);

		// long l = 46108431746L;

		// 将这个值转化为科学计数法形式
		// DecimalFormat df = new DecimalFormat("0.##E0");
		// 设置近似模式
		// df.setRoundingMode(RoundingMode.CEILING);
		// String str = df.format(l);

		System.out.println(str);

	}

}
