package cn.tedu.baozhuang;

public class IntegerDemo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// int i = 7;
		// ���û������͵����ݹ����˶�Ӧ���������͵Ķ��� --- ����
		// Integer in = new Integer(i);

		// �Զ�����/������JDK1.5������֮һ
		// ���������͵�����ֱ�Ӹ�ֵ���˶�Ӧ���������͵Ķ��� --- �Զ�����
		// �Զ������ڵײ��Ĭ�ϵ���Integer�����ϵľ�̬����valueOf
		// Integer in = Integer.valueOf(i);
		// Integer in = i;

		// double d = 3.5;
		// Double dou = Double.valueOf(d);
		// Double dou = d;

		// char c = 'a';
		// Character ch = c;

		Integer in = new Integer(5);
		// ���������͵Ķ���ֱ�Ӹ�ֵ���˶�Ӧ�Ļ������͵ı��� --- �Զ�����
		// �Զ������ڵײ��Ĭ�ϵ��ö������ϵ�***Value()
		// int i = in.intValue();
		int i = in;

		Double dou = new Double(2.8);
		// Double d = dou.doubleValue();
		double d = dou;

		Boolean bo = new Boolean(false);
		// boolean b = bo.booleanValue();
		boolean b = bo;

	}

}
