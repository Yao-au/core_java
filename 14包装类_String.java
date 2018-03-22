package p14;
class Test1{
	public static void main(String[] args) {
		int i1= 10;
		//int 类型转换为Integer 类型
		Integer i2= new Integer(i1);
		//输出i2 对象
		System.out.println(i2);
		// Integer -> int
		int i3 = i2.intValue();
		//输出i3 自加后的数
		System.out.println(++i3);
		
		String str ="123";
		// String -->Integre 
		Integer ii= new Integer(str);
		System.out.println(ii);
		// Integer --> String
		String str2 = ii.toString();
		System.out.println(str2);
		
		int i =10;
		// int 转换成 String
		String str3 = String.valueOf(i);
		System.out.println(str3);	
		// String 转换成 int
		int iii = Integer.parseInt("123");
		System.out.println(++iii);
		
		//String 转换成 Integer 再转换成int
		Integer i7 = new Integer("789");
		int  i8 = i7.intValue();
		System.out.println(++i8);
		
	}
}
class Test2{
	public static void main(String[]args){
		byte b = 1;
	    Byte b1 = Byte.valueOf(b);
	    System.out.println(b1);
	    short s = 2;
	    Short s1 = Short.valueOf(s);
	    System.out.println(s1);	    
	    int i =4;
	    Integer i1 = Integer.valueOf(i);
	    System.out.println(i1);
	    long l =8;
	    Long l1 = Long.valueOf(l);
	    System.out.println(l1);
	    float f =4;
	    Float f1 = Float.valueOf(f);	   
	    System.out.println(f1);
	    double d =8.0;
	    Double d1 =Double.valueOf(d);
	    System.out.println(d1);
	    char c = 'a';
	    Character c1 = Character.valueOf(c);
	    System.out.println(c1);
	    boolean bo = true;
	    Boolean bo1 =Boolean.valueOf(bo);
	    System.out.println(bo1);
	}

}

class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//split 拆分字符串
        String s ="xiaohei/18/10000";	
        //split（） 将拆分的结果返回一个数组
		String[] ss = s.split("/");
		//循环遍历数组ss 输出 每一个元素
		for(int i = 0; i < ss.length; i++){
			System.out.println(ss[i]);
		}
		
		//查询'a'在字符串这首次出现的下标
		char ch ='g';
		
		String s1 =new String("abcedfg");
		System.out.println(s1.indexOf(ch));
		
		//不区分比较字符串"abc"和"ABC"内容是否相同
		String s3= "abc";
		String s4 ="ABC";
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//判断字符串"test.java'是否以'java"结尾 
		String s5 ="test.java";
		String s6 ="java";
		System.out.println(s5.endsWith(s6));
		//替换掉字符串"abc"中"a"为"A" 
		String s7 = "abc";
		System.out.println(s7.replace("a","A"));
		
		//将字符串"Abc"转换为大写  
		String s8 ="Abc";
		System.out.println(s8.toUpperCase());		
		//将字符串"Abc"转换为小写 
		System.out.println(s8.toLowerCase());			
		//返回忽略字符串" Hello World "前后空白后的字符串
		String s9 = "    Hello World   ";
        System.out.println(s9.trim());
		
	}
class Test4 {

	public static void main(String[] args) {
		// 获取邮箱"zhengcg@zparkhr.com"中的用户名"zhengcg"。
       String s = "zhengcg@zparkhr.com";
       //利用@分割开 用户名和域名
       String ss[] = s.split("@");
       //用户名为第一个元素
       System.out.println(ss[0]);
		
       //验证邮箱”zhengcg@zparkhr.com"是否是一个合法的邮箱格式  
		if(s.contains("@")&&s.contains(".")){

			if(s.indexOf('@')<s.indexOf('.')){
			
				System.out.println(s+"是一个合法的邮箱");
			}else{
				System.out.println(s+"不是一个合法的邮箱1");
			}
		}else{
			System.out.println(s+"不是一个合法的邮箱2");
		}
	
       
	}

}
class Test6 {
	public static void main(String[] args) {
		String uuid=java.util.UUID.randomUUID().toString();
		System.out.println(uuid);
		// 用""替换 -
		String u2 = uuid.replace("-", "");
		System.out.println(u2);
	}

}

class Test7{
	public static void main(String[] args) {
		String s = "“ABCDEFGhijklmn1234567";
		java.util.Random random = new java.util.Random();
		
	}
}

class Test8{
	public static void main(String[] args) {
		//统计出每个数字出现的次数。

		String s = "1239586838923173478943890234092";
		
		String[] n = {"0","1","2","3","4","5","6","7","8","9"};
		//设置一个数组来统计每个数字出现的字数
		int[] count =new int[10];
		//循环10次来统计每个数字 出现的字数
		for(int i=0;i<10;i++){		
			int index = -1;			
			while(true){
				index = s.indexOf(n[i],index+1);				
				if(index == -1){
					break;
                }				
				count[i]++;
			}			
		}
		//循环遍历 统计结果
		for(int i = 0;i<10;i++){
			System.out.println(n[i]+"出现"+count[i]+"次");
		}
	}	
}
class Test9{
public static void main(String[] args) {
		
		String s = "xushy-18-100";	
		//分隔
		String [] s1 = s.split("-");
		
		//类型转换 String -> int
		int a = Integer.parseInt(s1[1]);//s1[1]

		double d = Double.parseDouble(s1[2]);//s1[2]
		
		Student stu = new Student(s1[0],a,d);
		
		System.out.println(stu.getName()+"  "+stu.getAge()+" "+stu.getScore());
	}
}
class Student{
	private String name;
	private int age;
	private double score;
    public Student(String name,int age,double score){    
	    this.name = name;   
	    this.age = age;   
	    this.score = score;   	   
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	} 
    
}

class Test10{
	public static void main(String[]args){
		String a= "hello ";
		String b= "world ";
		String c= "java !";
		// 使用 StringBuilder 拼接 a,b,c
		
		StringBuilder ss= new StringBuilder();
		ss.append(a);
		ss.append(b);
		ss.append(c);
		System.out.println(ss);
		
		//并将StringBuilder对象转换为String对象
		 
		System.out.println(ss.toString());
	}
}	

    
}
