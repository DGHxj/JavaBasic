package cn.tedu.innerclass;

public class InnerDemo3 {

	public static void main(String[] args) {

		Outer3.Inner3 oi3 = new Outer3.Inner3();
		oi3.m();
	}

}

class Outer3 {

	int i = 0;

	// ��̬�ڲ���
	// ֻ��ʹ���ⲿ���еľ�̬���Ժ;�̬����
	// ��̬�ڲ����п��Զ���һ�еķ���������
	static class Inner3 {

		int j = 8;
		static int k = 4;

		public void m() {
			// System.out.println(i);
		}

	}

}
