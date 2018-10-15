package homework.day03;

public class Problem13 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for(int j=1;j<=12;j++){
				int xh=(36-i*4-j*3)*2;
				if((xh+i+j)==36)
					System.out.println("男："+i+"个，"+"女："+j+"个，"+"小孩："+xh+"个。");
			}
		}
	}
}
