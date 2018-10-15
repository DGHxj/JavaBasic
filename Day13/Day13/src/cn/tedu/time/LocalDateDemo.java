package cn.tedu.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

	public static void main(String[] args) {

		// LocalDate��һ��ֻ�������ڶ�������ʱ�����
		// ��ȡ��ǰϵͳ������
		// LocalDate date = LocalDate.now();

		// ָ������
		LocalDate date = LocalDate.of(2016, 5, 9);
		
		System.out.println(date.plus(7, ChronoUnit.WEEKS));
		System.out.println(date.minus(8, ChronoUnit.MONTHS));
		// System.out.println(date.getDayOfWeek());
		// System.out.println(date.getDayOfYear());
		// System.out.println(date);
		// System.out.println(date.isAfter(LocalDate.now()));
		// �ж�����
		// System.out.println(date.isLeapYear());
	}

}
