public class LoopExer {

	public static void main(String[] args){
	
		/*
			*
			**
			***
			****
			*****
		*/
		for(int i = 1, j = 1; i <= 9; j++){
			// 无论哪一行，上来都是先打印*
			System.out.print("*");
			// 判断是否是打印完成本行最后一个*
			if(j == i){
				// 换行
				System.out.println();
				// 行数+1
				i++;
				// *从头重新开始计数
				j = 0;
			}
		}
	
	}

}