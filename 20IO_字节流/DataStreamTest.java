package com.baizhi.corejava.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class DataStreamTest {
	@Test
	public void testDataOutputStream() throws IOException{
		long L = 123456789L;
		// �����ڵ���
		OutputStream  out = new FileOutputStream("E:/test.dat");
		// ʹ�ù�������װ�ڵ���
		DataOutputStream dos = new DataOutputStream(out);
		
		// ʹ�ù������еķ�����ɶ�д
		// ��long���͵�ֵд�����ⲿ����Դ
		dos.writeLong(L);
		int i = 100;
		dos.writeInt(i);
		String s = "�Ұ����й�";
		dos.writeUTF(s);
		// �رչ�����
		dos.close();
	}
	
	@Test
	public void testDataInputStream() throws IOException{
		
		// �����ڵ���
		InputStream in = new FileInputStream("E:/test.dat");
		// ʹ�ù�������װ�ڵ���
		DataInputStream dis = new DataInputStream(in);
		// ʹ�ù������еķ�����ɶ�д
		long L = dis.readLong();
		System.out.println(L);
		int i = dis.readInt();
		System.out.println(i);
		String s = dis.readUTF();
		System.out.println(s);
		// �رչ�����
		dis.close();
		
	}
}
