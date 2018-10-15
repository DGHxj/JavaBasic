public class ForDemo {

	public static void main(String[] args){
		
		/*
		for(int i = 1; i <= 10; i++){
			System.out.println("Hello");
		}
		*/
		
		// 求1-50的和
		int sum = 0;
		// for()内有3部分组成
		// 对于for循环而言，如果第二部分的控制条件没有写，那么默认为true，这个时候就成了一个死循环
		for(int i = 1; i <= 10; i++){
			sum += i;
		}
		// System.out.println(sum);
		
	}

}