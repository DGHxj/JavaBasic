package cn.tedu.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP������ͨ��TCPʵ���ļ��ϴ� - ����˴���
 */

public class Demo02UploadServer {
	public static void main(String[] args) throws Exception {
		//1.���������
		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress(44444));
		System.out.println("###ǧ�����̿�ʼ������###");
		//2.��ͣ���ܿͻ������ӣ�һ�����ӳɹ��������̴߳���
		while(true){
			Socket socket = ss.accept();
			new Thread(new UploadRunnable(socket)).start();
		}
	}
}

class UploadRunnable implements Runnable{
	private Socket socket = null;
	public UploadRunnable(Socket socket) {
		this.socket  = socket;
	}
	
	/**
	 * ͨ��˽��Э�鴫������ Э��ĸ�ʽΪ [�ļ�������\r\n�ļ��� �ļ�����\r\n�ļ�����]
	 */
	@Override
	public void run() {
		OutputStream out = null;
		try {
			//1.��ȡsocket������
			InputStream in = socket.getInputStream();
			//2.��ȡ�ļ��� - ������һ���س�����֮ǰ ��ȡ���ļ����ĳ��� ���Ŷ�ȡ������ȵ��ֽ� �����ļ���
			//--��ȡ���� ֱ��������һ���س�����
			//----ÿ�δ����ж�ȡһ���ֽ� ת���ַ��� ƴ��line�� ֻҪline������\r\n��β ���ظ��������
			String line = "";
			byte [] tmp = new byte[1];
			while(!line.endsWith("\r\n")){
				in.read(tmp);
				line += new String(tmp);
			}
			//----��ȡ���� �ļ�������\r\n �ص�\r\n ת��int �����ļ����ĳ���
			int len = Integer.parseInt(line.substring(0, line.length()-2));
			//----�����н��Ŷ� len���ֽ� �����ļ���
			byte [] data = new byte[len];
			in.read(data);
			String fname = new String(data);
			
			//3.��ȡ�ļ�����  - ������һ���س�����֮ǰ ��ȡ���ļ����ݵĳ��� ���Ŷ�ȡ������ȵ��ֽ� �����ļ�����
			String line2 = "";
			byte [] tmp2 = new byte[1];
			while(!line2.endsWith("\r\n")){
				in.read(tmp2);
				line2 += new String(tmp2);
			}
			//----��ȡ���� �ļ�����\r\n �ص�\r\n ת��int �����ļ��ĳ���
			int len2 = Integer.parseInt(line2.substring(0, line2.length()-2));
			//4.�����ж�ȡ �ļ����ȸ��ֽ� �����ļ����� ������ļ���
			byte data2 [] = new byte[len2];
			in.read(data2);
			
			//5.�����ļ������ָ�����λ��,������д��������
			String path = "upload/"+fname;
			out = new FileOutputStream(path);
			out.write(data2);
			System.out.println("���յ�������["+socket.getInetAddress().getHostAddress()+"]���ϴ��ļ�["+path+"]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//6.�ر���Դ
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					out = null;
				}
			}
			if(socket != null){
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
