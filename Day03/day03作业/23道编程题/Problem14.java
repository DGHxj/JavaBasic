package homework.day03;

public class Problem14 {
	public static void main(String[] args) {
		for(int a=1;a<=9;a++){
			for(int b=0;b<=9;b++){
				for(int c=0;c<=9;c++){
					for(int d=0;d<=9;d++){
						if(((a*10+b)+(c*10+d))*((a*10+b)+(c*10+d))==(a*1000+b*100+c*10+d)){
							System.out.println("a="+a+" a="+b+" a="+c+" d="+d);
						}
					}
				}
			}
		}
	}
}
