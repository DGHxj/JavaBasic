package cn.tedu.math;

//import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {

		// ��ȡ����ֵ
		// System.out.println(Math.abs(-5.86));

		// ��������
		// System.out.println(Math.cbrt(27));

		// ����ȡ��
		// System.out.println(Math.ceil(4.06));

		// ����ȡ��
		// System.out.println(Math.floor(8.95));

		// ��������
		// System.out.println(Math.round(3.68));

		// ����һ��[0,1)�����С��
		// System.out.println(Math.random());

		// ��ȡ30-90֮����������
		// int i = (int) (Math.random() * 61 + 30);
		// System.out.println(i);

		// ��ʾ��ȡ0-30֮����������
		// Random r = new Random();
		// System.out.println(r.nextInt(30));

		// 0.15%
		for (int i = 0; i < 10000; i++)
			if (Math.random() * Math.random() > 0.95)
				System.out.println("�ף���ϲ�����н���~~~");

	}

}
