package com.baizhi.corejava.day21;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileTest {
	
	@Test
	public void testFile(){
		File f = new File("D:/test.txt");
		File dir = new File("D:/");
		
		f = new File(dir,"test.txt");
		
	}
	
	@Test
	public void testExits(){
		File f = new File("D:/test.txt");
		boolean exists = f.exists();
		System.out.println(exists);
	}
	
	@Test
	public void testCreateNewFile() throws IOException{
		File f = new File("D:/test.txt");
		f.createNewFile();//新建一个文件 ，如果文件存在不做任何操作
	}
	
	@Test
	public void testMkdir() {
		File f = new File("D:/test/test2/");
		boolean mkdir = f.mkdirs();
		System.out.println(mkdir);
	}
	
	@Test
	public void testDelete(){
		File f = new File("D:/test");
		f.delete();
		
		
	}
	
	@Test
	public void testGetName(){
		File f = new File("./test.txt");
		
		System.out.println(f.getName());
		
	}
	
	@Test
	public void testGetParent(){
		File f = new File("./test.txt");
		System.out.println(f.getParent());
	}
	
	@Test
	public void testAbsolutePath() throws IOException{
		//. 代表当前目录   myeclipse中启动程序的目录为项目目录 
		File f = new File("./test.txt");
		f.createNewFile();
		String path = f.getAbsolutePath();
		System.out.println(path);
	}
	
	@Test
	public void testList(){
		File f = new File("D:/");
		File[] fs = f.listFiles();
		for(File f1:fs){
			System.out.println(f1+"-->"+f1.isDirectory()+"-->"+f1.isFile());
		}
		
	}
	
}
