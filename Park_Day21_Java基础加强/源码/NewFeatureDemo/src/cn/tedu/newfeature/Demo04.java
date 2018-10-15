package cn.tedu.newfeature;

/**
 * 可变参数
 */
public class Demo04 {
	//--可变参数的声明
	public static int sumx1(int ...nums) {
		int sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];
		}
		return sum;
	}
	//--同一个方法内可变参数只能出现一次
	//--且只能出现在 方法参数列表的最后一个位置
	public static int sumx2(int x,int ... nums){
		int sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];
		}
		return sum * x;
	}
	
	public static void main(String[] args) {
		
		//--可变参数可以接受0到n个参数 在其内部相当于是一个数组
		int r2 = sumx1();
		int r3 = sumx1(2);
		int r4 = sumx1(2,3);
		int r5 = sumx1(2,3,4,5,76,7,3,54,567,34,546);
		System.out.println(r5);
		
		//--可变参数也可以直接接受一个数组 这个过程中会将数组拆分 得到元素作为可变参数的值进行传递
		int [] arr = {2,3,4,5};
		int r6 = sumx1(arr);
		System.out.println(r6);
	}
}
