package cn.tedu.regex;

public class PatternDemo6 {

	public static void main(String[] args) {

//		String str = "fabtab";

		// �жϺ�������2��ab���ַ���
		// () ������
		// ������ʽ������еĲ���������Զ��ı��
		// ����Ǵ�1��ʼ��
		// System.out.println(str.matches(".*(ab).*(ab).*"));
		// \\n ��ʾ����ǰ�߱��Ϊn�Ĳ�����
//		 System.out.println(str.matches(".*(ab).*\\1.*"));

		// ������ı���ǴӲ�������������ų��ֵ�λ�ÿ�ʼ�����
		// (A((BC)(D))E)(F)
		// \\1 A((BC)(D))E
		// \\2 (BC)(D)
		// \\3 BC
		// \\4 D
		// \\5 F

		// �ж�һ���ַ����Ƿ���һ�������ַ���
		// ������ ��������
		 String str = "Ц����";
		 System.out.println(str.matches("��{2,}"));
		 System.out.println(str.matches("(.)\\1+"));
		// ��ʾƥ��������2���ַ���ɵ��ַ���
		// System.out.println(str.matches("(.){2,}"));

		// ƥ��AABB��ʽ�Ĵ���
		// ����ϲϲ
		// String str = "��������";
		// System.out.println(str.matches("(.)\\1(.)\\2"));

		// ƥ��ABAB��ʽ�Ĵ���
		// ��Ϣ��Ϣ ������
		// String str = "��Ϣ��Ϣ";
		// System.out.println(str.matches("(..)\\1"));

	}

}
