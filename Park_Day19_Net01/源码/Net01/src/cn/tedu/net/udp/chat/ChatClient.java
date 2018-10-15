package cn.tedu.net.udp.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) {
		new Thread(new Sender()).start();
		new Thread(new Receiver()).start();
	}
}

/**
 * ������Ϣ������
 */
class Receiver implements Runnable{
	@Override
	public void run() {
		DatagramSocket ds = null;
		try {
			//1.�������ն�
			ds = new DatagramSocket(44444);
			while(true){
				//2.�������ݰ�
				byte [] data = new byte[1024];
				DatagramPacket dp = new DatagramPacket(data, data.length);
				ds.receive(dp);
				//3.��ȡ���յ�����Ϣ
				String msg = new String(data,0,dp.getLength());
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				System.err.println("==�յ�����["+ip+":"+port+"]����Ϣ����Ϣ����Ϊ����"+msg+"��========");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			//4.�رս��ն�
			if(ds != null){
				ds.close();
			}
		}
	}
}

/**
 * ������Ϣ������
 */
class Sender implements Runnable{
	@Override
	public void run() {
		Scanner scan = null;
		DatagramSocket ds = null;
		try {
			//1.�������Ͷ�
			ds = new DatagramSocket();
			//2.��������̨ɨ����
			scan = new Scanner(System.in);
			while(true){
				//3.��ȡ����̨ ��Ϣ��ʽ [ip#�˿�#��Ϣ]
				System.out.println("===������Ҫ���͵���Ϣ����ʽΪ[ip#�˿�#��Ϣ]��=================");
				String line = scan.nextLine();
				String attrs [] = line.split("#");
				String ip = attrs[0];
				int port = Integer.parseInt(attrs[1]);
				String msg = attrs[2];
				//4.��������
				DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length);
				dp.setSocketAddress(new InetSocketAddress(ip, port));
				ds.send(dp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			if(ds!=null){
				ds.close();
			}
			if(scan!=null){
				scan.close();
			}
		}
	}
}