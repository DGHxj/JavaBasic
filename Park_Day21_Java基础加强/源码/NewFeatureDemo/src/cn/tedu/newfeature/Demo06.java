package cn.tedu.newfeature;

/**
 * 枚举
 */
public class Demo06 {
	public static void main(String[] args) {
		System.out.println(Week06.Fri.getDay());
		System.out.println(Week06.Fri.isRestDay());
		System.out.println(WeekEnum06.Fri.getDay());
		System.out.println(WeekEnum06.Fri.isRestDay());
	}
}

//在JDK5之后，有了enmu关键字 ，便于实现枚举
//--包含成员属性
//--包含私有构造方法
//--包含普通方法
//--包含抽象方法
enum WeekEnum06{
	Mon(1){
		@Override
		public boolean isRestDay() {
			return false;
		}
	},Tue(2){
		@Override
		public boolean isRestDay() {
			return false;
		}
	},Wed(3){
		@Override
		public boolean isRestDay() {
			return false;
		}
	},Thu(4){
		@Override
		public boolean isRestDay() {
			return false;
		}
	},Fri(5){
		@Override
		public boolean isRestDay() {
			return false;
		}
	},Sat(6){
		@Override
		public boolean isRestDay() {
			return true;
		}
	},Sun(7){
		@Override
		public boolean isRestDay() {
			return true;
		}
	};
	private int day = 0;
	private WeekEnum06(int day){
		this.day = day;
	}
	public int getDay(){
		return day;
	}
	public abstract boolean isRestDay();
}

//在JDK5之前，手动实现枚举效果
//--包含成员属性
//--包含私有构造方法
//--包含普通方法
//--包含抽象方法
abstract class Week06{
	public static final Week06 Mon = new Week06(1){
		@Override
		public boolean isRestDay() {
			return false;
		}
	};
	public static final Week06 Tue = new Week06(2){
		@Override
		public boolean isRestDay() {
			return false;
		}
	};
	public static final Week06 Wed = new Week06(3){
		@Override
		public boolean isRestDay() {
			return false;
		}
	};
	public static final Week06 Thu = new Week06(4){
		@Override
		public boolean isRestDay() {
			return false;
		}
	};
	public static final Week06 Fri = new Week06(5){
		@Override
		public boolean isRestDay() {
			return false;
		}
	};
	public static final Week06 Sat = new Week06(6){
		@Override
		public boolean isRestDay() {
			return true;
		}
	};
	public static final Week06 Sun = new Week06(7){
		@Override
		public boolean isRestDay() {
			return true;
		}
	};
	
	private int day = 0;
	private Week06(int day) {
		this.day = day;
	}
	public int getDay(){
		return this.day;
	}
	public abstract boolean isRestDay();
}
