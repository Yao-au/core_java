package com.baizhi.corejava.day18;
/**
ʵ�ֶ��̵߳����ַ���
*/
class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		t1.start();		
		Runnable target = new Target();
		Thread t2 = new Thread(target);
		t2.start();		
	}
}
// �̳�Thread ����дrun����
class MyThread extends Thread{
	// �޷���ֵ ���β� �������쳣��3�޷���
	public void run(){
		for(int i = 1;i <= 100; i++){
			System.out.println("$$$"+i);
		}
	}
}
// ��Ŀ�����Ѿ��̳�����һ�������£�����ʵ��Runnable ��ʵ��run������
class Target implements Runnable{
	public void run(){
		for(int i = 1;i <= 100; i++){
			System.out.println("###"+i);
		}
	}
}
/**
join������
*/
class JoinTest {
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread t = new Thread(){
			public void run(){
				for(int i = 1; i <= 100; i++){
					System.out.println("$$$"+i);
				}
			}
		};
		
		t.start();
		
		for(int i = 1; i <= 100; i++){
			if(i == 40){
				t.join();// ��t�̲߳��뵽ָ��ǰ������߳�֮ǰ��ɣ���ǰ�̵߳ȴ�t�߳���ɺ�ż���ִ��
			}
			System.out.println("###"+i);
		}
		
	}
}
/**
sleep�������߳���ķ��������Ըı��̵߳�״̬�����ͷ�����
*/
class SleepTest {
	public static void main(String[] args) {
		Thread t = new Thread(){
			public void run(){
				for(int i = 1; i <= 100; i++){
					if(i == 50){
						//���ø÷������̣߳�˯��5000ms
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("$$$"+i);
				}
			}
		};
		for(int i = 1; i <= 100; i++){								
					System.out.println("###"+i);
		t.start();	
		while(true){
			System.out.println(t.getState());
		}
	}
}

/**
�̵߳�ͬ������ ������������
*/

class MyStackTest {
	public static void main(String[] args) {
		final MyStack ms = new MyStack();
		/*ms.pop();
		ms.push('D');
		ms.print();*/
		
		Thread push = new Thread(){
			public void run(){
				
				ms.push('D');
			}
		};		
		Thread pop = new Thread(){
			public void run(){
				System.out.println("pop:"+ms.pop());
			}
		};		
		push.start();
		pop.start();
		
		try {
			// main Thread sleep 2s wait push and pop execute 
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ms.print();
	}
}
class MyStack{
	private Object[] os = new Object[]{'A','B','C',' ',' '};
	private int count = 3;
	// create a lock Object
	//private Object lock = new Object();
	
	public synchronized void push(Object o){
		
		//synchronized(this){
			os[count] = o;
			System.out.println("push:"+o);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		//}
	}	
	public Object pop(){
		synchronized (this) {
			Object result = os[count-1];
			os[count-1] = ' ';
			count--;
			return result;
		}
		
	}	
	public void print(){
		for(int i = 0; i < os.length; i++){
			System.out.print(os[i]+"\t");
		}
		System.out.println();
	}
}