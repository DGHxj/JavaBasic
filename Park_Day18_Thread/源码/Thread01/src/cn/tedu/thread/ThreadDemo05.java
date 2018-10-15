package cn.tedu.thread;

/**
 * ���̲߳�����ȫ����
 */
public class ThreadDemo05 {
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
		while(true){
			synchronized (ThreadDemo05.class) {
				if("��÷".equals(ThreadDemo05.name)){
					ThreadDemo05.name = "����";
					ThreadDemo05.gender = "��";
				}else{
					ThreadDemo05.name = "��÷";
					ThreadDemo05.gender = "Ů";
				}
			}
		}
	}
}

class PrintThread implements Runnable{
	@Override
	public void run() {
		while(true){
			synchronized (ThreadDemo05.class) {
				System.out.println("������" + ThreadDemo05.name + ",�Ա�" + ThreadDemo05.gender);
			}
		}
	}
}
