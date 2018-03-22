package com.baizhi.corejava.day19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		final int[][] is = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{0,1,2}
		};
		
		// ����һ���̳߳ض���
		ExecutorService es = Executors.newFixedThreadPool(2);
		// ����һ��Callable���͵��������
		Callable<Integer> c1 = new Callable<Integer>(){
			public Integer call(){
				int sum = 0;
				for(int i = 0; i < is[0].length; i++){
					sum += is[0][i];
				}
				//System.out.println(sum);
				return sum;
			}
		};
		
		Callable<Integer> c2 = new Callable<Integer>(){
			public Integer call(){
				int sum = 0;
				for(int i = 0; i < is[1].length; i++){
					sum += is[1][i];
				}
				//System.out.println(sum);
				return sum;
			}
		};
		Callable<Integer> c3 = new Callable<Integer>(){
			public Integer call(){
				int sum = 0;
				for(int i = 0; i < is[2].length; i++){
					sum += is[2][i];
				}
				//System.out.println(sum);
				return sum;
			}
		};
		Callable<Integer> c4 = new Callable<Integer>(){
			public Integer call(){
				int sum = 0;
				for(int i = 0; i < is[3].length; i++){
					sum += is[3][i];
				}
				//System.out.println(sum);
				return sum;
			}
		};
		
		Future<Integer> f1 = es.submit(c1);
		Future<Integer> f2 = es.submit(c2);
		Future<Integer> f3 = es.submit(c3);
		Future<Integer> f4 = es.submit(c4);
		
		/*
		 * main�̼߳���ִ����Ӧ��˳������
		 * 	���˺ܾúܾ� 
		 * 	
		 */
		// f1.get(); ���f1����ǰ�Ѿ������˽������ô�뿪���أ�
		// ���f1��û�н����main�߳̽��ڴ˴�������ֱ���õ��Լ���Ҫ�Ľ��
		Integer i1 = f1.get();
		Integer i2 = f2.get();
		Integer i3 = f3.get();
		Integer i4 = f4.get();
		System.out.println(i1+i2+i3+i4);
		es.shutdown();// �ر��ύ���񣬵��̳߳��е�����ִ�����ʱ���Զ��Ĺر��̳߳�
		
	}
}
