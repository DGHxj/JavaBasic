package cn.tedu.thread;

/**
 * 创建线程的方式一：实现Runnable接口的方式
 */
//--步骤1：写一个类实现Runnable接口
class MyRunnable01 implements Runnable{
	@Override
	public void run() {
		while(true){
			System.out.println("看电影。。。");
		}
	}
}

public class ThreadDemo01 {
	public static void main(String[] args) {
		//--步骤2：创建Thread对象，并传入Runnable接口实现类的对象
		Thread t1 = new Thread(new MyRunnable01());
		//--步骤3：调用Thread的start()方法 真正启动底层线程 运行指定线程代码
		t1.start();
		
		//--主线程并发执行其他任务
		while(true){
			System.out.println("写代码。。。");
		}
	}
}
