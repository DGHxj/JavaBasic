package cn.tedu.math;

import java.math.BigInteger;

public class BigIntegerDemo {
	
	public static void main(String[] args) {
		
		// ��������������
		// ��Ҫ��������������ַ�����ʽ����
		BigInteger bi1 = new BigInteger("434168613543100552413456315463146318879641674641764198746796896841687984");
		BigInteger bi2 = new BigInteger("796846341659846316874684149874613496743135796413414684163749684634116874");
		
		System.out.println(bi1.multiply(bi2));
	}
}
