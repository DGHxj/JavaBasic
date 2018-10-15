package cn.tedu.newfeature;

/**
 * �ɱ����
 */
public class Demo04 {
	//--�ɱ����������
	public static int sumx1(int ...nums) {
		int sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];
		}
		return sum;
	}
	//--ͬһ�������ڿɱ����ֻ�ܳ���һ��
	//--��ֻ�ܳ����� ���������б�����һ��λ��
	public static int sumx2(int x,int ... nums){
		int sum = 0;
		for(int i = 0;i<nums.length;i++){
			sum += nums[i];
		}
		return sum * x;
	}
	
	public static void main(String[] args) {
		
		//--�ɱ�������Խ���0��n������ �����ڲ��൱����һ������
		int r2 = sumx1();
		int r3 = sumx1(2);
		int r4 = sumx1(2,3);
		int r5 = sumx1(2,3,4,5,76,7,3,54,567,34,546);
		System.out.println(r5);
		
		//--�ɱ����Ҳ����ֱ�ӽ���һ������ ��������лὫ������ �õ�Ԫ����Ϊ�ɱ������ֵ���д���
		int [] arr = {2,3,4,5};
		int r6 = sumx1(arr);
		System.out.println(r6);
	}
}
