package homework.day03;

public class Problem16 {
	public static void main(String[] args) {
		for(int i=1,j=1;i<=9&&j<=i;j++){
			System.out.print(j+"*"+i+"="+String.format("%-5d", i*j));
			if(i==j){
				i++;
				j=0;
				System.out.println();
			}
		}
	}
}
