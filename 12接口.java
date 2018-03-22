package p1;

//work 1

interface IA1{
	void m1(); //公开抽象方法
	int a = 100; //公开静态常量
}
class MyClass implements IA1{ 
    public void m1(){}
} 
class TestInterface{ 
    public static void main(String args[]){ 
	    //创建Myclass 对象的 IA接口类型的ia 引用
	    IA1 ia = new MyClass();   
		ia.m1();    
		System.out.println(IA1.a); //打印100
	} 
}
//work 2
interface IA2{
	void m1(); 
    void m2();
} 
abstract class MyClassA implements IA2{ 
    public void m1(){} 
} 
class MyClassB extends MyClassA{
	public void m2() {} 
	
}
//work3
interface IA{ 
    void ma(); 
} 
interface IB extends IA{
	void mb(); 
} 
interface IC{  
    void mc();
} 
interface ID extends IB, IC{  
    void md(); 
} 
// i
class ClassE implements ID{
	public void ma(){}
	public void mb(){}
	public void mc(){}
	public void md(){}
}
//ii
class TestClassE{
	public static void main(String args[]){
		IC ic = new ClassE(); 
		ClassE ie = (ClassE)ic;
        //调用ma 方法       
		ie.ma();      
		//调用mb 方法    
		ie.mb();  
		//调用mc 方法    
		ie.mc();    
		//调用md 方法    
		ie.md();   
	} 
}
//iii  答案 true true true true true
class TestClassE3{
	public static void main(String args[]){  
	IC ic = new ClassE();  
	System.out.println(ic instanceof IA);  
	System.out.println(ic instanceof IB); 
	System.out.println(ic instanceof IC);   
	System.out.println(ic instanceof ID);
	System.out.println(ic instanceof ClassE);  
} 
}
//work4 
interface IA4{  
    void ma();
}
interface IB4{  
    void mb(); 
} 
class MySuper implements IA4{   
    public void ma(){} 
} 
class MySub extends MySuper implements IB4{ 
    public void mb(){} 
}
class TestMain5{   
    public static void main(String args[]){  
	    MySuper ms = new MySub();  
	    System.out.println(ms instanceof IA4); //打印 true
        System.out.println(ms instanceof IB4);  //打印 true
	    System.out.println(ms instanceof MySuper);   //打印 true    
		System.out.println(ms instanceof MySub); //打印 true
    } 
}
// work5
/* A．抽象类可以有构造方法，接口没有构造方法 
C．抽象类可以有非抽象方法，接口中都是抽象方法
D．抽象类和接口都不能创建对象
E．一个类最多可以继承一个抽象类，但是可以实现多个接口
 */

//work6
/*答案
Red Light shine in Green
Yellow Light shine in Green
Green Light shine in Green */
interface Light{   //接口
    void shine();  //公开抽象方法，无实现体
} 
class RedLight implements Light{   
	public void shine(){ //实现接口的shine方法
		System.out.println("Red Light shine in Red");  
	}
}
class YellowLight implements Light{   
    public void shine(){  //实现接口的shine方法
		System.out.println("Yellow Light shine in Yellow"); 
	} 
} 
class GreenLight implements Light{ 
    public void shine(){ //实现接口的shine方法
	    System.out.println("Green Light shine in Green");   
	} 
} 
class Lamp{     //台灯类
    private Light light;  //私有属性灯
    public void setLight(Light light){    
        this.light = light;   
	}  
	public void on(){    
	    light.shine();     
	} 
} 
class TestLamp{
	public static void main(String args[]){ 
	    //定义一个灯的数组ls
	    Light[] ls = new Light[3];  
		//初始化数组元素，创建彩灯对象
	    ls[0] = new RedLight();  
	    ls[1] = new YellowLight();   
	    ls[2] = new GreenLight();   
		//创建台灯对象
	    Lamp lamp = new Lamp();    
		// 遍历彩灯ls数组，给台灯一一接上不同颜色的灯，并调用on方法
	    for (int i = 0; i<ls.length; i++){   
  	        lamp.setLight(ls[i]);    
		    lamp.on();  
		}     
	} 
} 
// work7
interface JavaTeacher{  //接口 
    void teach(); 
	}
