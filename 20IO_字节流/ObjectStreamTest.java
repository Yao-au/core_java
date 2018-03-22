package com.baizhi.corejava.day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import org.junit.Test;

public class ObjectStreamTest {
	@Test
	public void testObjectOutputStream() throws IOException{
		Student s = new Student("xiaohei",18,100.0);
		
		// ������s���л����ⲿ����Դ
		// �����ڵ���
		OutputStream out = new FileOutputStream("E:/student.obj");
		// ʹ�ù�������װ�ڵ���
		ObjectOutputStream oos = new ObjectOutputStream(out);
		// ʹ�ù������еķ���
		oos.writeObject(s);
		// �رչ�����
		oos.close();
	}
	
	@Test
	public void testObjectInputStream() throws IOException, ClassNotFoundException{
		//�����ڵ���
		InputStream in = new FileInputStream("E:/student.obj");
		//ʹ�ù�������װ�ڵ���
		ObjectInputStream ois = new ObjectInputStream(in);
		// ʹ�ù������еķ���
		Object o = ois.readObject();
		Student s = (Student)o;
		System.out.println(s);
		// �رչ�����
		ois.close();
	}
}

class Student implements Serializable {
	private String name;
	private int age;
	private transient double score;
	
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score
				+ "]";
	}
	
	
}