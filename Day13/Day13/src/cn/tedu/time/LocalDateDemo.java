package cn.tedu.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

	public static void main(String[] args) {

		// LocalDate是一个只包含日期而不包含时间的类
		// 获取当前系统的日期
		// LocalDate date = LocalDate.now();

		// 指定日期
		LocalDate date = LocalDate.of(2016, 5, 9);
		
		System.out.println(date.plus(7, ChronoUnit.WEEKS));
		System.out.println(date.minus(8, ChronoUnit.MONTHS));
		// System.out.println(date.getDayOfWeek());
		// System.out.println(date.getDayOfYear());
		// System.out.println(date);
		// System.out.println(date.isAfter(LocalDate.now()));
		// 判断闰年
		// System.out.println(date.isLeapYear());
	}

}
