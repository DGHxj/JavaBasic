package cn.tedu.thread;
/**
 * �����̵߳ķ�ʽһ���̳�Thread��ʽ
 */

//--����1��дһ����̳�Thread
class MyThread extends Thread{
	@Override
	public void run() {
		while(true){
			System.out.println("����Ӱ������");
		}
	}
}

public class ThreadDemo02 {
	public static void main(String[] args) {
		//--����2������MyThread��Ķ���
		MyThread t1 = new MyThread();
		//--����3������t1��start()���� �����߳�
		t1.start();

		//--���̲߳���ִ����������
		while(true){
			System.out.println("д���롣����");
		}
	}
}
