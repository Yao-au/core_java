package com.baizhi.corejava.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest {
	public static void main(String[] args) throws IOException {
		//文件复制
		// 在JVM和源文件之间建立一个输入流
		InputStream in = new FileInputStream("D:/FeiQ2013.exe");
		// 在JVM和目标文件之间建立一个输出流
		OutputStream out = new FileOutputStream("E:/FeiQ2013.exe");
		// 将通过输入流 读取的数据 使用输出流 输出到目标文件中
		
		byte[] bs = new byte[1024];
		while(true){
			int len = in.read(bs);
			if(len == -1){break;}
			out.write(bs,0,len);
		}
		
		/*while(true){
			int value = in.read();
			if(value == -1){break;}
			out.write(value);
		}*/
		
		in.close();
		out.close();
	}
}
