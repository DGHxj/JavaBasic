package cn.tedu.thread;

public class ThreadDemo06 {
	public static int tickets = 10;
	public static void main(String[] args) {
		new Thread(new Saler()).start();
		new Thread(new Saler()).start();
	}
}

class Saler implements Runnable{
	@Override
	public void run() {
		while(ThreadDemo06.tickets>0){
			synchronized (ThreadDemo06.class) {
				ThreadDemo06.tickets--;
				System.out.println(Thread.currentThread().getId() + "窗口，卖出去了一张票。。剩余票数为" + ThreadDemo06.tickets);
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
