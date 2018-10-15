public class OperatorDemo3 {

	public static void main(String[] args){
		
		// 如果算术>关系，先计算1+3=4，最后比较3>4，结果为false
		// 如果关系>算术，先计算3>1=true,然后true+1无法计算，会报错
		// System.out.println(3 > 1 + 3);
		
		// 如果关系>逻辑，先计算3>4=false,然后再计算true&false=false
		// 如果逻辑>关系，先计算true&3,无法计算，会报错
		// System.out.println(true & 3 > 4);
		
		// System.out.println(1 & 6 + 3);
		
		// System.out.println(2 << 3 > 3);
		// System.out.println(2 & 3 > 2);
		// System.out.println(2 << 3 + 3);
		// System.out.println(~3 + 3);
		// int i = 3, j = 5;
		// System.out.println(i < j ? i : j + 10);
		// boolean b = i < j ? i : j > 4;
		// System.out.println(i < j ? i : j ^ 5);
		
		int i = 5;
		// i = ~i++;
		i = ~++i;
		System.out.println(i);
		
	}

}