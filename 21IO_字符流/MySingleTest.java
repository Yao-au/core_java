package com.baizhi.corejava.day21;

public class MySingleTest {
	public static void main(String[] args) {
		// 多个模块
		// 模块1 
		MySingle2 ms1 = MySingle2.newInstance();
		// 模块2
		MySingle2 ms2 = MySingle2.newInstance();
		
		// 模块3 
		MySingle2 ms3 = MySingle2.newInstance();
		
		System.out.println(ms1 == ms2);
		System.out.println(ms2 == ms3);
	}
}
// 饿汉式  有一些空间浪费 运行效率高 
class MySingle1 {
	// 使用类变量保存预先创建好的该类的唯一实例，当使用时直接返回同1实例，保证该类单例
	// ms 属性在类加载的时候实例化，类加载的过程一定是线程安全的 
	private static MySingle1 ms = new MySingle1();
	private MySingle1(){}
	
	public static MySingle1 newInstance(){
		return ms;
	}
	
}
// 懒汉式  避免空间浪费  运行效率低
class MySingle2 {
	private static MySingle2 ms = null;
	private MySingle2(){}
	
	public static synchronized MySingle2 newInstance(){
		if(ms == null){
			ms = new MySingle2();
		}
		return ms;
	}
}


class MySingle3{
	
	private MySingle3(){}
	
	// 外部类的类加载不会引发内部类的类加载，
	// 该类将会在第1次调用newInstance方式引发类加载，并同步的创建ms实例
	// 后续再调用newInstance方法时，直接返回之前创建的唯一实例
	private static class Inner{
		public static MySingle3 ms = new MySingle3();
	}
	
	// 保证空间利用率：必须保证该类唯一实例在该方法调用时，同步的创建。
	// 提高运行效率：方法不能加锁
	public static MySingle3 newIntance(){
		
		return Inner.ms;
	}
}











