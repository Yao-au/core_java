package com.baizhi.corejava.day20;
import java.io.*;
public class InputStreamTest {
	public static void main(String[] args) throws IOException {
		// ����������
		InputStream in = new FileInputStream("E:/test.txt");
		// ����������ķ���
		/*while(true){
			int value = in.read();
			if(value == -1){
				break;
			}
			System.out.println((char)value);
		}*/
		
		byte[] bs = new byte[6];
		while(true){
			int len = in.read(bs);
			if(len == -1){
				break;
			}
			System.out.println("���ζ�ȡ���ֽ�������"+len);
			for(int i = 0; i < len; i++){
				System.out.print((char)bs[i]+"\t");
			}
			System.out.println();
		
		}
		
		// �ر���
		in.close();
	}
}
