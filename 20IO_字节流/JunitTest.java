package com.baizhi.corejava.day20;

import org.junit.Test;

public class JunitTest {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.m();
		mc.m1();
	}
	
	@Test
	public void testM(){
		System.out.println("Hello World");
	}
	
	@Test
	public void testM1(){
		
	}
}

