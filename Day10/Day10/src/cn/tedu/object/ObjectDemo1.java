package cn.tedu.object;

public class ObjectDemo1 implements Cloneable {

	int i;

	public static void main(String[] args) throws Exception {

		ObjectDemo1 od1 = new ObjectDemo1();

		od1.i = 7;

		// ��ʾ��¡һ��od1����
		// ��¡֮��Ķ��������ֵ��ԭ���������ֵһ��
		ObjectDemo1 od2 = (ObjectDemo1) od1.clone();
		// ObjectDemo1 od2 = od1;
		System.out.println(od2.i);
		System.out.println(od1);
		System.out.println(od2);
		
		Object o = "abc";
		// ��ȡ���Ƕ����ʵ������
		System.out.println(o.getClass());

	}

}
