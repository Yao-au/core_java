package p10;
/** 
●?多态的基本语法和使用
●?instanceof
●?多态用在参数和返回值上
*/



//第1题
/*使用多态的三个关键点： 
1.子类对象可以看作父类对象，但子类对象实际类型不发生改变
2.父类引用仅可以调用自身类定义的成员，不可调用子类独有的成员
3.实际运行过程中，优先调用子类重写后的方法，如没有重写，则调用父类方法
*/

//第2题
/* s引用可以调 m2()方法；
   m1() 为 fu'lei
   将s强转为Sub()类型的引用，即可以调用m3()方法
*/
//第3题   答案见注释 强转
class Super{ 
   public void method(){ 
       System.out.println("method() in Super");  
    } 
   public void method(int i){   
        System.out.println("method(int) in Super");  
    }
} 
class Sub extends Super{  
    public void method(){   
        System.out.println("method() in Sub");  
    }   
	public void method(String str){ 
        System.out.println("method(String) in Sub");   
    } 
} 
class TestSS1{ 
   public static void main(String args[]){   
        Super s = new Sub(); 
		Sub s1 = (Sub)s; // 将s强转为 Sub，即可调用子类的 method(String str)
        s1.method(10);  
        s1.method();     
		//父类在引用子类对象时，不可调用子类独有的方法
        s1.method("hello");  
    } 
}
//第4题
class Super2{
        public void m(){
        System.out.println("m() in Super"); 
	}
}
class Sub2 extends Super2{
		public void m(){  
		System.out.println("m() in Sub");  
	}
} 
class TestSS2{
    public static void foo(Super2 s){ //父类形参
        s.m();
	} 
	public static void main(String args[]){
        Sub2 sub = new Sub2();
        Super2 sup = new Super2();
		//super类型的引用 super类型的对象，直接调用父类的m方法
        foo(sup);    //打印 m() in Super
		//super类型的引用 Sub类型的对象，优先调用子类重写的m方法
		foo(sub);  //打印  m() in Sub
	} 
}
/** 
第6题   如何判断一个引用指向的对象是某一类型的对象？
if( 引用对象 instanof 判断类型) //类型匹配则获得boolean的 true
*/
//第7题
class AnimalTest{
    public static void main(String[] args){
		Animal1 a = new Dog1();
		System.out.println(getAnimal(a));
		Cat1 c = new Cat1();
		m(c);
    }    
	
	//写一个函数可以接受任意Animal类型及其子类类型的对象
    public static void m(Animal1 a){  
	  System.out.println("is a animal");
	}
	
    //写一个函数可以返回任意Animal类型及其子类类型的对象 
	public static Animal1 getAnimal(Animal1 a){
		if (a==new Dog1()){
			return new Dog1();
		}else{
			return  new Cat1();
		} 
    } 
}
class Animal1{}
class Dog1 extends Animal1{}
class Cat1 extends Animal1{}
//第8题
class A{
    public void ma(){}
	}
class B extends A{
    public void mb(){}
}
class C extends B{
    public void mc(){} 
}
class D extends B{
    public void md(){}
}
class PolymorphicTest{ 
    public static void main(String[] args){ 
         A a = new C(); 
        //a 可以调用哪些方法
        a.ma(); /*仅可以调用A类自身定义的成员*/
        //想让a指向的对象可以调用 mb方法，应该怎么做
        B b =(B) a;  /* a 类型强转为 B*/
		b.mb();
        //判断a指向的对象是否是D类型的对象，是打印"是"，否则打印"不是"  
		if(a instanceof D){
			System.out.println("是");
		}
	} 
}

