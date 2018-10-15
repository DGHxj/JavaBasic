package cn.tedu.thread;

/**
 * 线程类中的常用方法
 */

public class ThreadDemo04 {
	public static void main(String[] args) throws Exception {
//		//--getId() getName() setName()
//		Thread t1 = new Thread(new Runnable(){
//			@Override
//			public void run() {
//				
//			}
//		});
//		System.out.println(t1.getId());
//		System.out.println(t1.getName());
//		t1.setName("PQThread-01");
//		System.out.println(t1.getName());
		
//		//--setPriority(int newPriority)  getPriority()
//		Thread t1 = new Thread(new Runnable() {
//			private int i = 0;
//			@Override
//			public void run() {
//				while(true)
//					System.out.println(Thread.currentThread().getId()+":"+(++i));
//			}
//		});
//		Thread t2 = new Thread(new Runnable() {
//			private int i = 0;
//			@Override
//			public void run() {
//				while(true)
//					System.out.println(Thread.currentThread().getId()+":"+(++i));
//			}
//		});
//		t1.setPriority(10);
//		t2.setPriority(1);
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		t1.start();
//		t2.start();
		
		//--sleep
		System.out.println("aaaa");
		Thread.sleep(3000);
		System.out.println("bbbb");
	}
}
