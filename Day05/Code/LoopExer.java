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
			// ������һ�У����������ȴ�ӡ*
			System.out.print("*");
			// �ж��Ƿ��Ǵ�ӡ��ɱ������һ��*
			if(j == i){
				// ����
				System.out.println();
				// ����+1
				i++;
				// *��ͷ���¿�ʼ����
				j = 0;
			}
		}
	
	}

}