package cn.tedu.extendsx;

public class OverrideDemo {
	
	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		// 子类对象是调用重写之后的方法
		t.work();
		
	}

}

// 表示职业的类
class Profession {

	public void work() {
		System.out.println("在工作~~~");
	}

}

class Teacher extends Profession {

	// 父类中的方法写的比较简单，子类需要对父类中的方法进行扩展
	@Override // @ 注解
	// @Override这个注解是用于校验当前方法是否构成了重写
	public void work() {
		System.out.println("这个老师在诲人不倦");
	}

}
