package p9;
// �������-��װ�̳�
/**���װ/��������
  ��̳еĻ����﷨
  ��������η�
  ����󴴽�����
  ��super�ؼ���
  �񷽷��� 
*/
  
// ��һ��  ���̳С�this ��super �ؼ��֣�
/*�� Super()
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
// �ڶ��� ��super�� �鿴��������������

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
		s.m1();   //��� m1() in Sub  m1() in Super
		s.m2();   // ���  m2() in Super
	}
}
//������ 
/** 
��Animal? ���ԣ�name? 
          ������eat����//��ӡ�����animal?eat()��? ????????
		        sleep()//��ӡ�����Animal?sleep()��? 
1��д��Animal��? 2���ṩ�в��޲ι��췽�������������󣬵���eat��sleep����

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
	String name; //����
	public Animal (){} //�޲�
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
// ������
class work04{
	public static void main(String []args){
		Dog d1 =new Dog();		//����Dog ����
		d1.swim();
		d1.sleep();
	}
}
class Dog extends Animal {
	public Dog(){
		//˽������name�޷��̳У�ֻ��ͨ�����ø�����вι��췽���� ������󲢸� ˽�����Ը�ֵ
		super("СС��"); 
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
//������
class work05{
	public static void main(String []args){
		Cat c =new Cat();		//����Dog ����
		c.climb();
		c.sleep();
	}
}
class Cat extends Animal {
	public Cat(){
		//˽������name�޷��̳У�ֻ��ͨ�����ø�����вι��췽���� ������󲢸� ˽�����Ը�ֵ
		super("СС��"); 
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
//������ (�������η�)

/*
	
	    System.out.println(mc1.value);// mc1.getValue()
	    System.out.println(mc2.value); //mc2.getValue()

    
*/

//������ ���̳С��������η���
// �� A.����ͨ��   ��ͬ��ʱ����default���ε����Բ��ɼ̳�

//�ڰ��� ���̳С���������̣�
/*  �� Meal()
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
//�ھ���

// �� Super��������вι��췽��

//��ʮ��  ���������ǣ� 

//��   A. public int method(){return 0 }  

//ʮһ��  ���������ǣ�
//��  B. void method(){}  D. private void method(){}

//12 ��  ��this��super������
/*
this����ͬһ�����У���Ա������ֲ�������ͻʱ���ֲ��������ȣ����ǿ����� this��Ϊǰ׺���� ��Ա����
super �����ڲ�ͬ���У����������У�ͨ��superǰ׺���ʸ�������Ի򷽷�
*/
//��13��
class Instrument{
	public void play(){
		System.out.println("��������");
	}
}
class Wind extends Instrument{
	public void play(){
		System.out.println("����Wind");
	}
	public void playWind(){
		System.out.println("����wind��play2����");
	}
}
class Brass extends Instrument{
	public void play(){
		System.out.println("����Brass");
	}
	public void playBrass(){
		System.out.println("����Brass��play2����");
	}
}

// 14 ��
class work11{
	public static void main(String []args){
		Shape [] ss = new Shape [3]; 
		ss[0] = new Circle(4.0);
		ss[1] = new Rect(3.4,4.0);
		ss[2] = new Square(4.0);
		//�������飬����ÿһ��role�����play����
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
	private double radius;  // �뾶	
	public void setRadius(double r){
		radius =r;
	}
	public double getRadius(){ return radius;}
	public Circle(){} // �޲�
	public Circle(double r){  // �в�
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
	private double length;  // ��
	private double width;   // ��
	
	public Rect( ){} // �޲�
	public Rect(double l,double w){ // �в�
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
	private double length; // �����α߳�
	public Square(){}
	public Square(double l){
		length = l;
	}
	public void setLength(double l){
		length =l;
	}
	public double getLength(){ return length;}
	// ��������ܳ��ķ���
	public double  area(){				
		return length*length;
	}
	public double girth(){		
		return 4*length;
	}
}


//15 �� ����װ���̳С�super��

class Employee{   //����

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
			return 100.0;
		}
		return 0.0;  //����ֵΪ double���� ������0.0
	}
}
class SalariedEmployee extends Employee{ //�̶���н
	private double salary=4500; //˽��
	
	public SalariedEmployee(){}  //�޲�
	public SalariedEmployee(String n,int m){ // �в�
	     super(n,m);
		
	}
	//set/get����
	public void setSalary(double  s){
		 salary= s;
	}
	
