package com.baizhi.corejava.day21;

import java.io.UnsupportedEncodingException;

public class EncodingTest {
	public static void main(String[] args) throws Exception {
		// String --��byte[] ����
		String s = "�Ұ��й�";
		byte[] bs = s.getBytes("GBK");
		
		// byte[] --> String ����
		System.out.println(new String(bs,"Big5"));
	}
}
