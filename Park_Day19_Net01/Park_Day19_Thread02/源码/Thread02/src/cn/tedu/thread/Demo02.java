package cn.tedu.thread;

/**
 * �ȴ����ѻ��� ���� - ����ı��ӡ����
 */
public class Demo02 {
	public static String name = "��÷";
	public static String gender = "Ů";
	
	public static void main(String[] args) {
		new Thread(new PrintThread()).start();
		new Thread(new ChangeThread()).start();
	}
}

class ChangeThread implements Runnable{
	@Override
	public void run() {
		try {
			while(true){
				synchronized (Demo02.class) {
					if ("��÷".equals(Demo02.name)) {
						Demo02.name = "����";
						Demo02.gender = "��";
					} else {
						Demo02.name = "��÷";
						Demo02.gender = "Ů";
					}
					//����
					Demo02.class.notify();
					//�ȴ�
					Demo02.class.wait();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class PrintThread implements Runnable{
	@Override
	public void run() {
		try {
			while(true){
				synchronized (Demo02.class) {
					System.out.println("������" + Demo02.name + ",�Ա�" + Demo02.gender);
					Demo02.class.notify();
					Demo02.class.wait();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
