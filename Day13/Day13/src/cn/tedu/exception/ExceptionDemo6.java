package cn.tedu.exception;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		System.out.println(m());
	}

	public static int m() {

		int i = 4;

		// ������ջ�ڴ���ִ��
		// ������ִ�й����еļ���ʹ洢�Ƿֳ���2��
		// �ڴ���ִ�й����У�����ּ���ʹ洢�ֱ���е�����
		// �����Ǵ��ϵ��������α������е�
		try {
			// ������return i++;
			// �ڼ�������i��ֵ�Ӵ洢����ȡ�������м���
			// �ڼ����ʱ������++�ں����Խ�i��ֵ4��Ϊ���ݲ�����һ������
			// ��һ������ return 4;
			// ��ִ��return 4׼�����ص�ʱ����Ҫ����Ƿ��к�������ִ�У�i��������finally
			// ����i��������Ϊ5
			// Ȼ�����ִ����һ������������finally
			// ��������ȫ����������ִ�иղű������return 4;
			return i++;
		} finally {
			// ��finally�ж�i�ٴ�����Ϊ6
			i++;
			System.out.println("finally:" + i);
		}

	}

}
