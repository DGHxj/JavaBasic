package cn.tedu.thread;

/**
 * 线程间的通信 - 共享内存方式传递信息
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
			System.out.println("小弟在运行。。。");
		}
		System.out.println("小弟告辞了。。。");
	}
}
