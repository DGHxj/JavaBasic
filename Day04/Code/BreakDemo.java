public class BreakDemo {

	public static void main(String[] args){
		
		/*
		for(int i = 1; i < 5; i++){
			
			if(i % 2 == 0)
				// ��ʾ������break֮��ѭ���ṹ�ͻ����
				break;
			
			System.out.println(i);
			
		}
		*/
		
		for(int i = 1; i < 5; i++){
			
			for(int j = 1; j < 5; j++){
				
				if(j % 3 == 0)
					// ��ʾ��ֹ��ǰ��һ��ṹ
					break;
				
				System.out.println(i + "," + j);
				
			}
			
		}
		
		
	}

}