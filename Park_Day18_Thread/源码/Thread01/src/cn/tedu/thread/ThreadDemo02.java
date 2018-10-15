package cn.tedu.thread;
/**
 * 创建线程的方式一：继承Thread方式
 */

//--步骤1：写一个类继承Thread
class MyThread extends Thread{
	@Override
	public void run() {
		while(true){
			System.out.println("看电影。。。");
		}
	}
}

public class ThreadDemo02 {
	public static void main(String[] args) {
		//--步骤2：创建MyThread类的对象
		MyThread t1 = new MyThread();
		//--步骤3：调用t1的start()方法 启动线程
		t1.start();

		//--主线程并发执行其他任务
		while(true){
			System.out.println("写代码。。。");
		}
	}
}
