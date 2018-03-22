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
		
		writer.write('我');
		writer.write(new char[]{'爱','北'});
		writer.write("京天安门");
		
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
			System.out.println("本次读取字符个数："+len);
			for(int i = 0; i < len; i++){
				System.out.println((char)cs[i]);
			}
		}
		reader.close();
	}
}