class TeacherA implements JavaTeacher{  //TA实现接口JT
        public void teach(){     //TA 实现teach方法
	    	System.out.println("TeacherA teach Java");  
		} 
	} 
class TeacherB implements JavaTeacher{ //TB实现接口JT
    public void teach(){  //TB 实现teach方法
	    System.out.println("TeacherB teach Java"); 
    } 
} 
class School{   
    //获得老师的方法，返回值类型为JavaTeacher
    public static JavaTeacher getTeacher(int i){ 
        if (i == 0) return new TeacherA();   
		else return new TeacherB();   
	}
} 
class TestSchool{     
    public static void main(String args[]){ 
     	JavaTeacher jt = School.getTeacher(0);  
		jt.teach();   //打印TeacherA teach Java
		jt = School.getTeacher(10); 
        jt.teach();    //打印TeacherB teach Java
	}
} 
// work8
abstract class Animal{  
    public abstract void eat(); 
} 
interface Pet{   
    void play();
} 
class Dog extends Animal implements Pet{  
    public void eat(){ 
        System.out.println("Dog eat Bones");   
	}    
	public void play(){   
	    System.out.println("Play with Dog");    
	} 
} 
class Cat extends Animal implements Pet{  
    public void eat(){  
	    System.out.println("Cat eat fish");    
	}    
	public void play(){    
     	System.out.println("Play with Cat");  
	}
} 
class Wolf extends Animal{ 
    public void eat(){    
        System.out.println("Wolf eat meat");   
	}
}
class TestMain8{   
    public static void main(String args[]){ 
	    Animal as[] = new Animal[3];   
	    as[0] = new Dog();   	
	    as[1] = new Cat();    
	    as[2] = new Wolf();     
        //调用as 数组中所有动物的eat 方法    
	    for (int i =0;i<as.length;i++){
			if(as[i] instanceof Animal){
				as[i].eat();
			}
		}   
		
	    //调用as 数组中所有宠物的play 方法   
	    for (int i =0;i<as.length;i++){
			if(as[i] instanceof Pet){
				//Anima类型的引用强转成Pet类型的引用
				Pet p = (Pet)as[i]; 
				//调用play()
				p.play();
			}
		} 
	}
} 
//work 9  
/* 公司给SalariedEmployee每月另外发放2000元加班费，给BasePlusSalesEmploy
ee发放1000元加班费。改写原有代码，加入以上的逻辑。并写一个方法，打印出本月公
司总共发放了多少加班费。 */
interface OverTimePay{
	
	double overTimePay(); //求加班费的方法
}
class Company{
	static double OTP=0.0;//类变量 全公司的加班费	
	
}
class Employee extends Company{   //父类

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
class SalariedEmployee extends Employee implements OverTimePay{ //固定薪水
	private double salary; //私有
	
	public SalariedEmployee(){}  //无参
	public SalariedEmployee(String n,int m ,double s){ // 有参
	     super(n,m);
		 salary = s;
	}
	//实现接口的加班费方法
	public double overTimePay(){
		OTP+=2000;
		return 2000;
	}
	
	//set/get方法
	public void setSalary(double  s){
		 salary= s;
	}	
	// 领工资的方法
	public double getSalary(int month){
		return salary+super.getSalary( month)+overTimePay();
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
class BasePlusSalesEmployee extends SalesEmployee implements OverTimePay { //底薪
	private double baseSalary;
	//无参 有参 构造方法
	public BasePlusSalesEmployee(){}
	public BasePlusSalesEmployee(String n,int m,double s,double b){
		super(n,m,s);
		baseSalary = b;
	}
	// 实现接口的 加班费方法
	public double overTimePay(){
		OTP+=1000;
		return 1000;
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
		return baseSalary+super.getSalary(month)+overTimePay();
	}
}

class TestSalary{
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
		printOTP();
	}	
	public static void printOTP(){
		System.out.println("全公司的加班费为"+Company.OTP);
	}
}		
/**
11.验证歌德巴赫猜想
输入一个大于6?的偶数，请输出这个偶数能被分解为哪两个质数的和。? 如? 10=3+7 12=5+7 ? 要求：两个人一组合作完成。一个人负责把一个整数n?拆分成两个整数的和，另一个人负责写一个方法，?判断某一个整数a?是否是质数?。

*/


class TestG{
	public static void main(String[]args){
		A a = new A();
		a.setB(new B());
		a.gedebahe(26);
	}
}
//定义一个判断是否1为质数的接口
interface Prime{
	boolean isPrime(int n); //返回值为布尔值
}
class A{
	// 私有属性 Prime 的变量
	private Prime b;   
	public void setB(Prime b){  
		this.b =b;
	}
	//哥德巴赫猜想 验证方法
	public void gedebahe(int n){
		for(int i = 1; i<=n/2; i++){
			int j = n-i;
			//借用 Prime类型的b 来判断i，j是否为质数
			if (b.isPrime(i)&&b.isPrime(j)){
				System.out.println(n + "-->"+i+"+"+j);
			}
		}
	} 
}
//判断是否为质数的类b，实现接口Prime
class B implements Prime{
	
