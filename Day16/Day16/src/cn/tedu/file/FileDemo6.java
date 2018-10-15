package cn.tedu.file;

import java.io.File;
//import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo6 {

	public static void main(String[] args) {

		File file = new File("E:\\");

		// ��ȡָ��Ŀ¼�µ����е���Ŀ¼�����ļ�
		// File[] fs = file.listFiles();

		// ��ȡE�������е����ļ�
		// File[] fs = file.listFiles(new FileFilter() {
		//
		// @Override
		// // д���˹���
		// // ����֮���������true�����Զ�����������
		// public boolean accept(File pathname) {
		// return pathname.isFile();
		// }
		// });
		// ��ȡE���������к������ֵ����ļ���������Ŀ¼
		// File[] fs = file.listFiles(new FileFilter() {
		//
		// @Override
		// public boolean accept(File pathname) {
		// return pathname.getName().matches(".*\\d.*");
		// }
		// });
		File[] fs = file.listFiles(new FilenameFilter() {

			@Override
			// dir��ʾ�ļ����洢��·��
			public boolean accept(File dir, String name) {
				return name.matches(".*\\d.*");
			}
		});

		for (File f : fs) {
			System.out.println(f);
		}

		// ��ȡ�ڴ�ռ� --- ���ص����ֽڸ���
		// long count = file.getTotalSpace();
		// System.out.println(count);

		// ��ȡ����ʹ�õĿռ��С
		// System.out.println(file.getUsableSpace());

	}

}
