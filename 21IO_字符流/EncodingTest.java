package com.baizhi.corejava.day21;

import java.io.UnsupportedEncodingException;

public class EncodingTest {
	public static void main(String[] args) throws Exception {
		// String --〉byte[] 编码
		String s = "我爱中国";
		byte[] bs = s.getBytes("GBK");
		
		// byte[] --> String 解码
		System.out.println(new String(bs,"Big5"));
	}
}
