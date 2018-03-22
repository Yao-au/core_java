package p9;
// 面向对象-封装继承
/**●封装/数据隐藏
  ●继承的基本语法
  ●访问修饰符
  ●对象创建过程
  ●super关键字
  ●方法覆 
*/
  
// 第一题  （继承、this 和super 关键字）
/*答案 Super()
       Sub()
       Super()
       Sub()
       Sub(int)
       Super(String)
       Sub(String) */
class Super{
    public Super(){ 
	   System.out.println("Super()"); 
	}  
	public Super(String str){ 
	   System.out.println("Super(String)");  
	} 
}
class Sub extends Super{   
	public Sub(){  
	    System.out.println("Sub()");  
	}   
	public Sub(int i){    
        this();    
        System.out.println("Sub(int)");   
	}   
	public Sub(String str){
		super(str);  
		System.out.println("Sub(String)");  
	}
} 
class TestSS{  
	public static void main(String args[]){  
		Sub s1 = new Sub();     
		Sub s2 = new Sub(10);   
		Sub s3 = new Sub("hello");   
	} 
}
// 第二题 （super） 查看程序运行输出结果

class Super1{
    public void m1(){
        System.out.println("m1() in Super" ); 
	}   
	public void m2(){  
	    System.out.println("m2() in Super" );  
	} 
} 
class Sub1 extends Super1{ 
	public void m1(){    
        System.out.println("m1() in Sub");  
	    super.m1();  
	} 
} 
class TestSS1{
	public static void main(String args[]){
		Sub1 s = new Sub1();  
		s.m1();   //输出 m1() in Sub  m1() in Super
		s.m2();   // 输出  m2() in Super
	}
}
//第三题 
/** 
类Animal? 属性：name? 
          方法：eat（）//打印输出”animal?eat()”? ????????
		        sleep()//打印输出”Animal?sleep()”? 
1、写出Animal类? 2、提供有参无参构造方法，并创建对象，调用eat和sleep方法

*/
class work03{
	public static void main(String []args){
		Animal a1 =new Animal();
		a1.name = "cat";
		Animal a2 =new Animal("dog");
		a1.eat();
		a2.sleep();
	}
}
class Animal{
	String name; //属性
	public Animal (){} //无参
	public Animal (String name){
		this.name = name;
	}
	public  void eat(){
		System.out.println("Animal eat()");
	}
	public  void sleep(){
		System.out.println("Animal sleep()");
	}
}
// 第四题
class work04{
	public static void main(String []args){
		Dog d1 =new Dog();		//创建Dog 对象
		d1.swim();
		d1.sleep();
	}
}
class Dog extends Animal {
	public Dog(){
		//私有属性name无法继承，只能通过调用父类的有参构造方法来 构造对象并给 私有属性赋值
		super("小小哈"); 
	}
	public  void sleep(){
		System.out.println(name+"Dog sleep");
	}
	public  void swim(){
		System.out.println(name+"Dog swim");
	}
	public  void run(){
		System.out.println("Dog run");
	}
	public  void shout(){
		System.out.println("Dog shout");
	}	
}
//第五题
class work05{
	public static void main(String []args){
		Cat c =new Cat();		//创建Dog 对象
		c.climb();
		c.sleep();
	}
}
class Cat extends Animal {
	public Cat(){
		//私有属性name无法继承，只能通过调用父类的有参构造方法来 构造对象并给 私有属性赋值
		super("小小咪"); 
	}
	public  void sleep(){
		System.out.println(name+"Cat sleep");
	}
	
	public  void climb(){
		System.out.println("Cat climb");
	}
	public  void shout(){
		System.out.println("Cat shout");
	}	
}
//第六题 (访问修饰符)

/*
	
	    System.out.println(mc1.value);// mc1.getValue()
	    System.out.println(mc2.value); //mc2.getValue()

    
*/

//第七题 （继承、访问修饰符）
// 答案 A.编译通过   非同包时，由default修饰的属性不可继承

//第八题 （继承、对象构造过程）
/*  答案 Meal()
       Lunch()
       Vegetable()
       Potato()
       Meat()
       Vegetable()
       Tomato()
       Sandwich()*/
class Meal{ 
   public Meal(){
	   System.out.println("Meal()");
	}
} 
class Lunch extends Meal{  
    public Lunch(){     
    System.out.println("Lunch()"); 
    } 
}
class Vegetable {
    public Vegetable(){
        System.out.println("Vegetable()"); 
	} 
} 
class Potato extends Vegetable{
    public Potato(){ 
	    System.out.println("Potato()"); 
	} 
} 
class Tomato extends Vegetable{ 
    public Tomato(){ 
        System.out.println("Tomato()"); 
    }
} 
class Meat{ 
   public Meat(){   
   System.out.println("Meat()");  
   } 
   } 
