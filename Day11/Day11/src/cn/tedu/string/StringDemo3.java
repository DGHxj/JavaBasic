package cn.tedu.string;

public class StringDemo3 {

	public static void main(String[] args) throws Exception {

		// String str = "�ַ���";

		// ���ַ���ת��Ϊ��Ӧ���ֽ�����
		// ��û��ָ�����������£�Ĭ��ʹ�õ��ǵ�ǰ���̵ı���
		// byte[] bs = str.getBytes();
		// byte[] bs = str.getBytes("utf-8");
		// System.out.println(bs.length);

		// ���ֽ�����ת��Ϊ�ַ���
		// String s = new String(bs);
		// String s = new String(bs, 3, 3, "utf-8");
		// System.out.println(s);
		
		// ͬһ���ַ����Ĺ�ϣ�벻��ʱ��ͻ������ı�
		System.out.println(new String("abe").hashCode());
	}

}
