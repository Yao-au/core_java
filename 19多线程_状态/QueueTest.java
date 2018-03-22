package com.baizhi.corejava.day19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("wangxx");
		queue.offer("chuyb");
		queue.offer("wangzz");
		queue.offer("yangdd");
		queue.offer("wangpc");
		queue.offer("xushy");
		
		System.out.println(queue.size());
		
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
		System.out.println(queue.size());
	}
}	
