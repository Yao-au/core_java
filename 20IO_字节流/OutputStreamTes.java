package com.baizhi.corejava.day20;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class OutputStreamTes {
	public static void main(String[] args) throws IOException {
		// ����������
		// ����ļ����������½�������ļ���Ŀ¼���������׳��쳣
		// ����ļ��Ѿ����ڣ�Ĭ���Ǹ���
		// �����Ҫ׷�ӣ�ʹ��2�������Ĺ��췽��,��append������λtrue
		OutputStream out = new FileOutputStream("E:\\test.txt");
		// ���÷���������ݵĴ���
		/*out.write('A');
		out.write(66);
		//out.write('��');
		out.write(67);
		out.write(68);
		*/
		//byte[] bs = new byte[] {65,66,67,68};
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// String --> byte[]
		byte[] bs = s.getBytes();
		out.write(bs, 0, bs.length);
		// �ر���
		out.close();
	}
}
