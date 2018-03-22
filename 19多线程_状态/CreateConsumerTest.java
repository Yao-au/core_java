package com.baizhi.corejava.day19;

public class CreateConsumerTest {
	public static void main(String[] args) {
		final MySynchronizedStack mss = new MySynchronizedStack();
		Thread[] pushs = new Thread[10];
		Thread[] pops = new Thread[10];
		
		for(int i = 0; i < pushs.length; i++){
			pushs[i] = new Thread(){
				public void run(){
					while(true){
						for(char c = 'A'; c <= 'Z'; c++){
							mss.push(c);
						}
					}
				}
			};
		}
		
		for(int i = 0; i < pops.length; i++){
			pops[i] = new Thread(){
				public void run(){
					while(true){
						mss.pop();
						mss.print();
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

class MySynchronizedStack{
	private Object[] os = new Object[10];
	private int count ;
	
	public void push(Object o){
		synchronized(this){
			while(os.length == count){
				try {
					this.wait(); //入栈线程在缓冲区数据不足时，主动释放持有的互斥所标记，进入到锁对象的等待队列里 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			os[count] = o;
			count++;
			
			this.notifyAll();//用来唤醒因数据不足进入等待状态的消费者
		}
	}
	
	public Object pop(){
		synchronized(this){
			while(count == 0){
				try {
					this.wait();// 缓冲区数据不足，消费者进入锁对象的等待队列
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			Object o = os[count-1];
			count--;
			
			this.notifyAll();//用来唤醒因空间不足，进入等待状态的生产者
			return o;
		}
	}
	
	public synchronized void print(){
		for(int i = 0; i < count; i++){
			System.out.print(os[i]+"\t");
		}
		System.out.println();
	}
}