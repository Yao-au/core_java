package com.baizhi.corejava.day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import org.junit.Test;

public class StreamToReaderWriterTest {
	@Test
	public void testInputStreamReader() throws IOException{
		// ����һ���ֽڽڵ���
		InputStream in = new FileInputStream("E:/test.txt");
		// ʹ����ת������װ�ֽ��������趨����뷽ʽ
		Reader reader = new InputStreamReader(in,"UTF-8");
		// ʹ���ַ����з�������д�ַ�
		while(true){
			int value = reader.read();
			if(value == -1){
				break;
			}
			System.out.println((char)value);
		}
		// �ر��ַ���
		reader.close();
	}
	
	@Test
	public void testOutputStream() throws IOException{
		// �����ֽ���
		OutputStream out = new FileOutputStream("E:/test.txt");
		// ʹ����ת������װ�ֽ��������趨����뷽ʽ
		Writer writer = new OutputStreamWriter(out,"UTF-8");
		// ʹ���ַ����еķ���
		writer.write("�Ұ��й�");
		// �ر��ַ���
		writer.close();
	}
	
}
