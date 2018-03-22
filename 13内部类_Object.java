package p13;
/**
●?Object?类
●?finalize?方法
●?toString?方法
●?equals?方法
●?getClass?方法
●?内部类的基本概念
*/
class work1 {
	/*在Object类中，定义的finalize方法在（垃圾回收）时调用，
	toString()方法返回值表示（返回对象的字符串表现形式），
	equals 方法的作用为（判断两个对象的内容是否相等），
	getClass方法作用为（返回对象的实际类型）。*/

}
class work2{
	/* == 是比较变量的值或者对象的地址，而equals是比较对象的内容*/
}

//work3
class Student{
    private int age;
    private String name;
    public Student(){}
    public Student(String name,int age) {
	    this.age = age;
	    this.name = name;
    } 
    public String toString(){
    	return name+" "+age;
    }	
}
class TestStudent{
	public static void main(String[] args){
		Student s1 =new Student();
		Student s2 =new Student("tom",18);
		System.out.println(s1);  //打印null 0
		System.out.println(s2);  // 打印 tom 18
	}
}
// work4
class TestEquals{ 
    public static void main(String args[]){   
     	String str1 = new String("Hello");   
		String str2 = new String("Hello");  
		System.out.println(str1.equals(str2));  //打印 true
		System.out.println(str1 == str2); // 打印false
	} 
}
// work 5
class Animal{}
class Dog extends Animal{}
class TestGetClass{ 
    public static void main(String args[]){ 
        Animal a1 = new Dog();  
	    Animal a2 = new Animal();  
	    System.out.println(a1 instanceof Animal);   //打印true
	    System.out.println(a1.getClass() == a2.getClass());  //打印false
	}
}

//work6
//Java中的内部类包括 A 成员***B静态*** C局部*** D匿名***

//work7 增加equals 和 toString方法
class Worker{
	int id;
	String name;
	int age;
	double salary;
	
	public Worker(){}
	public Worker(int id,String name,int age,double salary){
		this.id =id ;
		this.name = name;
		this.age = age;
		this.salary =salary ;
	}
	public void work(){
		System.out.println(name+"工作8小时");
	
	}
	public void work(int hour){
		System.out.println(name+"工作"+hour+"小时");	
	}
	public String toString() {
		return "Worker's name=" + name + ", id=" + id + ",age="+age+",salary="+salary;
	}
	
	public boolean equals(Object o){
		//判断自我反省
		if(this == o){return true;}
		// 2判断o非null
		if(o == null){return false;}
		// 3类型判断
		if(this.getClass() != o.getClass()){
			return false;
		}
		// 4类型强转
		Worker t = (Worker)o;
		// 5逐一比较属性内容是否相同 
		// 注意：属性为基本类型使用==判断 属性为对象类型使用equals判断
		if(this.id == t.id && t.name.equals(this.name)&&this.age == t.age&&this.salary == t.salary){
			return true;
		}
		return false;
	}
}
class Test7{
	public static void main(String[]args){
		Worker w1 = new Worker(20,"yyh",20,8000);
		Worker w2 = new Worker(20,"ycy",20,7000);
		System.out.println(w1);
		System.out.println(w1.equals(w2));
	}
}



//work 8 toString 字符串加法
//添加 
class Student1{ 
    private int age;  
    private String name;  
	public Student1(){}  
	public Student1(String name, int age){ 
	    this.name = name;   
	    this.age = age;  
	}   
	public String toString(){  
    	return name + " " + age;  
	} 
} 
class TestS1{   
    public static void main(String args[]){  
        Student1 stu1 = new Student1("tom", 18);   
		System.out.println(stu1+" "+100); 
		System.out.println(stu1+" "+100); 
		System.out.println(" "+stu1+100); 
	}
}
 //work 9 局部内部类
// 答案 AB D
/* class OuterClass{ 
    private int value1 = 100;  
    private static int value2 = 200; 
    public void method(int value3){
	   
        final int value4 = 400;  
		class InnerClass{     
		    public void print(){  
		       System.out.println(value4);
			   System.out.println(value1);
			   System.out.println(value2); 
           
		    }     
		}
    } 
	
}
 */
interface Light{   
     void shine(); 
} 
 //定义Lamp 类： 
class Lamp{   
    public void on(Light light){     
        light.shine(); 
    } 
} 
//写一个类TestLamp，部分代码如下：
class TestLamp{  
    public static void main(String args[]){  
        Lamp lamp = new Lamp();   
        //1处使用局部内部类技术，调用lamp的on方法要求输出shine in red  
		
		class RedLight implements Light{
			public void shine(){
				System.out.println("shine in red");
			}
		}
		lamp.on(new RedLight());
		 
		  //2处使用匿名内部类技术，调用lamp的on方法要求输出shine in yellow
		lamp.on(new Light(){
	        public void shine(){
			    System.out.println("shine in yellow");
		    }
        });
       
    }
}














