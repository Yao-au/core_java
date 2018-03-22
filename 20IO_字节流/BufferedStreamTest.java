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
		
		// 先创建节点流
		InputStream in = new FileInputStream("D:/FeiQ2013.exe");
		OutputStream out = new FileOutputStream("E:/FeiQ2013.exe");
		// 使用过滤流包装节点流
		BufferedInputStream bis = new BufferedInputStream(in);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		// 使用过滤流完成读写
		while(true){
			int value = bis.read();
			if(value == -1){
				break;
			}
			bos.write(value);
		}
		// 关闭过滤流
		bis.close();
		bos.close();
		
		
		//——————————————————————————————————————————————
		
		// 创建一个节点流
		OutputStream out = new FileOutputStream("E:/buffer.txt");
		// 使用过滤流包装节点流
		BufferedOutputStream bos = new BufferedOutputStream(out);
		// 使用过滤流完成读写
		bos.write('A');
		bos.flush();
		// 关闭过滤流

	}
}
