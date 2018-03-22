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
		
		//���������ߺ��������߳�
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
					this.wait(); //��ջ�߳��ڻ��������ݲ���ʱ�������ͷų��еĻ�������ǣ����뵽������ĵȴ������� 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			os[count] = o;
			count++;
			
			this.notifyAll();//�������������ݲ������ȴ�״̬��������
		}
	}
	
	public Object pop(){
		synchronized(this){
			while(count == 0){
				try {
					this.wait();// ���������ݲ��㣬�����߽���������ĵȴ�����
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			Object o = os[count-1];
			count--;
			
			this.notifyAll();//����������ռ䲻�㣬����ȴ�״̬��������
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