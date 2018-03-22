package com.baizhi.corejava.day20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class PrintWriterTest {
	@Test
	public void testFlush() throws IOException {
		PrintWriter pw = new PrintWriter(new FileOutputStream("E:/pw.txt"),true);
		pw.print(true);
	}
}
