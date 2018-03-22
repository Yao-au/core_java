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
		// 创建一个字节节点流
		InputStream in = new FileInputStream("E:/test.txt");
		// 使用桥转换流包装字节流，并设定编解码方式
		Reader reader = new InputStreamReader(in,"UTF-8");
		// 使用字符流中方法，读写字符
		while(true){
			int value = reader.read();
			if(value == -1){
				break;
			}
			System.out.println((char)value);
		}
		// 关闭字符流
		reader.close();
	}
	
	@Test
	public void testOutputStream() throws IOException{
		// 创建字节流
		OutputStream out = new FileOutputStream("E:/test.txt");
		// 使用桥转换流包装字节流，并设定编解码方式
		Writer writer = new OutputStreamWriter(out,"UTF-8");
		// 使用字符流中的方法
		writer.write("我爱中国");
		// 关闭字符流
		writer.close();
	}
	
}
