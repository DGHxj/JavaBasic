package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {

		// ��ʾ������һ�������ָ��D���µ�a.txt
		// ����һ���µ��ļ������ԭ�ļ��Ѵ����������ļ�����ԭ�ļ�
		// ���ԭ�ļ������ڣ������ļ���ΪĿ���ļ����в���
		// FileWriter writer = new FileWriter("D:\\a.txt");
		// ׷�ӷ�ʽ
		// ԭ�ļ��Ѵ��ڣ����ᴴ�����ļ�����ֱ������ԭ�ļ�
		FileWriter writer = new FileWriter("D:\\a.txt", true);

		// д������
		// ���ݲ���ֱ��д���ļ���
		// ������д����������
		// ������������֮���ٽ��������е����ݷŵ��ļ���
		// ��������û�б�������Ȼ����������
		// �͵�����һ�����������ڻ�������û�����ü��ŵ��ļ���
		// �������ݲ����˶�ʧ
		writer.write("xyz");

		// ��ˢ������
		// writer.flush();

		// �ر���
		// ���ڹرյ�ʱ����Զ���ˢһ�λ�����
		writer.close();

		// ���ر��ˣ����������ڴ��л�������--- ����
		System.out.println(writer);
		// ��ʾ���������������Ϊnull���ֶ��������һ������������Ա�����
		writer = null;
	}

}
