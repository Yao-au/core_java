package p1;
//类和对象的概念
//实例变量
//方法重载
//构造方法
//所有自定义方法都不允许写static。要使用对象调用。

class work01{
	public static void main(String [] args){
		Person p1 = new Person();
		Person p2 = new Person("袁磊",22,'男');
		p1.name ="姚瑶";
		p1.age= 21;
		p1.sex='女';
		p1.say();
		p1.fit("易达爷");
		p2.say();
		p2.fit("小煞笔");
	}
}
class Person{
	String name;
	int age;
	char sex;
	public Person(){};
	public Person(String name,int age,char sex){
		this.name = name;
		this.age =age;
		this.sex =sex;
	};
	public void say(){
		System.out.println(name+ "年龄"+age+ "性别"+sex);
	}
	public void fit(String n){
		name = n;
		System.out.println( name);
	}
}
class work02{
	public static void main(String[] args){
		Student s1 = new Student(17070202,"yyh",22,'女',99);
		Student s2 =new Student();
		s2.id =17010101;
		s2.name = "谷冉";
		s2.age = 25;
		s2.sex='男';
		s2.score =100;
		s1.study();
		s2.study();
		s1.study(12);
		s2.study(15);
	}
	
}
class Student{
	int id;
	String  name;
	int age;
	char sex;
	int score;
	public Student(){} //无参构造
	public Student(int id,String name,int age,char sex,int score ){
		this.id =id;
		this.name = name;
		this.age = age;
		this .sex=sex;
		this.score =score;
	}
	public void study(){
		System.out.println(name+"学习了8小时");
	}
	public void study(int hours){
		System.out.println(name+"学习了"+hours+"小时");
	}
}
class work03{
	public static void main(String[] args){
		Teacher t1 = new Teacher(17070202,"傻逼老师","傻逼课程");
		Teacher t2 = new Teacher();
		t2.id = 17070804;
		t2.name="二货老师";
		t2.course="二货课程";
		t1.teach();
		t2.teach();
	}
}
class Teacher{
	int id;
	String  name;
	String course;
	public Teacher(){} //无参构造
	public Teacher(int id,String name,String course ){
		this.id =id;
		this.name = name;
		this.course = course;
	}
	public void teach(){
		System.out.println(name+"教"+course);
	}
}
class work04{
	public static void main(String[] args){
		Animal a1 =new Animal();
		Animal a2 =new Animal("长颈鹿","叶子");
		a1.name="狮子";
		a1.food="肉";
		a1.eat();
		a2.eat();
	}
}
class Animal{
	String  name;
	String food;
	public Animal(){} //无参构造
	public Animal(String name,String food ){	
		this.name = name;	
		this.food  = food;
	}
	public void eat(){
		System.out.println(name+"吃"+food);
	}
}
class work05{
	public static void main(String[] args){
		Dog a1 =new Dog();
		Dog a2 =new Dog("京巴狗",5,"棕色");
		a1.name = "哈士奇";
		a1.age =7;
		a1.color="黑白色";
		a1.sleep();
		a2.swim();
		
	}
}
class Dog{
	String  name;
	int age;
	String color;
	
	public Dog(){} //无参构造
	public Dog(String name,int age,String color ){	
		this.name = name;	
		this.age = age;
		this.color = color;
	}
	public void sleep(){
		System.out.println(name+"sleep");
	}
	public void swim(){
		System.out.println(name+"swim");
	}
	public void run(){
		System.out.println(name+"run");
	}
	public void shout(){
		System.out.println(name+"shout");
	}
}
class work06{
	public static void main(String[] args){
		Cat a1 =new Cat();
		Cat a2 =new Cat("折耳猫",5,"蓝色");
		a1.name = "中华田园猫";
		a1.age =7;
		a1.color="黄白色";
		a1.sleep();
		a2.climb();
		
	}
}
class Cat{
	String  name;
	int age;
	String color;
	
