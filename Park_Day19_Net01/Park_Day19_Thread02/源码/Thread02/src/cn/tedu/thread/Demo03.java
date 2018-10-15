package cn.tedu.thread;

/**
 * �̼߳��ͨ�� - �����ڴ淽ʽ������Ϣ
 */
public class Demo03 {
	public static boolean canRun = true; 
	public static void main(String[] args) {
		new Thread(new Thread03_Master()).start();
		new Thread(new Thread03_Slave()).start();
	}
}

class Thread03_Master implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			Demo03.canRun = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Thread03_Slave implements Runnable{
	@Override
	public void run() {
		while(Demo03.canRun){
			System.out.println("С�������С�����");
		}
		System.out.println("С�ܸ���ˡ�����");
	}
}
