package com.baizhi.corejava.day21;

import java.io.*;

import org.junit.Test;

public class BufferedReaderPrintWriterTest {
	@Test
	public void testPrintWriter() {
		PrintWriter pw = null;
		try{
			OutputStream out = new FileOutputStream("E:/test.txt");
			Writer writer = new OutputStreamWriter(out,"UTF-8");
			pw = new PrintWriter(writer);
			
			pw.println("��ǰ���¹�");
			pw.println("���ǵ���˪");
			pw.println("��ͷ������");
			pw.println("��ͷ˼����");
			
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(pw != null){
				pw.close();
			}
		}
	}
	
	@Test
	public void testBufferedReader()  {
		BufferedReader br = null;
		try{
			InputStream in = new FileInputStream("E:/test.txt");
			Reader reader = new InputStreamReader(in,"UTF-8");
			 br = new BufferedReader(reader);
			
			while(true){
				String line = br.readLine();
				if(line == null){
					break;
				}
				System.out.println(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(br != null){
				
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
