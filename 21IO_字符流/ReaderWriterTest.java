package com.baizhi.corejava.day21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.junit.Test;

public class ReaderWriterTest {
	@Test
	public void testWriter() throws IOException{
		Writer writer = new FileWriter("E:/test.txt");
		
		writer.write('��');
		writer.write(new char[]{'��','��'});
		writer.write("���찲��");
		
		writer.close();
	}
	
	@Test
	public void testReader() throws IOException {
		Reader reader = new FileReader("E:/test.txt");
		/*while(true){
			int value = reader.read();
			if(value == -1){
				break;
			}
			System.out.println((char)value);
		}*/
		
		char[] cs = new char[4];
		
		while(true){
			int len = reader.read(cs);
			if(len == -1){
				break;
			}
			System.out.println("���ζ�ȡ�ַ�������"+len);
			for(int i = 0; i < len; i++){
				System.out.println((char)cs[i]);
			}
		}
		reader.close();
	}
}
