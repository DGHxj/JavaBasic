package cn.tedu.string;

public class StringDemo2 {

	public static void main(String[] args) {

		String str = "DHAOngda";
		String str2 = new String("DhaONgda");
		
		// ���ַ���ת��Ϊ��д
		System.out.println(str.toUpperCase());
		// ���ַ���ת��ΪСд
		System.out.println(str2.toLowerCase());

		// �Ƚ������ַ����Ƿ����
		// ��дequals���ײ�ʵ��������λ�Ƚ�
		// System.out.println(str.equals(str2));
		// System.out.println(str.equalsIgnoreCase(str2));

		// �ж��Ƿ���ָ�����Ӵ���Ϊ��β
		// System.out.println(str.endsWith("a"));

		// �ж��Ƿ���ָ�����Ӵ���Ϊ��ͷ
		// System.out.println(str.startsWith("f"));

	}

}
