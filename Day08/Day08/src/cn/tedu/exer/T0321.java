package cn.tedu.exer;

public class T0321 {
	
	public static void main(String[] args) {
		
		// 定义一个变量表示圆周率
		double PI = 0.0;
		
		// 定义一个变量来记录次数
		int count = 0;
		
		// 记录分母
		double base = 1;
		
		// 控制符号的变化
		double sym = 1;
		
		while(PI > 3.1415927 || PI < 3.1415926){
			// 计算圆周率
			PI += 4.0 * sym / base;
			// 次数+1
			count++;
			// 分母+2
			base += 2;
			// 符号改变
			sym *= -1;
		}
		
		System.out.println(count);
		
	}

}
