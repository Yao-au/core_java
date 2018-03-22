package com.baizhi.corejava.day19;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	public static void main(String[] args) {
		final BlockingQueue<Character> mss = new ArrayBlockingQueue<>(10);
		Thread[] pushs = new Thread[10];
		Thread[] pops = new Thread[10];
		
		for(int i = 0; i < pushs.length; i++){
			pushs[i] = new Thread(){
				public void run(){
					while(true){
						for(char c = 'A'; c <= 'Z'; c++){
							try {
								mss.put(c);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			};
		}
		
		for(int i = 0; i < pops.length; i++){
			pops[i] = new Thread(){
				public void run(){
					while(true){
						try {
							mss.take();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(mss);
					}
				}
			};
		}
		
		//开启生产者和消费者线程
		for(Thread t:pushs){
			t.start();
		}
		for(Thread t:pops){
			t.start();
		}
	}
}
