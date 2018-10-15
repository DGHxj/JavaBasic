package cn.tedu.thread;

import java.util.LinkedList;

/**
 * 等待唤醒机制 案例 - 实现阻塞式队列
 * @author Administrator
 *
 */
class MyBlockingQueue{
	//--用LinkedList作为队列 存储数据
	private LinkedList queue = new LinkedList<>();
	
	//--限定阻塞式队列的容量
	private int MaxSize = 0;
	
	
	public MyBlockingQueue(int size) {
		this.MaxSize = size;
	}
	
	//--如果满了还要加 要阻塞当前操作线程
	public synchronized void add(Object obj){
		try {
			if(queue.size() >= this.MaxSize){
				//--不能往里加，阻塞当前线程，直到有人取走，队列变为非满
				this.wait();
			}
			queue.add(obj);
			this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	//--如果空了还要取 要阻塞当前操作线程
	public synchronized Object take(){
		try {
			if(queue.size() <=0 ){
				this.wait();
			}
			Object obj = queue.poll();
			this.notify();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}

public class Demo04 {
	public static void main(String[] args) {
		MyBlockingQueue bq = new MyBlockingQueue(3);
		new Thread(new Runnable() {
			@Override
			public void run() {
				bq.add("aaa");
				bq.add("bbb");
				bq.add("ccc");
				bq.add("ddd");
				bq.add("eee");
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(bq.take());
				System.out.println(bq.take());
				System.out.println(bq.take());
				System.out.println(bq.take());
				System.out.println(bq.take());
			}
		}).start();
	}
}





