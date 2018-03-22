package com.baizhi.corejava.day19;

public class WaitNotifyTest {
	public static void main(String[] args) {
		
		final Object lock = new Object();
		
		Thread t = new Thread(){
			public void run(){
				try {
					// 
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lock){
					for(int i = 0; i < 100; i++){
						
						System.out.println("$$$"+i);
					}
					lock.notifyAll();
				}
			}
		};
		t.start();
		
		synchronized(lock){
			for(int i = 0; i < 100; i++){
				if(i == 50){
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("###"+i);
			}
		}
	}
}
