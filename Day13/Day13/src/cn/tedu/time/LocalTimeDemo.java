package cn.tedu.time;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {

		// 只含有时间而不含有日期
		// LocalTime time = LocalTime.now();

		LocalTime time = LocalTime.of(15, 59, 37, 4616);
		System.out.println(time);

	}

}
