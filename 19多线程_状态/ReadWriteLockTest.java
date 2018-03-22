package com.baizhi.corejava.day19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {
	public static void main(String[] args) {
		// ����һ������
		final MyClass mc = new MyClass();
		// ����һ��ʵ��runnnable �ӿڵĶ��� targer���ڲ������ �ⲿ����ķ���
		Runnable target = new Runnable(){
			public void run(){
				mc.m(); // �����ڲ���ֻ�ܷ����ⲿfinal����
			}
		};
		
		// ���������߳� ����ͬһ���� 
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		Thread t3 = new Thread(target);
		// �����߳�
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
				// ʹ���߳�����5s ģ��һ������ִ�������Ҫ5s
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		readLock.unlock();
	}
}
