package cn.tedu.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP������ͨ��TCPʵ���ļ��ϴ� - �ͻ��˴���
 */
public class Demo02UploadClient {
	public static void main(String[] args) {
		Scanner scanner = null;
		InputStream in = null;
		Socket socket = null;
		try {
			//1.Ҫ���û������ļ�·��
			scanner = new Scanner(System.in);
			System.out.println("--������Ҫ�ϴ����ļ���·����");
			String path = scanner.nextLine();
			File file = new File(path);
			//2.ֻ���ļ����� �� ��һ���ļ����ϴ�
			if(file.exists() && file.isFile()){
				//2.���������ļ���������
				in = new FileInputStream(file);
				//3.����TCP�ͻ��˶���
				socket = new Socket();
				//4.����TCP�����
				socket.connect(new InetSocketAddress("127.0.0.1",44444));
				//5.��ȡ��TCP����˵������
				OutputStream out = socket.getOutputStream();
				//6.1�����������[�ļ����ֽڳ���\r\n]
				out.write((file.getName().getBytes().length+"\r\n").getBytes());
				//6.2�����������[�ļ����ֽ�]
				out.write(file.getName().getBytes());
				//6.3�����������[�ļ������ֽڳ���\r\n]
				out.write((file.length()+"\r\n").getBytes());
				//6.4�����������[�ļ������ֽ�]
				byte [] data = new byte[1024];
				int i = 0;
				while((i = in.read(data))!=-1){
					out.write(data,0,i);
				}
			}else{
				throw new RuntimeException("�ļ������� ������һ���ļ���~~");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//7.�ر�ɨ���� �ر��ļ������� �ر��׽���
			if(scanner != null){
				scanner.close();
			}
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					in = null;
				}
			}
			if(socket!=null){
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					socket = null;
				}
			}
		}
	}
}
