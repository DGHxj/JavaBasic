package cn.tedu.thread;

/**
 * join
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		System.out.println("上数学课。。。");
		System.out.println("上数学课。。。");
		System.out.println("上数学课。。。");
		System.out.println("上数学课。。。");
		Thread t = new Thread(new Thread_06());
		t.start();
		t.join();//将进入阻塞模式 直到 t执行完成
		System.out.println("上数学课。。。");
		System.out.println("上数学课。。。");
		System.out.println("上数学课。。。");
		System.out.println("上数学课。。。");
	}
}

class Thread_06 implements Runnable{
	@Override
	public void run() {
		System.out.println("做广播体操开始。。。");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("做广播体操结束。。。");
	}
}