	public Cat(){} //无参构造
	public Cat(String name,int age,String color ){	
		this.name = name;	
		this.age = age;
		this.color = color;
	}
	public void sleep(){
		System.out.println(name+"sleep");
	}
	public void climb(){
		System.out.println(name+"climb");
	}
	public void shout(){
		System.out.println(name+"shout");
	}
}
// 07 答案选择 c 输出10 20
class ClassA{    
    public void method(int value){
	   System.out.println(value);    
	}    
	public void method(){  
	   System.out.println(value);  
	}   
	int value; 
} 
class TestClassA{  
	public static void main(String args[]){ 
	   ClassA classA = new ClassA();  
	   classA.value = 10;  
	   classA.method();       // 打印 10
	   classA.method(20);     // 打印 20
	} 
}
//方法重载+函数返回值
// 08 不能通过， 因为method(int i)的返回值类型是int，必需返回一个数
class ClassB{    
    void method(){   
        System.out.println("method()");   
	}  
	void method(int i){       //把int 改成 void
	    System.out.println("method(int)"); 
		
	}   
	public static void main(String args[]){    
	    ClassA a = new ClassA();
	    a.method();    
	    a.method(10); 
	} 
}
class work09{
	public static void main(String[] args){
	  System.out.println(" A每个类中都有至少一个构造方法 ");	
	  System.out.println(" B一个类中可以有多个构造方法?  ");	
	  System.out.println(" D构造方法可以有多个参数");	
	}
}
class work10{
	public static void main(String[] args){
		System.out.println(" 出构造方法的特点： ");	
	    System.out.println(" 构造方法名称要与类名完全相同 ");	
	    System.out.println(" 没有返回值类型  ");	
	    System.out.println(" 创建对象时，触发构造方法的调用，不可通过手动调用，在对象构造过程中自动调用一次");
	}
}
class work11{
	public static void main(String[] args){
		System.out.println(" 方法重载是什么，以及方法重载的要求：");	
		System.out.println(" 方法重载是方法名称相同，参数列表不同（类型、个数、顺序）的方法");	
	    System.out.println(" 要求：方法名称相同，参数列表不同（类型、个数、顺序） ");	
	   
	}
}
//12 题(构造函数)
class MyClass{  
    int value;
	public MyClass(){}
	public MyClass(int n){
		value = n;
	}
}  
class TestMyClass{  
 // 增加有参构造函数后 输出结果 为 0 10
    public static void main(String args[]){ 
        MyClass mc1 = new MyClass();  
        MyClass mc2 = new MyClass(10);  //错误，无该有参构造方法
        System.out.println(mc1.value); 
        System.out.println(mc2.value);
    } 
}
// 13 题（面向对象基础）根据注释，把下面代码补充完整
//定义一个Dog 类 
class Dog2{    
     //定义一个name 属性，该属性为String 类型 
	String name;
	 //定义一个age 属性，该属性为int 类型
	int age;    
	 //定义一个sexual 属性，该属性为boolean 类型    
	 //true 表示为公，false 表示为母   
	 boolean sex;
	
	 public Dog2(){}    
	 public Dog2(String _name, int _age, boolean _sexual){ 
	 //分别根据参数，设置Dog 类的属性
	 name =_name;
	 age =_age;
	 sex =_sexual;
    }    
	public void play(){ 
	    System.out.println(name + " play "); 
	}    
	public void play(int n){ 
	   System.out.println(name +" play " + n + " minutes"); 
	}
} 
class TestDog{
    public static void main(String args[]){
        
        //创建一个Dog 对象，利用带参数的构造函数
        //名字为joy，年龄为2 岁，性别为母
        Dog2 d = new Dog2("joy",2,false)  ;       
		//调用Dog 对象无参的play 方法。
        d.play();;        
		//调用Dog 对象有参的play 方法，参数为30
        d.play(30);
	}
}

//14 题（对象创建过程）
// 答案   C.输出?ClassA()?ClassC()?ClassB()? 
class ClassA1{    
    public ClassA1(){        
        System.out.println("ClassA1()");  
    } 
} 
class ClassB1{ 
    public ClassB1(){   
        System.out.println("ClassB1()");   
    }
} 
class ClassC1{  
    ClassA1 a = new ClassA1();  
    ClassB1 b;   
    public ClassC1(){ 
        System.out.println("ClassC1()");   
        b = new ClassB1();   
    } 
 }
