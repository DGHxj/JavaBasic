package cn.tedu.object;

public class LocalCodeDemo {

	public static void main(String[] args) {

		int i = 8;

		// �����ڷ����д���� --- �ֲ������
		{
			// j�����÷�Χ��С���������ڱ�̣��ͷ��ڴ� -> ���ջ�ڴ��������
			int j = 10;
			System.out.println(i + j);
		}
		
		System.out.println(i);

	}

}
