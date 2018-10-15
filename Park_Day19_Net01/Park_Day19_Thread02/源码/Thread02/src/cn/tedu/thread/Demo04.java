package cn.tedu.thread;

import java.util.LinkedList;

/**
 * �ȴ����ѻ��� ���� - ʵ������ʽ����
 * @author Administrator
 *
 */
class MyBlockingQueue{
	//--��LinkedList��Ϊ���� �洢����
	private LinkedList queue = new LinkedList<>();
	
	//--�޶�����ʽ���е�����
	private int MaxSize = 0;
	
	
	public MyBlockingQueue(int size) {
		this.MaxSize = size;
	}
	
	//--������˻�Ҫ�� Ҫ������ǰ�����߳�
	public synchronized void add(Object obj){
		try {
			if(queue.size() >= this.MaxSize){
				//--��������ӣ�������ǰ�̣߳�ֱ������ȡ�ߣ����б�Ϊ����
				this.wait();
			}
			queue.add(obj);
			this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	//--������˻�Ҫȡ Ҫ������ǰ�����߳�
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





