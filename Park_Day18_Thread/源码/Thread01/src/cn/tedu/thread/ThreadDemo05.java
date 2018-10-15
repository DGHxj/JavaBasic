package cn.tedu.thread;

/**
 * 多线程并发安全问题
 */
public class ThreadDemo05 {
	public static String name = "马冬梅";
	public static String gender = "女";
	
	public static void main(String[] args) {
		new Thread(new PrintThread()).start();
		new Thread(new ChangeThread()).start();
	}
}

class ChangeThread implements Runnable{
	@Override
	public void run() {
		while(true){
			synchronized (ThreadDemo05.class) {
				if("马冬梅".equals(ThreadDemo05.name)){
					ThreadDemo05.name = "夏洛";
					ThreadDemo05.gender = "男";
				}else{
					ThreadDemo05.name = "马冬梅";
					ThreadDemo05.gender = "女";
				}
			}
		}
	}
}

class PrintThread implements Runnable{
	@Override
	public void run() {
		while(true){
			synchronized (ThreadDemo05.class) {
				System.out.println("姓名：" + ThreadDemo05.name + ",性别：" + ThreadDemo05.gender);
			}
		}
	}
}
