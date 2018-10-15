package cn.tedu.singleobj;

class 曹县领导人{
	private static 曹县领导人 ldr = new 曹县领导人("新三胖");
	
	private String name;
	
	public static 曹县领导人 getInstance(){
		return ldr;
	}
	
	private 曹县领导人(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
class 曹县领导人2{
	private static 曹县领导人2 ldr = null;
	
	private String name;
	
	private 曹县领导人2(String name) {
		this.name = name;
	}
	
	public static synchronized 曹县领导人2 getInstance(){
		if(ldr == null){
			ldr = new 曹县领导人2("鑫三胖");
		}
		return ldr;
	}
	
	public String getName() {
		return name;
	}
}

public class Demo01 {
	public static void main(String[] args) {
		曹县领导人 ldr1 = 曹县领导人.getInstance();
		曹县领导人 ldr2 = 曹县领导人.getInstance();
		曹县领导人 ldr3 = 曹县领导人.getInstance();
		曹县领导人 ldr4 = 曹县领导人.getInstance();
	}
}
