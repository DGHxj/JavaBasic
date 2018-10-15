package cn.tedu.math;

//import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalFormatDemo {

	public static void main(String[] args) {

		double price = 10.00;
		double real = price * 0.95;

		// 0 ��ʾһλ���֣������һλ��û�м��������������ô��Ĭ����0��Ϊ���
		// # ��ʾ��һλ���������������䣬���û�����������
		// DecimalFormat df = new DecimalFormat("#0.00");
		DecimalFormat df = new DecimalFormat("00.00");
		String str = df.format(real);

		// long l = 46108431746L;

		// �����ֵת��Ϊ��ѧ��������ʽ
		// DecimalFormat df = new DecimalFormat("0.##E0");
		// ���ý���ģʽ
		// df.setRoundingMode(RoundingMode.CEILING);
		// String str = df.format(l);

		System.out.println(str);

	}

}
