package cn.tedu.singleobj;

class �����쵼��{
	private static �����쵼�� ldr = new �����쵼��("������");
	
	private String name;
	
	public static �����쵼�� getInstance(){
		return ldr;
	}
	
	private �����쵼��(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
class �����쵼��2{
	private static �����쵼��2 ldr = null;
	
	private String name;
	
	private �����쵼��2(String name) {
		this.name = name;
	}
	
	public static synchronized �����쵼��2 getInstance(){
		if(ldr == null){
			ldr = new �����쵼��2("������");
		}
		return ldr;
	}
	
	public String getName() {
		return name;
	}
}

public class Demo01 {
	public static void main(String[] args) {
		�����쵼�� ldr1 = �����쵼��.getInstance();
		�����쵼�� ldr2 = �����쵼��.getInstance();
		�����쵼�� ldr3 = �����쵼��.getInstance();
		�����쵼�� ldr4 = �����쵼��.getInstance();
	}
}
