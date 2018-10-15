package cn.tedu.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {

		// ��ȡ��ǰ��ϵͳʱ��
		// Date date = new Date();

		// ���������1900-01�Ļ������������ۼ�
		// @SuppressWarnings("deprecation")
		// ��������ѹ�ʱ
		// �ѹ�ʱָ��ǰ��������ʹ�õ��ǲ��Ƽ�ʹ�ã��ں����汾�п��ܻ���ʱ����
		// Date date = new Date(2000 - 1900, 2 - 1, 9);

		// 2000-12-15
		// 2000.12.15
		// 2000/12/15
		// 12/15/2000
		// 90.12.15
		// ���ַ���ת��Ϊ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date date = sdf.parse("2000.12.15 18:58:45");
		
		// ������ת��Ϊ�ַ���
		// XX��XX��XX��
		// XXʱXX��XX��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy��MM��dd��\r\nHHʱmm��ss��");
		String str = sdf2.format(date);
		System.out.println(str);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);

	}

}
