public class OperatorDemo {
	
	public static void main(String[] args){
		
		/*
		int i = -9;
		int j = 4;
		System.out.println(i % j);
		*/
		// System.out.println(5 % 1.4);
		int i = 7;
		// 相当于在原来的基础上来自加1
		// 先将i的值7取出来标记为结果，然后i自增为8，最后再将7赋值给j
		// int j = i++;
		// 先将i自增为8，然后再将i的值赋值给j
		// int j = ++i;
		// 先将i的值7取出来参与后续运算，然后i自增为8，用7参与乘法运算，结果就是14，最后将计算的14赋值给j
		// int j = i++ * 2;
		// 先将i自增为8，然后将8取出来参与乘法运算，结果结果是16
		int j = ++i * 2;
		System.out.println(i);
		System.out.println(j);
	}
	
}