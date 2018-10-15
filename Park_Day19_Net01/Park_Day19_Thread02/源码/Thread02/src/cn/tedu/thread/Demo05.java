package cn.tedu.thread;

/**
 * 守护线程 - 王者荣耀 游戏开发
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		new Thread(new ShuiJing()).start();
		
		Thread t1 = new Thread(new Hero("安其拉")); 
		Thread t2 = new Thread(new Hero("孙悟空")); 
		Thread t3 = new Thread(new Hero("诸葛亮")); 
		Thread t4 = new Thread(new Hero("吕布")); 
		Thread t5 = new Thread(new Hero("亚瑟"));
		
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
			System.out.println(name+"说：为了水晶，冲啊~~~碾碎他们。。");
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
			System.out.println("全军出击，守卫水晶。。血量剩余"+blood);
		}
		System.out.println("水晶被打爆了。。游戏结束。。。");
	}
}
