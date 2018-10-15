package cn.tedu.thread;

/**
 * 死锁
 */
class DYJ{}
class SMY{}

public class Demo01 {
	public static DYJ dyj = new DYJ();
	public static SMY smy = new SMY();
	
	public static void main(String[] args) {
		new Thread(new T01_A()).start();
		new Thread(new T01_B()).start();
	}
}
class T01_B implements Runnable{
	@Override
	public void run() {
		try{
			synchronized (Demo01.smy) {
				System.out.println("B使用扫描仪"+Demo01.smy);
				Thread.sleep(3000);
			}
			synchronized (Demo01.dyj) {
				System.out.println("B使用打印机"+Demo01.dyj);
				Thread.sleep(2000);
			}
			
		}catch( Exception e){
			e.printStackTrace();
		}
	}
}
class T01_A implements Runnable{
	@Override
	public void run() {
		try {
			synchronized (Demo01.dyj) {
				System.out.println("A使用打印机"+Demo01.dyj);
				Thread.sleep(3000);
			}
			synchronized (Demo01.smy) {
				System.out.println("A使用扫描仪"+Demo01.smy);
				Thread.sleep(2000);
			} 
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

