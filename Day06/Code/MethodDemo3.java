public class MethodDemo3 {

	public static void main(String[] args){
		
		/*
		int i = 6;
		plus(i);
		System.out.println(i);
		*/
		int[] arr = {3,5,6,1,7,9,0};
		// plus(arr[2]);
		// changeVal(arr);
		changeRef(arr);
		System.out.println(arr[2]);
		
	}
	
	public static void changeRef(int[] arr){
		arr = new int[3];
	}
	
	public static void changeVal(int[] arr){
		arr[2] += 5;
	}
	
	public static void plus(int i){
		i *= 2;
	}

}