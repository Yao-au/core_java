package p1;

//work 1

interface IA1{
	void m1(); //�������󷽷�
	int a = 100; //������̬����
}
class MyClass implements IA1{ 
    public void m1(){}
} 
class TestInterface{ 
    public static void main(String args[]){ 
	    //����Myclass ����� IA�ӿ����͵�ia ����
	    IA1 ia = new MyClass();   
		ia.m1();    
		System.out.println(IA1.a); //��ӡ100
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
        //����ma ����       
		ie.ma();      
		//����mb ����    
		ie.mb();  
		//����mc ����    
		ie.mc();    
		//����md ����    
		ie.md();   
	} 
}
//iii  �� true true true true true
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
	    System.out.println(ms instanceof IA4); //��ӡ true
        System.out.println(ms instanceof IB4);  //��ӡ true
	    System.out.println(ms instanceof MySuper);   //��ӡ true    
		System.out.println(ms instanceof MySub); //��ӡ true
    } 
}
// work5
/* A������������й��췽�����ӿ�û�й��췽�� 
C������������зǳ��󷽷����ӿ��ж��ǳ��󷽷�
D��������ͽӿڶ����ܴ�������
E��һ���������Լ̳�һ�������࣬���ǿ���ʵ�ֶ���ӿ�
 */

//work6
/*��
Red Light shine in Green
Yellow Light shine in Green
Green Light shine in Green */
interface Light{   //�ӿ�
    void shine();  //�������󷽷�����ʵ����
} 
class RedLight implements Light{   
	public void shine(){ //ʵ�ֽӿڵ�shine����
		System.out.println("Red Light shine in Red");  
	}
}
class YellowLight implements Light{   
    public void shine(){  //ʵ�ֽӿڵ�shine����
		System.out.println("Yellow Light shine in Yellow"); 
	} 
} 
class GreenLight implements Light{ 
    public void shine(){ //ʵ�ֽӿڵ�shine����
	    System.out.println("Green Light shine in Green");   
	} 
} 
class Lamp{     //̨����
    private Light light;  //˽�����Ե�
    public void setLight(Light light){    
        this.light = light;   
	}  
	public void on(){    
	    light.shine();     
	} 
} 
class TestLamp{
	public static void main(String args[]){ 
	    //����һ���Ƶ�����ls
	    Light[] ls = new Light[3];  
		//��ʼ������Ԫ�أ������ʵƶ���
	    ls[0] = new RedLight();  
	    ls[1] = new YellowLight();   
	    ls[2] = new GreenLight();   
		//����̨�ƶ���
	    Lamp lamp = new Lamp();    
		// �����ʵ�ls���飬��̨��һһ���ϲ�ͬ��ɫ�ĵƣ�������on����
	    for (int i = 0; i<ls.length; i++){   
  	        lamp.setLight(ls[i]);    
		    lamp.on();  
		}     
	} 
} 
// work7
interface JavaTeacher{  //�ӿ� 
    void teach(); 
	}
class TeacherA implements JavaTeacher{  //TAʵ�ֽӿ�JT
        public void teach(){     //TA ʵ��teach����
	    	System.out.println("TeacherA teach Java");  
		} 
	} 
class TeacherB implements JavaTeacher{ //TBʵ�ֽӿ�JT
    public void teach(){  //TB ʵ��teach����
	    System.out.println("TeacherB teach Java"); 
    } 
} 
class School{   
    //�����ʦ�ķ���������ֵ����ΪJavaTeacher
    public static JavaTeacher getTeacher(int i){ 
        if (i == 0) return new TeacherA();   
		else return new TeacherB();   
	}
} 
class TestSchool{     
    public static void main(String args[]){ 
     	JavaTeacher jt = School.getTeacher(0);  
		jt.teach();   //��ӡTeacherA teach Java
		jt = School.getTeacher(10); 
        jt.teach();    //��ӡTeacherB teach Java
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
        //����as ���������ж����eat ����    
	    for (int i =0;i<as.length;i++){
			if(as[i] instanceof Animal){
				as[i].eat();
			}
		}   
		
	    //����as ���������г����play ����   
	    for (int i =0;i<as.length;i++){
			if(as[i] instanceof Pet){
				//Anima���͵�����ǿת��Pet���͵�����
				Pet p = (Pet)as[i]; 
				//����play()
				p.play();
			}
		} 
	}
} 
//work 9  
/* ��˾��SalariedEmployeeÿ�����ⷢ��2000Ԫ�Ӱ�ѣ���BasePlusSalesEmploy
ee����1000Ԫ�Ӱ�ѡ���дԭ�д��룬�������ϵ��߼�����дһ����������ӡ�����¹�
˾�ܹ������˶��ټӰ�ѡ� */
interface OverTimePay{
	
