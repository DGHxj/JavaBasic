package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {

		// ��ʾ������һ������D����a.txt��File����
		// file���󴴽���ʱ�򲢲���ȥ������м���ļ��Ƿ���ʵ����
		// ֻ�ǽ������·�����Ϊ��һ��file����
		File file = new File("test/a.txt");

		// ɾ���ļ�/Ŀ¼ --- ������
		// ��ʾ���ļ�/Ŀ¼�Ӽ�����г����Ƴ������ɳ���
		// ��ɾ��Ŀ¼��ʱ��Ҫ��Ŀ¼�ǿ�Ŀ¼
		boolean b = file.delete();

		// �����ļ�
		// �������ļ������ڣ��򴴽����ļ�
		// ����ļ��Ѿ����ڣ��򴴽�ʧ��
		// �ڴ�������ļ���ʱ��Ҫ������ļ��Ĵ��·��������ʵ����
		// ֻ�ܴ����ļ����ܴ���Ŀ¼
		// boolean b = file.createNewFile();

		// ����Ŀ¼
		// make directory
		// ���ҽ������Ŀ¼�����ڵ�ʱ��Żᴴ��
		// ֻ�ܴ���һ��Ŀ¼
		// boolean b = file.mkdir();
		// ��ʾ���Դ���һ����߶��Ŀ¼
		// boolean b = file.mkdirs();

		System.out.println(b);
	}

}
