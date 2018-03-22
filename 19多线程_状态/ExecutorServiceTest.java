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
		
		// 创建一个线程池对象
		ExecutorService es = Executors.newFixedThreadPool(2);
		// 创建一个Callable类型的任务对象
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
		 * main线程继续执行相应的顺序流程
		 * 	过了很久很久 
		 * 	
		 */
		// f1.get(); 如果f1对象当前已经保存了结果，那么离开返回，
		// 如果f1还没有结果，main线程将在此处阻塞，直到得到自己想要的结果
		Integer i1 = f1.get();
		Integer i2 = f2.get();
		Integer i3 = f3.get();
		Integer i4 = f4.get();
		System.out.println(i1+i2+i3+i4);
		es.shutdown();// 关闭提交任务，当线程池中的任务执行完毕时，自动的关闭线程池
		
	}
}
