package cn.tedu.thread;

/**
 * �����̵߳ķ�ʽһ��ʵ��Runnable�ӿڵķ�ʽ
 */
//--����1��дһ����ʵ��Runnable�ӿ�
class MyRunnable01 implements Runnable{
	@Override
	public void run() {
		while(true){
			System.out.println("����Ӱ������");
		}
	}
}

public class ThreadDemo01 {
	public static void main(String[] args) {
		//--����2������Thread���󣬲�����Runnable�ӿ�ʵ����Ķ���
		Thread t1 = new Thread(new MyRunnable01());
		//--����3������Thread��start()���� ���������ײ��߳� ����ָ���̴߳���
		t1.start();
		
		//--���̲߳���ִ����������
		while(true){
			System.out.println("д���롣����");
		}
	}
}
