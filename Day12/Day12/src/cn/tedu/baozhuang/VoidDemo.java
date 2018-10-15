package cn.tedu.baozhuang;

public class VoidDemo {

	public void m() {
		System.out.println("hello m~~~");
	}
	
	// 如果返回值类型定义为Void，返回值必须定义为null
	public Void m2(){
		System.out.println("hello m2~~~");
		return null;
	}

}
