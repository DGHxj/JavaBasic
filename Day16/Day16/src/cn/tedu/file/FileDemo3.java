package cn.tedu.file;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		
		File file = new File("D:\\a");
		
		// �ж�file��������ļ�����Ŀ¼�Ƿ���ʵ����
		System.out.println(file.exists());
		
		// �ж��Ƿ��д
		System.out.println(file.canWrite());
		
		// �ж��Ƿ���һ�������ļ�
		System.out.println(file.isHidden());
		
		// �ж��ǲ���һ������·��
		System.out.println(file.isAbsolute());
	}
	
}
