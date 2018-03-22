package com.baizhi.corejava.day19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {
	public static void main(String[] args) {
		// 创建一个对象
		final MyClass mc = new MyClass();
		// 创建一个实现runnnable 接口的对象 targer，内部类调用 外部对象的方法
		Runnable target = new Runnable(){
			public void run(){
				mc.m(); // 匿名内部类只能访问外部final属性
			}
		};
		
		// 创建三个线程 访问同一对象 
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		Thread t3 = new Thread(target);
		// 开启线程
		t1.start();
		t2.start();
		t3.start();
		
	}
}

class MyClass {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private Lock readLock = lock.readLock();
	private Lock writeLock = lock.writeLock();
	public void m(){
		readLock.lock();
		{
			try {
				// 使得线程休眠5s 模拟一个方法执行完毕需要5s
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		readLock.unlock();
	}
}
