package com.baizhi.corejava.day19;

import java.util.HashSet;

public class MySynchronizedSetTest {
	public static void main(String[] args) {
		
	}
}

class MySynchronizedSet {
	private HashSet set = new HashSet();
	public synchronized boolean add(Object o){
		return set.add(o);
	}
	
	public synchronized boolean remove(Object o){
		return set.remove(o);
	}
}

