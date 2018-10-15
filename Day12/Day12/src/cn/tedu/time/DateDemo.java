package cn.tedu.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {

		// 获取当前的系统时间
		// Date date = new Date();

		// 这个方法在1900-01的基础上来进行累加
		// @SuppressWarnings("deprecation")
		// 这个方法已过时
		// 已过时指当前方法可以使用但是不推荐使用，在后续版本中可能会随时抛弃
		// Date date = new Date(2000 - 1900, 2 - 1, 9);

		// 2000-12-15
		// 2000.12.15
		// 2000/12/15
		// 12/15/2000
		// 90.12.15
		// 将字符串转化为日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date date = sdf.parse("2000.12.15 18:58:45");
		
		// 将日期转化为字符串
		// XX年XX月XX日
		// XX时XX分XX秒
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy年MM月dd日\r\nHH时mm分ss秒");
		String str = sdf2.format(date);
		System.out.println(str);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);

	}

}
