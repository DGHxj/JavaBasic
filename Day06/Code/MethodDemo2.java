public class MethodDemo2 {

	public static void main(String[] args){
		add(3,7,6);
	}
	// add(2,6);
	// add(3,2.5);
	// add(4.3,9);
	// ��2�������ĺ�
	public static int add(int i, int j){
		return i + j;
	}
	public static double add(int i ,double j){
		return i + j;
	}
	public static double add(double j ,int i){
		return i + j;
	}
	/*
	public static int add(int a, int b){
		return a + b;
	}
	*/
	// ��3�������ĺ�
	public static int add(int i, int j, int k){
		return i + j + k;
	}
	// ��3��С���ĺ�
	public static double add(double i, double j, double k){
		return i + j + k;
	}
	// ��2��������1��С���ĺ�
	public static double add(int i, int j, double k){
		return i + j + k;
	}
	
	
	
	
	
	
}