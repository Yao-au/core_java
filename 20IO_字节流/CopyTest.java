package com.baizhi.corejava.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest {
	public static void main(String[] args) throws IOException {
		//�ļ�����
		// ��JVM��Դ�ļ�֮�佨��һ��������
		InputStream in = new FileInputStream("D:/FeiQ2013.exe");
		// ��JVM��Ŀ���ļ�֮�佨��һ�������
		OutputStream out = new FileOutputStream("E:/FeiQ2013.exe");
		// ��ͨ�������� ��ȡ������ ʹ������� �����Ŀ���ļ���
		
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
