package cn.tedu.string;

public class StringDemo6 {
	
	public static void main(String[] args) {
		
		// String.valueOf��ʾ������ת��Ϊ�ַ���
		System.out.println(String.valueOf(4));
		
		// ��ӡ�����ʱ�����ȵ�����String.valueOf����
		// ������ת��Ϊ�ַ�����ʱ��ʵ������ײ������toString
		Object o = new Object();
		System.out.println(String.valueOf(o));
		System.out.println(o);
		
		char[] cs = {'a','d','f','e'};
		System.out.println(cs);
		// �ײ��ǽ��ַ�����ת��Ϊ�ַ���
		System.out.println(String.valueOf(cs));
		System.out.println(cs.toString());
	}

}
