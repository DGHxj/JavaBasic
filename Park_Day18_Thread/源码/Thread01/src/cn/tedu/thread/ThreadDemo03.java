package cn.tedu.thread;

/**
 * �����̵߳ķ�ʽһ��ʵ��Runnable�ӿڵķ�ʽ
 */
//--����1��дһ����ʵ��Runnable�ӿ�
class MyRunnable03 implements Runnable{
	public static boolean canRun = true;
	@Override
	public void run() {
		while(canRun){
			System.out.println("����Ӱ������");
		}
	}
}

public class ThreadDemo03 {
	public static void main(String[] args) throws Exception {
		//--����2������Thread���󣬲�����Runnable�ӿ�ʵ����Ķ���
		Thread t1 = new Thread(new MyRunnable03());
		//--����3������Thread��start()���� ���������ײ��߳� ����ָ���̴߳���
		t1.start();
		
		Thread.sleep(3000);
		
		MyRunnable03.canRun = false;
	}
}
