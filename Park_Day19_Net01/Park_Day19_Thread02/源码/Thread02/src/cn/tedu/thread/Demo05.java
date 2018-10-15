package cn.tedu.thread;

/**
 * �ػ��߳� - ������ҫ ��Ϸ����
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		new Thread(new ShuiJing()).start();
		
		Thread t1 = new Thread(new Hero("������")); 
		Thread t2 = new Thread(new Hero("�����")); 
		Thread t3 = new Thread(new Hero("�����")); 
		Thread t4 = new Thread(new Hero("����")); 
		Thread t5 = new Thread(new Hero("��ɪ"));
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t4.setDaemon(true);
		t5.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		while(ShuiJing.blood>0){
			Thread.sleep(1000);
			ShuiJing.blood -= 8;
		}
	}
}

class Hero implements Runnable{
	private String name = null;
	public Hero(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+"˵��Ϊ��ˮ�����尡~~~�������ǡ���");
		}
	}
	
}

class ShuiJing implements Runnable{
	public static int blood = 100;
	@Override
	public void run() {
		while(this.blood>0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ȫ������������ˮ������Ѫ��ʣ��"+blood);
		}
		System.out.println("ˮ�������ˡ�����Ϸ����������");
	}
}
