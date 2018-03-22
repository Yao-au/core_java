package com.baizhi.corejava.day17;

import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class TreeSetTest {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(5);
		set.add(4);
		set.add(2);
		set.add(3);
		set.add(1);
		
		for(Integer i:set){
			System.out.println(i);
		}
		
		Set<Student> set = new TreeSet<>();
		Student s1 = new Student("xiaohei",18);
		Student s2 = new Student("xiaobai",20);
		Student s3 = new Student("xiaohua",22);
		Student s4 = new Student("xiaohua",22);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(set.size());
		for(Student s:set){
			System.out.println(s);
		}
	}
}
class SetTest {
	public static void main(String[] args) {
		//�������϶���
		Set<String> set = new LinkedHashSet<>();
		
		// ���
		String s1 = new String("wangxx");
		String s2 = new String("chuyb");
		String s3 = new String("wangzz");
		String s4 = new String("wangpc");
		String s5 = new String("xushy");
		String s6 = new String("xushy");
		
		// set��û�����±���ص���ӷ���
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
		// ��ȡԪ�ص���Ч���� 
		System.out.println(set.size());
		//���������Ƴ�����
		set.remove("chuyb");
		//�ж�ĳһ��Ԫ���Ƿ񱻰���
		System.out.println(set.contains("chuyb"));
		System.out.println(set.size());
		
		//Set��û�����±���صķ�����ֻ��for-each����
		for(String s:set){
			System.out.println(s);
		}
		
	}
}

class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	// compareTo�����ṩ�ȽϹ��� s1.compareTo(s2) 
	// >0 s1 ���� s2 ����
	// <0 s1����s2ǰ��
	// =0 s1 �� s2������ͬ
	public int compareTo(Student s){
		if(this.name.equals(s.name) && this.age == s.age){
			return 0;
		}else if(this.age < s.age){
			return -1;
		}else{
			return 1;
		}
		
	}
	
}
class HashCodeTest {
	public static void main(String[] args) {
		Set<Teacher> set = new HashSet<>();
		
		Teacher t1 = new Teacher("wangxx",16);
		Teacher t2 = new Teacher("chuyb",38);
		Teacher t3 = new Teacher("xushy",18);
		Teacher t4 = new Teacher("chuyb",38);
		
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		
		System.out.println(set.size());
		for(Teacher t:set){
			System.out.println(t);
		}		
	}
}

class Teacher{
	private String name;
	private int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	// ���뱣֤������ͬ������ֵ��ͬ���Ķ�����뷵����ͬ�Ĺ�ϣ��
	// ���Ч�ʣ��������ݲ�ͬ�Ķ���ȽϵĴ��������ݲ�ͬ�Ķ��󷵻ز�ͬ�Ĺ�ϣ�룬�����ܵõ���ͬ���±�
	public int hashCode(){
		// ��ϣ����Դ�ڵ�ǰ���������ֵ
		return age + name.hashCode();
	}	
	public boolean equals(Object o){
		System.out.println("=======equals======");
		if(this == o)return true;
		if(o == null)return false;
		if(this.getClass()!= o.getClass())return false;
		Teacher t = (Teacher)o;
		if(t.name.equals(this.name) && this.age == t.age){
			return true;
		}
		return false;
	}	
}

class MapTest {
	public static void main(String[] args) {
		// ����һ��Map���϶���
		Map<String,String> map = new HashMap<>();
		
		// ���
		map.put("wangxx", "HTML");
		map.put("chuyb", "CoreJava");
		map.put("xushy", "CoreJava");
		map.put("zhengg", "JavaWEB");
		map.put("wangpc", "FrameWork");
		map.put("wangcx", "FrameWork");
		map.put("yangdd", "FrameWork");
		System.out.println(map.size());
		// ��ȡ 
		String value = map.get("chuyb");
		System.out.println("chuyb����"+value);
		// �޸�
		map.put("chuyb", "HTML");
		System.out.println(map.size());
		System.out.println("chuyb����"+map.get("chuyb"));
		// ɾ��
		map.remove("yangdd");
		// �ж�map���Ƿ����ָ����key
		System.out.println(map.containsKey("yangdd"));
		// �ж�map���Ƿ����ָ����value
		System.out.println(map.containsValue("FrameWork"));
		
	}
}

class BianLiTest {
	public static void main(String[] args) {
		// ����һ��Map���϶���
		Map<String,String> map = new HashMap<>();
		
		// ���
		map.put("wangxx", "HTML");
		map.put("chuyb", "CoreJava");
		map.put("xushy", "CoreJava");
		map.put("zhengg", "JavaWEB");
		map.put("wangpc", "FrameWork");
		map.put("wangcx", "FrameWork");
		map.put("yangdd", "FrameWork");
		
		// 1.�������� ��map�����е�key���һ��Set����
		Set<String> set = map.keySet();
		for(String key:set){
			String value = map.get(key);
			System.out.println(key+"--->"+value);
		}
		//2.ֵ��������map�����е�ֵ���һ��Collection����
		Collection<String> vc = map.values();
		for(String value:vc){
			System.out.println(value);
		}
		// 3.��ֵ�Ա��� ��map�еļ�ֵ�Է�װ��һ����ֵ�Զ���
		// ����һ���ɼ�ֵ�Զ�����ɵ�Set����
		Set<Map.Entry<String,String>> set = map.entrySet();
		// ����set���õ���ÿһ��Ԫ�ض�����key��value������
		for(Map.Entry<String,String> e:set){
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key+"--->"+value);
	}
}
/**
11.��Map����ԭ�����籭Map?�Ļ����ϣ��������¹��ܣ�? ����һ֧��ӵ����֣��������Ӷ�ڵ�����б�? ���磺
     I.?���롰��������Ӧ�����1958��1962��1970��1994��2002? II.?���롰��������Ӧ�������û�л�ù����籭����
*/
class Test11 {
	public static void main(String[] args) {
		//����һ��Map�������� ���-��ڹ����� �ļ�ֵ�Թ�ϵ
		Map<String,String> map = new HashMap<>();
		
		map.put("1992", "�ھ���");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		// �����ж� map���Ƿ����ָ���Ĺ�����
		if(map.containsValue(name)){
			//����map����ͨ����ֵ���е�ֵ����ƥ�䣬��ӡ��Ӧ�ļ�
			Set<Map.Entry<String,String>> set = map.entrySet();
			
			for(Map.Entry<String, String> e:set){
				String year = e.getKey();
				String name2 = e.getValue();
				
				if(name.equals(name2)){
					System.out.println(year);
				}
			}
			
		}else{
			System.out.println("û�л�ù����籭");
		}
	}
}
/**
12.��ҵ��(Map)?����һ���ַ���,��������ַ�������Щ�ַ����,ÿ���ַ����ּ���?
*/
class Test12 {
	public static void main(String[] args) {
		String s = "lkadjfl;sdfjsl;efjklsdjfl;";
		
		Map<Character,Integer> map = new HashMap<>();
		//�����ַ��� ��
		for(int i = 0; i <s.length(); i++){
			char c = s.charAt(i);
			
			// ����ַ�c�ǵ�1�γ���  �� map.put(c,1);
			//������ǵ�1�γ��֣� map.put(c,ԭ���Ĵ���+1):
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		Set<Character> set = map.keySet();
		for(Character c:set){
			System.out.println(c+"---"+map.get(c));
		}
	}
}
