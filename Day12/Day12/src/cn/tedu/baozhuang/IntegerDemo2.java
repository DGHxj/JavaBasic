package cn.tedu.baozhuang;

public class IntegerDemo2 {

	public static void main(String[] args) {

		// Integer i1 = Integer.valueOf
		// ���ֵ����-128~127��Χ��
		// �ײ��valueOf�����ǵ����˹��췽��������һ���µĶ���
		// ���ֵ��-128~127�ķ�Χ�ڵ�ʱ��
		// ��cache�����еĶ�Ӧ�±�λ����ȡֵ
		Integer i1 = -125;
		Integer i2 = -125;

		System.out.println(i1 == i2);

		Integer in = 400;
		int i = 400;
		// ����װ��Ͷ�Ӧ�Ļ��������������ʱ�������Զ�����
		System.out.println(in == i);

	}

}
