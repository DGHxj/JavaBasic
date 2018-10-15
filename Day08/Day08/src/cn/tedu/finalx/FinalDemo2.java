package cn.tedu.finalx;

public class FinalDemo2 {
	
	public static void main(String[] args) {
		
		C c = new C();
		c.m();
		
	}

}

class B {

	public final void m() {
		System.out.println("B~~~");
	}

}

class C extends B {
	
}

final class D {}