class Sandwich extends Lunch{   
    Potato p = new Potato();  
    Meat m = new Meat();  
    Tomato t = new Tomato(); 
    public Sandwich(){  
        System.out.println("Sandwich()"); 
    }
} 
class TestSandwich{   
    public static void main(String args[]){  
        Sandwich s = new Sandwich(); 
    }
}
//第九题

// 答案 Super类中添加有参构造方法

//第十题  （方法覆盖） 

//答案   A. public int method(){return 0 }  

//十一题  （方法覆盖）
//答案  B. void method(){}  D. private void method(){}

//12 题  出this和super的区别
/*
this是在同一个类中，成员变量与局部变量冲突时，局部变量优先，但是可以用 this作为前缀调用 成员变量
super 则是在不同类中，即在子类中，通过super前缀访问父类的属性或方法
*/
//第13题
class Instrument{
	public void play(){
		System.out.println("弹奏乐器");
	}
}
class Wind extends Instrument{
	public void play(){
		System.out.println("弹奏Wind");
	}
	public void playWind(){
		System.out.println("调用wind的play2方法");
	}
}
class Brass extends Instrument{
	public void play(){
		System.out.println("弹奏Brass");
	}
	public void playBrass(){
		System.out.println("调用Brass的play2方法");
	}
}

// 14 题
class work11{
	public static void main(String []args){
		Shape [] ss = new Shape [3]; 
		ss[0] = new Circle(4.0);
		ss[1] = new Rect(3.4,4.0);
		ss[2] = new Square(4.0);
		//遍历数组，调用每一个role对象的play方法
		for(int i =0; i< ss.length; i++){
			System.out.println(ss[i].area());
			System.out.println(ss[i].girth());
			
		}
	}
}
class Shape{
	public double area(){ return 0.0;};
	public double girth(){ return 0.0;}; 
}
class Circle extends Shape{
	private double radius;  // 半径	
	public void setRadius(double r){
		radius =r;
	}
	public double getRadius(){ return radius;}
	public Circle(){} // 无参
	public Circle(double r){  // 有参
		radius =r;
	}
	public double  area(){				
		return 3.14*radius;
	}
	public double girth(){		
		return 2*3.14*radius;
	}
}
class Rect extends Shape{
	private double length;  // 长
	private double width;   // 宽
	
	public Rect( ){} // 无参
	public Rect(double l,double w){ // 有参
		length =l;
		width =w;
	}

	public void setLength(double l){
		length =l;
	}
	public double getLength(){ return length;}
	public void setWidth(double w){
		width =w;
	}
	public double getWidth(){ return width;}
	
	public double  area(){		
		return length*width ;
	}
	public double girth(){		
		return 2*(length+width);
	}
}
class Square extends Shape{
	private double length; // 正方形边长
	public Square(){}
	public Square(double l){
		length = l;
	}
	public void setLength(double l){
		length =l;
	}
	public double getLength(){ return length;}
	// 求面积和周长的方法
	public double  area(){				
		return length*length;
	}
	public double girth(){		
		return 4*length;
	}
}


//15 题 （封装、继承、super）

class Employee{   //父类

	private String name;   //私有属性
	private int month;  // 封装
	
	public Employee(){}//无参构造方法
	public Employee(String n,int m ){ //有参构造方法
		name = n;
		month = m;
	}
	//获得或设置私有属性name month 的方法
	public void setName(String n){
		 name= n;
	}
	public void setMonth(int m){
		 month= m;
	}
	public String getName(){
		return name;
	}
	public int getMonth(){
		return month;
	}
	// 生日加薪的方法
	public double getSalary(int month){
		if(this.month == month){
			return 100.0;
		}
		return 0.0;  //返回值为 double类型 必须是0.0
	}
}
class SalariedEmployee extends Employee{ //固定底薪
	private double salary=4500; //私有
	
	public SalariedEmployee(){}  //无参
	public SalariedEmployee(String n,int m){ // 有参
	     super(n,m);
		
	}
	//set/get方法
	public void setSalary(double  s){
		 salary= s;
	}
	
	// 领工资的方法
	public double wage(int month){
		return salary+getSalary( month);
	}
}
class HourlyEmployee extends Employee{  //领时薪
	private double hourlySalary = 30;  //私有属性
	private int hour;
	//无参 有参 构造方法
	public HourlyEmployee(){}
	public HourlyEmployee(String n,int m){
		super(n,m);			
	}	
	//set/get方法
	public void setHourlySalary(double hs){
		 hourlySalary= hs;
	}
	public double getHourlySalary(){return hourlySalary;}	
	
