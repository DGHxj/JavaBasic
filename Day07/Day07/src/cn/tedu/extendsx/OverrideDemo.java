package cn.tedu.extendsx;

public class OverrideDemo {
	
	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		// ��������ǵ�����д֮��ķ���
		t.work();
		
	}

}

// ��ʾְҵ����
class Profession {

	public void work() {
		System.out.println("�ڹ���~~~");
	}

}

class Teacher extends Profession {

	// �����еķ���д�ıȽϼ򵥣�������Ҫ�Ը����еķ���������չ
	@Override // @ ע��
	// @Override���ע��������У�鵱ǰ�����Ƿ񹹳�����д
	public void work() {
		System.out.println("�����ʦ�ڻ��˲���");
	}

}
