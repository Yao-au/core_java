package com.baizhi.corejava.day20;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class OutputStreamTes {
	public static void main(String[] args) throws IOException {
		// 创建流对象
		// 如果文件不存在则新建，如果文件父目录不存在则抛出异常
		// 如果文件已经存在，默认是覆盖
		// 如果需要追加，使用2个参数的构造方法,将append参数置位true
		OutputStream out = new FileOutputStream("E:\\test.txt");
		// 调用方法完成数据的传递
		/*out.write('A');
		out.write(66);
		//out.write('中');
		out.write(67);
		out.write(68);
		*/
		//byte[] bs = new byte[] {65,66,67,68};
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// String --> byte[]
		byte[] bs = s.getBytes();
		out.write(bs, 0, bs.length);
		// 关闭流
		out.close();
	}
}