class TestConstructor{   
    public static void main(String args[]){ 
        ClassC1 cc = new ClassC1();
    }
}
 
//15题（面向对象基础）写一个Worker类，并创建多个Worker对象。
class work15{
	
	public static void main(String[] args){
		Worker w1 = new Worker(121,"张三",18,3500);
		Worker w2 = new Worker(122,"李四",28,3300);
		Worker w3 = new Worker(123,"王五",38,3900);
		Worker w4 = new Worker(124,"孙六",29,3700);
		w1.work();
		w2.work();
		w3.work(12);
		w4.work(10);
	}
}
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
}
// 16 题（面向对象基础）创建一个Address类，描述如下：
class Address{
	String address;
	String zipCode;
	public Address(){}
	public Address(String ad,String zip){
		address= ad;
		zipCode= zip;
	}
}


// 17 题
 class WorkerArrayTest{  

    public static void main(String[] args){                
        //1、创建一个元素为Worker类型的数组长度为3
		Worker [] work = new Worker [3];
		
		//2、创建3个Worker对象 并保存到数组中
		work[0]=new Worker( 121,"张三",18,3500);
        work[1]=new Worker( 122,"李四",28,3300);
	    work[2]=new Worker( 123,"王五",38,3900);
	    
	    //3、遍历数组，并调用每一个Worker对象的无参work方法
        for(int i = 0; i< work.length;i++){
			work[i].work();
		}
	    //4、调用oldWorker函数
		System.out.println(oldWorker(work).name);
    }
	
    // 写一个函数 oldWorker 遍历数组返回其中年纪最大的Worker对象
	// 形参为Worker[]类型  返回值为Worker类型   
	public static Worker oldWorker(Worker[] w){
		int max = 0;
		int i ;
		for( i = 0; i< w.length-1;i++){
			if (w[i].age>max){
				max = w[i].age;
			}
		}
		return w[i];
	}
		
}

// 18 题  定义一个Company类，该类中有一个Worker[]类型属性，保存多个Worker对象

 class T18 {
	public static void main(String[] args) {
		
	}
}
class Company{
	
	Worker[] ws = new Worker[16]; 
	
	int count = 0;//记录ws中有效的元素个数
	
    //完成添加Worker方法   
	public void addWorker(Worker w){     
	    // 如果ws已满，扩容
	    if(ws.length==count){
		    System.out.println("需要扩容");
	    }else{//添加w
		    for(int i=0;i<ws.length;i++){
			    if(ws[i]==null){
				   ws[i]=w;
			    }
		    }
	    }	
        //将count递增1    
	}
    //完成方法 返回每月公司需要支付的薪资  
	public double getAllSalaries(){
        //遍历数组，并计算总额   
		int sum = 0;
	    for(int i=0;i<ws.length;i++){
		   sum+=ws[i].salary;
	    }
	    return sum;
    }
	
    //完成方法 判断一个给定的Worker对象是否属于当前公司（通过id判断） 
	public boolean contains(Worker w){
		
        //遍历数组进行判断
	    for(int i=0;i<ws.length;i++){
		   if(ws[i].id==w.id){
			   return true;
		    }
	    }
	    return false;
    } 
}

class work19{
	public static void main(String[] args){
		System.out.println(" 局部变量和实例变量的区别");
		/*
		局部变量：定义在函数内部；无默认值；作用范围从定义行到包含其的代码块结束；不允许重名；
		实例变量：定义在类的内部，函数外部；有默认值；作用范围本类有效；可与局部变量重名，局部变量优先
		*/

	}
}
class work20{
	public static void main(String[] args){
		System.out.println(" 对象创建的过程");	
		/*
		1. 分配空间 
		创建一个对象，在内存中为一个对象分配一块数据区域
		在分配空间的同时，会把对象所有的属性设为默认值
		2. 初始化属性 在定义实例变量的同时，为实例变量进行了赋值。则赋值语句在这一步骤执行
        3. 调用构造方法 
		对该对象调用构造方法
		*/
	}
}