package cn.tedu.thread;

/**
 * 等待唤醒机制 案例 - 改造改变打印案例
 */
public class Demo02 {
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
		try {
			while(true){
				synchronized (Demo02.class) {
					if ("马冬梅".equals(Demo02.name)) {
						Demo02.name = "夏洛";
						Demo02.gender = "男";
					} else {
						Demo02.name = "马冬梅";
						Demo02.gender = "女";
					}
					//唤醒
					Demo02.class.notify();
					//等待
					Demo02.class.wait();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class PrintThread implements Runnable{
	@Override
	public void run() {
		try {
			while(true){
				synchronized (Demo02.class) {
					System.out.println("姓名：" + Demo02.name + ",性别：" + Demo02.gender);
					Demo02.class.notify();
					Demo02.class.wait();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
