package com.baizhi.corejava.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamTest {
	public static void main(String[] args) throws IOException {
		
		// �ȴ����ڵ���
		InputStream in = new FileInputStream("D:/FeiQ2013.exe");
		OutputStream out = new FileOutputStream("E:/FeiQ2013.exe");
		// ʹ�ù�������װ�ڵ���
		BufferedInputStream bis = new BufferedInputStream(in);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		// ʹ�ù�������ɶ�д
		while(true){
			int value = bis.read();
			if(value == -1){
				break;
			}
			bos.write(value);
		}
		// �رչ�����
		bis.close();
		bos.close();
		
		
		//��������������������������������������������������������������������������������������������
		
		// ����һ���ڵ���
		OutputStream out = new FileOutputStream("E:/buffer.txt");
		// ʹ�ù�������װ�ڵ���
		BufferedOutputStream bos = new BufferedOutputStream(out);
		// ʹ�ù�������ɶ�д
		bos.write('A');
		bos.flush();
		// �رչ�����

	}
}