	public void setHour(int h){
		 hour= h;
	}
	public int getHour(){return hour;}
	// 领工资的方法
	public double wage(int month){
		return (hour-160)*hourlySalary*1.5+160*hourlySalary+getSalary( month);
	}
	
	
}
class SalesEmployee extends Employee{  //销售 销售额*提成
	private double sales;
	private double rate = 0.2; //提成率
	//无参 有参 构造方法
	public SalesEmployee(){}
	public SalesEmployee(String n,int m){
		super(n,m);
		
	}
	//set/get方法
	public void setSales(double s){
		 sales= s;
	}
	public double getSales(){
		return sales;
	}
	public void setRate(double r){
		 rate= r;
	}
	public double getRate(){
		return rate;
	}
	// 领工资的方法
	public double wage(int month){
		return sales*rate+getSalary( month);
	}
}
class BasePlusSalesEmployee extends SalesEmployee  { //底薪
	private double baseSalary;
	//无参 有参 构造方法
	public BasePlusSalesEmployee(){}
	public BasePlusSalesEmployee(String n,int m){
		super(n,m);
		
	}
	//set/get方法
	public void setBaseSalary(double b){
		 baseSalary= b;
	}
	public double getBaseSalar(){
		return baseSalary;
	}
	// 领工资的方法
	public double wage(int month){
		return baseSalary+super.wage(month);
	}
}
class work15{
	public static void main(String []args){
		//领固定底薪的员
		SalariedEmployee e1 =new SalariedEmployee("小袁",9); 
		e1. setSalary(4500); //底薪
		System.out.println(e1.getName()+"  "+e1.wage(9));   //wage的参数为月份
		
		//领时薪的员工
		HourlyEmployee e2 =new HourlyEmployee("小易",8);
		e2.setHour(180); //工时
		System.out.println(e2.getName()+"  "+e2.wage(9));
		
		// 只有销售提成的员工
		SalesEmployee e3 =new SalesEmployee("小文",7);
		e3.setSales(30000); //销售额
		System.out.println(e3.getName()+"  "+e3.wage(9));
		
		//有底薪加提成的销售人员
		BasePlusSalesEmployee e4= new BasePlusSalesEmployee("小亢",6);
		e4.setBaseSalary(3000); //销售额
		System.out.println(e4.getName()+"  "+e4.wage(9));
		
	}
}


// 第十六题
/*
  Java是（单）继承的语言，适用关键字（extends）定义2个类间的继承关系，子类 和父类必须满足(is a)的关系
*/
// 第十七题
/*     答案 除了private 不可继承，其他三个修饰符都可继承 
使用范围   本类  同包   非同包子类   其他
private      yes
default      yes  yes 
protected    yes  yes    yes
public       yes  yes    yes         yes

*/

//19题
/*每个类都有相关数据的输出方法say，并完成対属性的封装。最后在一个测试类中对 设计的类进行测试。创建各自类的对象，并调用say方法 要求测试结果如下：
姓名：王军  年龄：23  学位：本科  专业：工业自动化
姓名：刘君   年龄：27  学位：硕士  研究方向：网络技术  */
class  Student{
	private String name;
	private int age;
	private String degree;	
	public Student(){}
	public Student( String name,int age,String degree){
		this.name = name;
		this.age = age;
		this. degree = degree ;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getDegree(){
		return degree;
	}
}
class  Undergraduate extends Student{
	private String specialty ;
	// 有参构造方法，且利用super调用父类的有参构造来给私有属性赋值
	public Undergraduate(String name,int age,String degree){
		super(name,age,degree);
	}
	//设置专业的方法
	public void setSpecialty(String specialty){
		this.specialty=specialty;
	}
	//获得专业的方法
	public String getSpecialty(){
		return specialty;
	}
	//说的方法
	public void say(){		
		System.out.println("姓名："+getName());
		System.out.println("年龄："+getAge());
		System.out.println("学位："+getDegree());
		System.out.println("专业："+specialty);	
	}
}
class  Graduate extends Student{
	private String studyDrection ;
	// 有参构造方法，且利用super调用父类的有参构造来给私有属性赋值
	public Graduate(String name,int age,String degree){
		super(name,age,degree); 
	}
	//设置研究方向的方法
	public void setStudyDrection(String studyDrection){
		this.studyDrection=studyDrection;
	}
	//获得研究方向的方法
	public String getStudyDrection(){
		return studyDrection;
	}
	//说的方法
	public void say(){		
		System.out.println("姓名："+getName());
		System.out.println("年龄："+getAge());
		System.out.println("学位："+getDegree());
		System.out.println("专业："+studyDrection);	
	}  
}
class Test{
	public static void main(String []args){
		
		//嵌套 调用父类的构造方法给父类的 私有属性 直接赋值		
		Undergraduate u = new Undergraduate("王军",23,"本科");
		Graduate g = new Graduate("刘君",27,"硕士"); 
		
		// 利用set 方法给 子类的 私有属性赋值
		u.setSpecialty("工业自动化");
		g.setStudyDrection("网络技术");
		// 调用 say 方法
	    u.say();
		g.say();
	}
}







