package com.baizhi.corejava.day21;

public class MySingleTest {
	public static void main(String[] args) {
		// ���ģ��
		// ģ��1 
		MySingle2 ms1 = MySingle2.newInstance();
		// ģ��2
		MySingle2 ms2 = MySingle2.newInstance();
		
		// ģ��3 
		MySingle2 ms3 = MySingle2.newInstance();
		
		System.out.println(ms1 == ms2);
		System.out.println(ms2 == ms3);
	}
}
// ����ʽ  ��һЩ�ռ��˷� ����Ч�ʸ� 
class MySingle1 {
	// ʹ�����������Ԥ�ȴ����õĸ����Ψһʵ������ʹ��ʱֱ�ӷ���ͬ1ʵ������֤���൥��
	// ms ����������ص�ʱ��ʵ����������صĹ���һ�����̰߳�ȫ�� 
	private static MySingle1 ms = new MySingle1();
	private MySingle1(){}
	
	public static MySingle1 newInstance(){
		return ms;
	}
	
}
// ����ʽ  ����ռ��˷�  ����Ч�ʵ�
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
	
	// �ⲿ�������ز��������ڲ��������أ�
	// ���ཫ���ڵ�1�ε���newInstance��ʽ��������أ���ͬ���Ĵ���msʵ��
	// �����ٵ���newInstance����ʱ��ֱ�ӷ���֮ǰ������Ψһʵ��
	private static class Inner{
		public static MySingle3 ms = new MySingle3();
	}
	
	// ��֤�ռ������ʣ����뱣֤����Ψһʵ���ڸ÷�������ʱ��ͬ���Ĵ�����
	// �������Ч�ʣ��������ܼ���
	public static MySingle3 newIntance(){
		
		return Inner.ms;
	}
}











