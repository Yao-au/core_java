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
		// 创建节点流
		OutputStream  out = new FileOutputStream("E:/test.dat");
		// 使用过滤流包装节点流
		DataOutputStream dos = new DataOutputStream(out);
		
		// 使用过滤流中的方法完成读写
		// 将long类型的值写出到外部数据源
		dos.writeLong(L);
		int i = 100;
		dos.writeInt(i);
		String s = "我爱你中国";
		dos.writeUTF(s);
		// 关闭过滤流
		dos.close();
	}
	
	@Test
	public void testDataInputStream() throws IOException{
		
		// 创建节点流
		InputStream in = new FileInputStream("E:/test.dat");
		// 使用过滤流包装节点流
		DataInputStream dis = new DataInputStream(in);
		// 使用过滤流中的方法完成读写
		long L = dis.readLong();
		System.out.println(L);
		int i = dis.readInt();
		System.out.println(i);
		String s = dis.readUTF();
		System.out.println(s);
		// 关闭过滤流
		dis.close();
		
	}
}
