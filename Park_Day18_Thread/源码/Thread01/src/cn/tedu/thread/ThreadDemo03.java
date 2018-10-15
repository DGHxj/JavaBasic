package cn.tedu.thread;

/**
 * 创建线程的方式一：实现Runnable接口的方式
 */
//--步骤1：写一个类实现Runnable接口
class MyRunnable03 implements Runnable{
	public static boolean canRun = true;
	@Override
	public void run() {
		while(canRun){
			System.out.println("看电影。。。");
		}
	}
}

public class ThreadDemo03 {
	public static void main(String[] args) throws Exception {
		//--步骤2：创建Thread对象，并传入Runnable接口实现类的对象
		Thread t1 = new Thread(new MyRunnable03());
		//--步骤3：调用Thread的start()方法 真正启动底层线程 运行指定线程代码
		t1.start();
		
		Thread.sleep(3000);
		
		MyRunnable03.canRun = false;
	}
}
