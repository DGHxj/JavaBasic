package cn.tedu.thread;

/**
 * join
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		System.out.println("����ѧ�Ρ�����");
		System.out.println("����ѧ�Ρ�����");
		System.out.println("����ѧ�Ρ�����");
		System.out.println("����ѧ�Ρ�����");
		Thread t = new Thread(new Thread_06());
		t.start();
		t.join();//����������ģʽ ֱ�� tִ�����
		System.out.println("����ѧ�Ρ�����");
		System.out.println("����ѧ�Ρ�����");
		System.out.println("����ѧ�Ρ�����");
		System.out.println("����ѧ�Ρ�����");
	}
}

class Thread_06 implements Runnable{
	@Override
	public void run() {
		System.out.println("���㲥��ٿ�ʼ������");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���㲥��ٽ���������");
	}
}
