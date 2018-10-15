public class MethodExer3 {

	public static void main(String[] args){
		
		// add(double, int) --- 参数进行类型的自动提升 --- add(double, double)
		// System.out.println(add(3.5,3));
		// add(int, int) -> add(int, double), add(double, int) -> add(double, double)
		System.out.println(add(3,3));
		
	}
	
	public static double add(int i, double j){
		// System.out.println("running~~~");
		return i + j;
	}
	
	public static double add(double i, int j){
		return i + j;
	}
	
	public static double add(double i, double j){
		return i + j;
	}

}