// 第9题
class Animal{
    private String name;  
	public Animal(){}
	public Animal(String name){
		this.name =name;
	}
	public void setName(String name){
		this.name =name;
	}
	public String getName(){ return name;}
		
}
class Dog extends Animal{ 
   public Dog(){}
	public Dog(String name){
		super(name);
	}
}
class Cat extends Animal{
	public Cat(){}
    public Cat(String name){
		super(name);
	}
}
class TestAnimal{
    public static void main(String args[]){
        Animal[] as = new Animal[]{
            new Dog("Pluto"),    
			new Cat("Tom"),   
			new Dog("Snoopy"), 
			new Cat("Garfield")    
		};   
		Dog[] dogs = getAllDog(as);     
		for(int i = 0; i<dogs.length; i++){
            System.out.println(dogs[i].getName()); 
		}  
	}   
//从一个Animal 数组中挑选出所有的Dog对象，并把这些对象放在一个Dog 数组中返回
	public static Dog[] getAllDog(Animal[] as){
        int count = 0;
	    // 1 遍历数组获取Dog 对象的数量
	    for(int i = 0; i < as.length; i++){
		    if(as[i] instanceof Dog){
			     count++;
		    }
	    }
	    Dog [] ds = new Dog[count];
	    // 2 遍历Animal[] 并对元素进行判断
	    //挑出Dog 类型对象，保存到Dog[]
	    int index = 0;
	    for(int i =0;i<as.length ;i++){
		    if(as[i] instanceof Dog){
			    // 将父类强转为 子类类型引用，并赋值
		        ds[index]=(Dog)as[i];
		         //index 自增，以记录下一个Dog对象存放的下标
		        index++;
		    }		
	    }
		return ds;
	} 
}
// 第10 题  （继承多态）
class work10{
	public static void main(String []args){
		Role [] rs = new Role [3]; 
		rs[0] = new Dancer();
		rs[1] = new Singer();
		rs[2] = new Musician();
		//遍历数组，调用每一个role对象的play方法
		for(int i =0; i< rs.length; i++){
			rs[i].play();
		}
	}
}
class Role{
	public void play(){
		System.out.println("Role play()”");
	}
}
class Dancer extends Role{
	public void play(){
		System.out.println("Dancer play()”");
	}
}
class Singer extends Role{
	public void play(){
		System.out.println("Singer play()”");
	}
}
class Musician extends Role{
	public void play(){
		System.out.println("Musician play()”");
	}
}
// 第11 题
class work11{
	public static void main(String []args){
		Shape [] ss = new Shape [3]; 
		ss[0] = new Circle(4.0);  //有参构造
		ss[1] = new Rect(3.4,4.0);
		ss[2] = new Square(4.0);
		//遍历数组，调用每一个Shape对象的area和grith方法方法
		for(int i =0; i< ss.length; i++){
			System.out.println( "area  " +ss[i].area() ); 
			System.out.println( "girth "+ss[i].girth() );
			
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
	public double  area(){		//多态时 覆盖父类的area方法		
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

/** 
（封装、继承、super、多态）某公司的雇员分为以下若干类：
Employee：这是所有员工总的父类，属性：员工的姓名,员工的生日月份。方法：? getSalary(intmonth)?根据参数月份来确定工资，如果该月员工过生日，则公司? 会额外奖励100?元。? SalariedEmployee：Employee?的子类，拿固定工资的员工。属性：月薪? HourlyEmployee：?Employee?的子类，?按小时拿工资的员工，?每月工作超出160 小时的部分按照1.5?倍工资发放。属性：每小时的工资、每月工作的小时数
SalesEmployee：Employee?的子类，销售人员，工资由月销售额和提成率决定。? 属性：月销售额、提成率BasePlusSalesEmployee：SalesEmployee?的子类，有固 定底薪的销售人员，工资由底薪加上销售提成部分。属性：底薪。? 根?据?要?求?创?建?SalariedEmployee?、?HourlyEmployees?、SaleEmployee?和 BasePlusSalesEmployee四个类的对象各一个，并计算某个月这四个对象的工资。 注意：要求把每个类都做成完全封装，不允许非私有化属性
--在昨天题目的基础上，创建一个Employee?数组，分别创建若干不同? 的Employee对象，并打印某个月的工资。--
*/
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
			return 100;
		}
		return 0;  //返回值为 double类型 必须是0.0
	}
}
class SalariedEmployee extends Employee{ //固定薪水
	private double salary; //私有
	
	public SalariedEmployee(){}  //无参
	public SalariedEmployee(String n,int m ,double s){ // 有参
	     super(n,m);
		 salary = s;
	}
	//set/get方法
	public void setSalary(double  s){
		 salary= s;
	}	
	// 领工资的方法
	public double getSalary(int month){
		return salary+super.getSalary( month);
	}
}
class HourlyEmployee extends Employee{  //领时薪
	private double hourlySalary = 30;  //私有属性
	private int hour;
	//无参 有参 构造方法
	public HourlyEmployee(){}
	public HourlyEmployee(String n,int m,int h){
		super(n,m);	
		hour=h;
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
	public double getSalary(int month){
		return (hour-160)*hourlySalary*1.5+160*hourlySalary+super.getSalary( month);
	}
}
class SalesEmployee extends Employee{  //销售 销售额*提成
	private double sales;
	private double rate = 0.2; //提成率
	//无参 有参 构造方法
	public SalesEmployee(){}
	public SalesEmployee(String n,int m,double s){
		super(n,m);
		sales = s;
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
	public double  getSalary(int month){
		return sales*rate+super.getSalary( month);
	}
}
class BasePlusSalesEmployee extends SalesEmployee  { //底薪
	private double baseSalary;
	//无参 有参 构造方法
	public BasePlusSalesEmployee(){}
	public BasePlusSalesEmployee(String n,int m,double s,double b){
		super(n,m,s);
		baseSalary = b;
	}
	//set/get方法
	public void setBaseSalary(double b){
		baseSalary= b;
	}
	public double getBaseSalar(){
		return baseSalary;
	}
	// 领工资的方法
	public double getSalary(int month){
		return baseSalary+super.getSalary(month);
	}
}
class work12{
	public static void main(String []args){		
		Employee [] es = new Employee []{
		 new SalariedEmployee("小袁",9,4500),//固定薪水	
		 new HourlyEmployee("小易",8,180),   //工时
		 new SalesEmployee("小文",7,30000), // 销售额
		 new BasePlusSalesEmployee("小亢",6,30000,3000)		// 销售额 底薪
		};			
		//遍历数组，调用每一个employee对象的wage方法
		for(int i =0; i< es.length; i++){
			System.out.println(es[i].getName()+"  "+es[i].getSalary(9));   //月份
		}
		
		
		/*	
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
		e4.setSales(30000);
		System.out.println(e4.getName()+"  "+e4.wage(9));
     */
	}
}





























