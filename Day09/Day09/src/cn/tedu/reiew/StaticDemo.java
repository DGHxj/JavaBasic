package cn.tedu.reiew;

public class StaticDemo {

	public static void main(String[] args) {

		System.out.println(A.i);
		System.out.println(A.j);

	}

}

class A {

	// �ȼ���a,i,j
	// ����a�ȱ��Ϊnull��i��j���Ϊ0
	// ���г�ʼ������
	// ��ִ�� static A a = new A();
	// ���ʱ��a�ľ����ַ�����ǵ���ǵ�null
	// a��ʵ�ʶ����Ǵ��ڶ��ڴ��У�Ȼ�󷽷����д洢a�ĵ�ַ
	// ����a������ô�͵�ִ��a�Ĺ��췽��
	// ��ζ��Ҫִ��i++,j++,�ڴ������󽫱��ֵ����Ϊ��Ĭ��ֵ
	// i->1 j->1
	// a�Ĺ��췽��ִ����ɣ�Ȼ���ʼ��i��j
	// i = 5;����ʵ������5���ǵ����ֵ1
	// ע�⣺������ع����в����������ֵ/
	// �����ڴ����������������ʽʹ�õ�ʱ��Ὣ���ֵ��Ϊ��Ĭ��ֵʹ��
	static A a = new A();
	static int i = 5;
	static int j;

	public A() {
		i++;
		j++;
		System.out.println(i);
		System.out.println(j);
	}

}