	public boolean isPrime(int n){
		if(n < 2){  //小于2都不是质数
			return false;
		}		
		for(int i = 2; i < n; i++){ 
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
//work12
/**
定义一组交通工具类，包括汽车类（AutoMobile）、飞机类(Plane)、船类(Ship)，其中 汽车类有坦克(Tank)、卡车(Truck)、小汽车(Car)，飞机子类有客机(AirLiner)、战斗机 (FighterPlane)，船类有子类游艇?(Yacht)、军舰(WarShip)，坦克战斗机和军舰都具有攻击 的功能，抽象并定义这些类，通过抽象类和接口以及对应的实现类实现多态和这些类的测试
 */

// 抽象类 交通工具
abstract class Vehicle{}
//抽象类 汽车
abstract class AutoMobile  extends Vehicle{
	public abstract void run();
}
//抽象类 飞机
abstract class Plane extends Vehicle{
	public abstract void fly();
}
//抽象类 船
abstract class Ship extends  Vehicle{
	public abstract void swim();
}

//攻击接口
interface Attack{ 
	void attack();//公开抽象的攻击方法
}
//坦克继承父类汽车 并实现接口Attack
class Tank extends AutoMobile implements Attack{  //坦克

	public  void run(){
		System.out.println(" Tank run in every of the land for fighting and protecting homeland/n");
	}
	public void attack(){
		System.out.println(" attack in the land");
	}
}
class Truck extends AutoMobile{  //卡车

	public  void run(){
		System.out.println(" Turck run in road for transpotation");
	}
}
class Car extends AutoMobile{
	
	public  void run(){
		System.out.println(" Car run in the road for trip ");
	}
}
class AirLiner extends Plane{ //客机

	public  void fly(){
		System.out.println(" AirLiner fly for transpot passen");
	}
}
//战斗机继承父类飞机，并实现 接口Attack 
class FighterPlane extends Plane implements Attack{ //战斗机
	//覆盖父类的fly方法
	public void fly(){
		System.out.println(" FighterPlane  fly for fightingand protecting homeland");
	}
	//实现接口的attack方法
	public void attack(){
		System.out.println(" attack in the sky");
	}
}
class Yacht extends Ship{ //游艇

	public  void swim(){
		System.out.println(" Yacht swim for playing");
	}
}
class WarShip extends Ship implements Attack{ //军舰
    // 覆盖父类的Swim方法
	public  void swim(){
		System.out.println(" WarShip  swim for fighting and protecting homeland");
	}
	//实现接口的Attack方法
	public void attack(){
		System.out.println(" attack in the sea");
	}
}
class TestVehicle{
	public static void main(String[]args){
		Vehicle[] vs =new Vehicle[] {
			new Tank(),
			new Truck(),
			new Car(),
			new AirLiner(),
			new FighterPlane(),
			new Yacht(),
			new WarShip()		
		};
		for(int i =0;i<vs.length;i++){
			if(vs[i] instanceof AutoMobile){
				AutoMobile a = (AutoMobile) vs[i];
				a.run();
			}else if(vs[i] instanceof Plane){
				Plane p = (Plane) vs[i];
				p.fly();
			}else{
				Ship s =(Ship) vs[i];
				s.swim();
			}
		}
		for(int i =0;i<vs.length;i++){
			if(vs[i] instanceof Attack){
				Attack a = (Attack) vs[i];
				a.attack();
			}
		}	
	}
}





