	// �칤�ʵķ���
	public double wage(int month){
		return salary+getSalary( month);
	}
}
class HourlyEmployee extends Employee{  //��ʱн
	private double hourlySalary = 30;  //˽������
	private int hour;
	//�޲� �в� ���췽��
	public HourlyEmployee(){}
	public HourlyEmployee(String n,int m){
		super(n,m);			
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
	public double wage(int month){
		return (hour-160)*hourlySalary*1.5+160*hourlySalary+getSalary( month);
	}
	
	
}
class SalesEmployee extends Employee{  //���� ���۶�*���
	private double sales;
	private double rate = 0.2; //�����
	//�޲� �в� ���췽��
	public SalesEmployee(){}
	public SalesEmployee(String n,int m){
		super(n,m);
		
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
	public double wage(int month){
		return sales*rate+getSalary( month);
	}
}
class BasePlusSalesEmployee extends SalesEmployee  { //��н
	private double baseSalary;
	//�޲� �в� ���췽��
	public BasePlusSalesEmployee(){}
	public BasePlusSalesEmployee(String n,int m){
		super(n,m);
		
	}
	//set/get����
	public void setBaseSalary(double b){
		 baseSalary= b;
	}
	public double getBaseSalar(){
		return baseSalary;
	}
	// �칤�ʵķ���
	public double wage(int month){
		return baseSalary+super.wage(month);
	}
}
class work15{
	public static void main(String []args){
		//��̶���н��Ա
		SalariedEmployee e1 =new SalariedEmployee("СԬ",9); 
		e1. setSalary(4500); //��н
		System.out.println(e1.getName()+"  "+e1.wage(9));   //wage�Ĳ���Ϊ�·�
		
		//��ʱн��Ա��
		HourlyEmployee e2 =new HourlyEmployee("С��",8);
		e2.setHour(180); //��ʱ
		System.out.println(e2.getName()+"  "+e2.wage(9));
		
		// ֻ��������ɵ�Ա��
		SalesEmployee e3 =new SalesEmployee("С��",7);
		e3.setSales(30000); //���۶�
		System.out.println(e3.getName()+"  "+e3.wage(9));
		
		//�е�н����ɵ�������Ա
		BasePlusSalesEmployee e4= new BasePlusSalesEmployee("С��",6);
		e4.setBaseSalary(3000); //���۶�
		System.out.println(e4.getName()+"  "+e4.wage(9));
		
	}
}


// ��ʮ����
/*
  Java�ǣ������̳е����ԣ����ùؼ��֣�extends������2�����ļ̳й�ϵ������ �͸����������(is a)�Ĺ�ϵ
*/
// ��ʮ����
/*     �� ����private ���ɼ̳У������������η����ɼ̳� 
ʹ�÷�Χ   ����  ͬ��   ��ͬ������   ����
private      yes
default      yes  yes 
protected    yes  yes    yes
public       yes  yes    yes         yes

*/

//19��
/*ÿ���඼��������ݵ��������say������Ɍ����Եķ�װ�������һ���������ж� ��Ƶ�����в��ԡ�����������Ķ��󣬲�����say���� Ҫ����Խ�����£�
����������  ���䣺23  ѧλ������  רҵ����ҵ�Զ���
����������   ���䣺27  ѧλ��˶ʿ  �о��������缼��  */
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
	// �вι��췽����������super���ø�����вι�������˽�����Ը�ֵ
	public Undergraduate(String name,int age,String degree){
		super(name,age,degree);
	}
	//����רҵ�ķ���
	public void setSpecialty(String specialty){
		this.specialty=specialty;
	}
	//���רҵ�ķ���
	public String getSpecialty(){
		return specialty;
	}
	//˵�ķ���
	public void say(){		
		System.out.println("������"+getName());
		System.out.println("���䣺"+getAge());
		System.out.println("ѧλ��"+getDegree());
		System.out.println("רҵ��"+specialty);	
	}
}
class  Graduate extends Student{
	private String studyDrection ;
	// �вι��췽����������super���ø�����вι�������˽�����Ը�ֵ
	public Graduate(String name,int age,String degree){
		super(name,age,degree); 
	}
	//�����о�����ķ���
	public void setStudyDrection(String studyDrection){
		this.studyDrection=studyDrection;
	}
	//����о�����ķ���
	public String getStudyDrection(){
		return studyDrection;
	}
	//˵�ķ���
	public void say(){		
		System.out.println("������"+getName());
		System.out.println("���䣺"+getAge());
		System.out.println("ѧλ��"+getDegree());
		System.out.println("רҵ��"+studyDrection);	
	}  
}
class Test{
	public static void main(String []args){
		
		//Ƕ�� ���ø���Ĺ��췽��������� ˽������ ֱ�Ӹ�ֵ		
		Undergraduate u = new Undergraduate("����",23,"����");
		Graduate g = new Graduate("����",27,"˶ʿ"); 
		
		// ����set ������ ����� ˽�����Ը�ֵ
		u.setSpecialty("��ҵ�Զ���");
		g.setStudyDrection("���缼��");
		// ���� say ����
	    u.say();
		g.say();
	}
}







