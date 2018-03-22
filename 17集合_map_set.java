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
		//创建集合对象
		Set<String> set = new LinkedHashSet<>();
		
		// 添加
		String s1 = new String("wangxx");
		String s2 = new String("chuyb");
		String s3 = new String("wangzz");
		String s4 = new String("wangpc");
		String s5 = new String("xushy");
		String s6 = new String("xushy");
		
		// set中没有与下标相关的添加方法
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
		// 获取元素的有效个数 
		System.out.println(set.size());
		//根据内容移除对象
		set.remove("chuyb");
		//判断某一个元素是否被包含
		System.out.println(set.contains("chuyb"));
		System.out.println(set.size());
		
		//Set中没有与下标相关的方法，只能for-each遍历
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

	// compareTo方法提供比较规则 s1.compareTo(s2) 
	// >0 s1 排在 s2 后面
	// <0 s1排在s2前面
	// =0 s1 和 s2内容相同
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
	// 必须保证内容相同（属性值相同）的对象必须返回相同的哈希码
	// 提高效率：减少内容不同的对象比较的次数：内容不同的对象返回不同的哈希码，尽可能得到不同的下标
	public int hashCode(){
		// 哈希码来源于当前对象的属性值
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
		// 创建一个Map集合对象
		Map<String,String> map = new HashMap<>();
		
		// 添加
		map.put("wangxx", "HTML");
		map.put("chuyb", "CoreJava");
		map.put("xushy", "CoreJava");
		map.put("zhengg", "JavaWEB");
		map.put("wangpc", "FrameWork");
		map.put("wangcx", "FrameWork");
		map.put("yangdd", "FrameWork");
		System.out.println(map.size());
		// 获取 
		String value = map.get("chuyb");
		System.out.println("chuyb教授"+value);
		// 修改
		map.put("chuyb", "HTML");
		System.out.println(map.size());
		System.out.println("chuyb教授"+map.get("chuyb"));
		// 删除
		map.remove("yangdd");
		// 判断map中是否包含指定的key
		System.out.println(map.containsKey("yangdd"));
		// 判断map中是否包含指定的value
		System.out.println(map.containsValue("FrameWork"));
		
	}
}

class BianLiTest {
	public static void main(String[] args) {
		// 创建一个Map集合对象
		Map<String,String> map = new HashMap<>();
		
		// 添加
		map.put("wangxx", "HTML");
		map.put("chuyb", "CoreJava");
		map.put("xushy", "CoreJava");
		map.put("zhengg", "JavaWEB");
		map.put("wangpc", "FrameWork");
		map.put("wangcx", "FrameWork");
		map.put("yangdd", "FrameWork");
		
		// 1.键遍历： 将map中所有的key组成一个Set集合
		Set<String> set = map.keySet();
		for(String key:set){
			String value = map.get(key);
			System.out.println(key+"--->"+value);
		}
		//2.值遍历：将map中所有的值组成一个Collection集合
		Collection<String> vc = map.values();
		for(String value:vc){
			System.out.println(value);
		}
		// 3.键值对遍历 将map中的键值对封装成一个键值对对象，
		// 返回一个由键值对对象组成的Set集合
		Set<Map.Entry<String,String>> set = map.entrySet();
		// 遍历set，得到的每一个元素都包含key和value两部分
		for(Map.Entry<String,String> e:set){
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key+"--->"+value);
	}
}
/**
11.（Map）在原有世界杯Map?的基础上，增加如下功能：? 读入一支球队的名字，输出该球队夺冠的年份列表。? 例如：
     I.?读入“巴西”，应当输出1958、1962、1970、1994、2002? II.?读入“荷兰”，应当输出”没有获得过世界杯”。
*/
class Test11 {
	public static void main(String[] args) {
		//创建一个Map用来保存 年份-夺冠国家名 的键值对关系
		Map<String,String> map = new HashMap<>();
		
		map.put("1992", "冠军名");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		// 首先判断 map中是否包含指定的国家名
		if(map.containsValue(name)){
			//遍历map，并通过键值对中的值进行匹配，打印对应的键
			Set<Map.Entry<String,String>> set = map.entrySet();
			
			for(Map.Entry<String, String> e:set){
				String year = e.getKey();
				String name2 = e.getValue();
				
				if(name.equals(name2)){
					System.out.println(year);
				}
			}
			
		}else{
			System.out.println("没有获得过世界杯");
		}
	}
}
/**
12.作业题(Map)?给定一个字符串,请输出该字符串由哪些字符组成,每个字符出现几次?
*/
class Test12 {
	public static void main(String[] args) {
		String s = "lkadjfl;sdfjsl;efjklsdjfl;";
		
		Map<Character,Integer> map = new HashMap<>();
		//遍历字符串 ，
		for(int i = 0; i <s.length(); i++){
			char c = s.charAt(i);
			
			// 如果字符c是第1次出现  ， map.put(c,1);
			//如果不是第1次出现， map.put(c,原来的次数+1):
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
