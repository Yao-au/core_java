package com.baizhi.corejava.day21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;

public class StudentTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		ObjectOutputStream oos = null;
			// �����ֽ���
		try{
			InputStream in = new FileInputStream("D:/student.txt");
			// ʹ����ת������װ�ֽ��������趨����뷽ʽ
			Reader reader = new InputStreamReader(in,"UTF-8");
			br = new BufferedReader(reader);
			// ʹ���ַ����еķ���
			String line = br.readLine();
			System.out.println(line);
			String[] ss = line.split("-");
			for(String s:ss){
				System.out.println(s);
			}
			
			// String --> ��������
			int id = Integer.parseInt(ss[0]);
			int age = Integer.parseInt(ss[2]);
			double score = Double.parseDouble(ss[3]);
			
			Student s = new Student(id,ss[1],age,score);
			
			OutputStream out = new FileOutputStream("D:/student.obj");
			oos = new ObjectOutputStream(out);
			oos.writeObject(s);
			
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			// �ر��ַ���
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(oos != null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class Student implements Serializable {
	private int id;
	private String name;
	private int age;
	private double score;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age, double score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", score=" + score + "]";
	}
	
	
}