	double overTimePay(); //��Ӱ�ѵķ���
}
class Company{
	static double OTP=0.0;//����� ȫ��˾�ļӰ��	
	
}
class Employee extends Company{   //����

	private String name;   //˽������
	private int month;  // ��װ
	
	public Employee(){}//�޲ι��췽��
	public Employee(String n,int m ){ //�вι��췽��
		name = n;
		month = m;
	}
	//��û�����˽������name month �ķ���
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
	// ���ռ�н�ķ���
	public double getSalary(int month){
		if(this.month == month){
			return 100;
		}
		return 0;  //����ֵΪ double���� ������0.0
	}
}
class SalariedEmployee extends Employee implements OverTimePay{ //�̶�нˮ
	private double salary; //˽��
	
	public SalariedEmployee(){}  //�޲�
	public SalariedEmployee(String n,int m ,double s){ // �в�
	     super(n,m);
		 salary = s;
	}
	//ʵ�ֽӿڵļӰ�ѷ���
	public double overTimePay(){
		OTP+=2000;
		return 2000;
	}
	
	//set/get����
	public void setSalary(double  s){
		 salary= s;
	}	
	// �칤�ʵķ���
	public double getSalary(int month){
		return salary+super.getSalary( month)+overTimePay();
	}
}
class HourlyEmployee extends Employee{  //��ʱн
	private double hourlySalary = 30;  //˽������
	private int hour;
	//�޲� �в� ���췽��
	public HourlyEmployee(){}
	public HourlyEmployee(String n,int m,int h){
		super(n,m);	
		hour=h;
	}	
	//set/get����
	public void setHourlySalary(double hs){
		 hourlySalary= hs;
	}
	public double getHourlySalary(){return hourlySalary;}	
	
	public void setHour(int h){
		 hour= h;
	}
	public int getHour(){return hour;}
	// �칤�ʵķ���
	public double getSalary(int month){
		return (hour-160)*hourlySalary*1.5+160*hourlySalary+super.getSalary( month);
	}
}
class SalesEmployee extends Employee{  //���� ���۶�*���
	private double sales;
	private double rate = 0.2; //�����
	//�޲� �в� ���췽��
	public SalesEmployee(){}
	public SalesEmployee(String n,int m,double s){
		super(n,m);
		sales = s;
	}
	//set/get����
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
	// �칤�ʵķ���
	public double  getSalary(int month){
		return sales*rate+super.getSalary( month);
	}
}
class BasePlusSalesEmployee extends SalesEmployee implements OverTimePay { //��н
	private double baseSalary;
	//�޲� �в� ���췽��
	public BasePlusSalesEmployee(){}
	public BasePlusSalesEmployee(String n,int m,double s,double b){
		super(n,m,s);
		baseSalary = b;
	}
	// ʵ�ֽӿڵ� �Ӱ�ѷ���
	public double overTimePay(){
		OTP+=1000;
		return 1000;
	}
	//set/get����
	public void setBaseSalary(double b){
		baseSalary= b;
	}
	public double getBaseSalar(){
		return baseSalary;
	}
	// �칤�ʵķ���
	public double getSalary(int month){
		return baseSalary+super.getSalary(month)+overTimePay();
	}
}

