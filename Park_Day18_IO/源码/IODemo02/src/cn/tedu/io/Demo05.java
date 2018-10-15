package cn.tedu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

/**
 * ��������л������л�
 */

class Home{
	private String addr;
	
	public Home() {
	}
	
	public Home(String addr) {
		this.addr = addr;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

class Person_05 implements Serializable{
	private static final long serialVersionUID = 999L;
	
	public static String country = "China";
	
	private String name;
	private int age;
	private transient String psw;
	private Home home;
	
	public Person_05() {
	}

	public Person_05(String name, int age,String psw,Home home) {
		this.name = name;
		this.age = age;
		this.psw = psw;
		this.home = home;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}
	
}

public class Demo05 {
	/**
	 * ���л�
	 */
	@Test
	public void writeObj() throws Exception{
//		//1.��������
//		Person_05 p = new Person_05("zs",19,"999",new Home("����"));
//		//2.�������������
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("3.data"));
//		//3.���������л����
//		oos.writeObject(p);
//		//4.�ر���
//		oos.flush();
//		oos.close();
	}
	
	@Test
	public void readObj() throws Exception{
		//1.��������������
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("3.data"));
		//2.ͨ������ȡ���ݻָ��ض���
		Person_05 p = (Person_05) ois.readObject();
		//3.���ʶ�����Ϣ
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getPsw());
		System.out.println(p.getHome().getAddr());
		//4.�ر���
		ois.close();
	}
}
