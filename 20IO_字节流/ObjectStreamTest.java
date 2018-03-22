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
		
		// 将对象s序列化到外部数据源
		// 创建节点流
		OutputStream out = new FileOutputStream("E:/student.obj");
		// 使用过滤流包装节点流
		ObjectOutputStream oos = new ObjectOutputStream(out);
		// 使用过滤流中的方法
		oos.writeObject(s);
		// 关闭过滤流
		oos.close();
	}
	
	@Test
	public void testObjectInputStream() throws IOException, ClassNotFoundException{
		//创建节点流
		InputStream in = new FileInputStream("E:/student.obj");
		//使用过滤流包装节点流
		ObjectInputStream ois = new ObjectInputStream(in);
		// 使用过滤流中的方法
		Object o = ois.readObject();
		Student s = (Student)o;
		System.out.println(s);
		// 关闭过滤流
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