class TestSalary{
	public static void main(String []args){		
		Employee [] es = new Employee []{
		 new SalariedEmployee("СԬ",9,4500),//�̶�нˮ	
		 new HourlyEmployee("С��",8,180),   //��ʱ
		 new SalesEmployee("С��",7,30000), // ���۶�
		 new BasePlusSalesEmployee("С��",6,30000,3000)		// ���۶� ��н
		};			
		//�������飬����ÿһ��employee�����wage����
		for(int i =0; i< es.length; i++){
			System.out.println(es[i].getName()+"  "+es[i].getSalary(9));   //�·�
		}
		printOTP();
	}	
	public static void printOTP(){
		System.out.println("ȫ��˾�ļӰ��Ϊ"+Company.OTP);
	}
}		
/**
11.��֤��°ͺղ���
����һ������6?��ż������������ż���ܱ��ֽ�Ϊ�����������ĺ͡�? ��? 10=3+7 12=5+7 ? Ҫ��������һ�������ɡ�һ���˸����һ������n?��ֳ����������ĺͣ���һ���˸���дһ��������?�ж�ĳһ������a?�Ƿ�������?��

*/


class TestG{
	public static void main(String[]args){
		A a = new A();
		a.setB(new B());
		a.gedebahe(26);
	}
}
//����һ���ж��Ƿ�1Ϊ�����Ľӿ�
interface Prime{
	boolean isPrime(int n); //����ֵΪ����ֵ
}
class A{
	// ˽������ Prime �ı���
	private Prime b;   
	public void setB(Prime b){  
		this.b =b;
	}
	//��°ͺղ��� ��֤����
	public void gedebahe(int n){
		for(int i = 1; i<=n/2; i++){
			int j = n-i;
			//���� Prime���͵�b ���ж�i��j�Ƿ�Ϊ����
			if (b.isPrime(i)&&b.isPrime(j)){
				System.out.println(n + "-->"+i+"+"+j);
			}
		}
	} 
}
//�ж��Ƿ�Ϊ��������b��ʵ�ֽӿ�Prime
class B implements Prime{
	
	public boolean isPrime(int n){
		if(n < 2){  //С��2����������
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
����һ�齻ͨ�����࣬���������ࣨAutoMobile�����ɻ���(Plane)������(Ship)������ ��������̹��(Tank)������(Truck)��С����(Car)���ɻ������пͻ�(AirLiner)��ս���� (FighterPlane)��������������ͧ?(Yacht)������(WarShip)��̹��ս�����;��������й��� �Ĺ��ܣ����󲢶�����Щ�࣬ͨ��������ͽӿ��Լ���Ӧ��ʵ����ʵ�ֶ�̬����Щ��Ĳ���
 */

// ������ ��ͨ����
abstract class Vehicle{}
//������ ����
abstract class AutoMobile  extends Vehicle{
	public abstract void run();
}
//������ �ɻ�
abstract class Plane extends Vehicle{
	public abstract void fly();
}
//������ ��
abstract class Ship extends  Vehicle{
	public abstract void swim();
}

//�����ӿ�
interface Attack{ 
	void attack();//��������Ĺ�������
}
//̹�˼̳и������� ��ʵ�ֽӿ�Attack
class Tank extends AutoMobile implements Attack{  //̹��

	public  void run(){
		System.out.println(" Tank run in every of the land for fighting and protecting homeland/n");
	}
	public void attack(){
		System.out.println(" attack in the land");
	}
}
class Truck extends AutoMobile{  //����

	public  void run(){
		System.out.println(" Turck run in road for transpotation");
	}
}
class Car extends AutoMobile{
	
	public  void run(){
		System.out.println(" Car run in the road for trip ");
	}
}
class AirLiner extends Plane{ //�ͻ�

	public  void fly(){
		System.out.println(" AirLiner fly for transpot passen");
	}
}
//ս�����̳и���ɻ�����ʵ�� �ӿ�Attack 
class FighterPlane extends Plane implements Attack{ //ս����
	//���Ǹ����fly����
	public void fly(){
		System.out.println(" FighterPlane  fly for fightingand protecting homeland");
	}
	//ʵ�ֽӿڵ�attack����
	public void attack(){
		System.out.println(" attack in the sky");
	}
}
class Yacht extends Ship{ //��ͧ

	public  void swim(){
		System.out.println(" Yacht swim for playing");
	}
}
class WarShip extends Ship implements Attack{ //����
    // ���Ǹ����Swim����
	public  void swim(){
		System.out.println(" WarShip  swim for fighting and protecting homeland");
	}
	//ʵ�ֽӿڵ�Attack����
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





























