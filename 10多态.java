package p10;
/** 
��?��̬�Ļ����﷨��ʹ��
��?instanceof
��?��̬���ڲ����ͷ���ֵ��
*/



//��1��
/*ʹ�ö�̬�������ؼ��㣺 
1.���������Կ���������󣬵��������ʵ�����Ͳ������ı�
2.�������ý����Ե��������ඨ��ĳ�Ա�����ɵ���������еĳ�Ա
3.ʵ�����й����У����ȵ���������д��ķ�������û����д������ø��෽��
*/

//��2��
/* s���ÿ��Ե� m2()������
   m1() Ϊ fu'lei
   ��sǿתΪSub()���͵����ã������Ե���m3()����
*/
//��3��   �𰸼�ע�� ǿת
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
		Sub s1 = (Sub)s; // ��sǿתΪ Sub�����ɵ�������� method(String str)
        s1.method(10);  
        s1.method();     
		//�����������������ʱ�����ɵ���������еķ���
        s1.method("hello");  
    } 
}
//��4��
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
    public static void foo(Super2 s){ //�����β�
        s.m();
	} 
	public static void main(String args[]){
        Sub2 sub = new Sub2();
        Super2 sup = new Super2();
		//super���͵����� super���͵Ķ���ֱ�ӵ��ø����m����
        foo(sup);    //��ӡ m() in Super
		//super���͵����� Sub���͵Ķ������ȵ���������д��m����
		foo(sub);  //��ӡ  m() in Sub
	} 
}
/** 
��6��   ����ж�һ������ָ��Ķ�����ĳһ���͵Ķ���
if( ���ö��� instanof �ж�����) //����ƥ������boolean�� true
*/
//��7��
class AnimalTest{
    public static void main(String[] args){
		Animal1 a = new Dog1();
		System.out.println(getAnimal(a));
		Cat1 c = new Cat1();
		m(c);
    }    
	
	//дһ���������Խ�������Animal���ͼ����������͵Ķ���
    public static void m(Animal1 a){  
	  System.out.println("is a animal");
	}
	
    //дһ���������Է�������Animal���ͼ����������͵Ķ��� 
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
//��8��
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
        //a ���Ե�����Щ����
        a.ma(); /*�����Ե���A��������ĳ�Ա*/
        //����aָ��Ķ�����Ե��� mb������Ӧ����ô��
        B b =(B) a;  /* a ����ǿתΪ B*/
		b.mb();
        //�ж�aָ��Ķ����Ƿ���D���͵Ķ����Ǵ�ӡ"��"�������ӡ"����"  
		if(a instanceof D){
			System.out.println("��");
		}
	} 
}

// ��9��
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
//��һ��Animal ��������ѡ�����е�Dog���󣬲�����Щ�������һ��Dog �����з���
	public static Dog[] getAllDog(Animal[] as){
        int count = 0;
	    // 1 ���������ȡDog ���������
	    for(int i = 0; i < as.length; i++){
		    if(as[i] instanceof Dog){
			     count++;
		    }
	    }
	    Dog [] ds = new Dog[count];
	    // 2 ����Animal[] ����Ԫ�ؽ����ж�
	    //����Dog ���Ͷ��󣬱��浽Dog[]
	    int index = 0;
	    for(int i =0;i<as.length ;i++){
		    if(as[i] instanceof Dog){
			    // ������ǿתΪ �����������ã�����ֵ
		        ds[index]=(Dog)as[i];
		         //index �������Լ�¼��һ��Dog�����ŵ��±�
		        index++;
		    }		
	    }
		return ds;
	} 
}
// ��10 ��  ���̳ж�̬��
class work10{
	public static void main(String []args){
		Role [] rs = new Role [3]; 
		rs[0] = new Dancer();
		rs[1] = new Singer();
		rs[2] = new Musician();
		//�������飬����ÿһ��role�����play����
		for(int i =0; i< rs.length; i++){
			rs[i].play();
		}
	}
}
class Role{
	public void play(){
		System.out.println("Role play()��");
	}
}
class Dancer extends Role{
	public void play(){
		System.out.println("Dancer play()��");
	}
}
class Singer extends Role{
	public void play(){
		System.out.println("Singer play()��");
	}
}
class Musician extends Role{
	public void play(){
		System.out.println("Musician play()��");
	}
}
// ��11 ��
class work11{
	public static void main(String []args){
		Shape [] ss = new Shape [3]; 
		ss[0] = new Circle(4.0);  //�вι���
		ss[1] = new Rect(3.4,4.0);
		ss[2] = new Square(4.0);
		//�������飬����ÿһ��Shape�����area��grith��������
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
	private double radius;  // �뾶	
	public void setRadius(double r){
		radius =r;
	}
	public double getRadius(){ return radius;}
	public Circle(){} // �޲�
	public Circle(double r){  // �в�
		radius =r;
	}
	public double  area(){		//��̬ʱ ���Ǹ����area����		
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

/** 
����װ���̳С�super����̬��ĳ��˾�Ĺ�Ա��Ϊ���������ࣺ
Employee����������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�������? getSalary(intmonth)?���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾? ����⽱��100?Ԫ��? SalariedEmployee��Employee?�����࣬�ù̶����ʵ�Ա�������ԣ���н? HourlyEmployee��?Employee?�����࣬?��Сʱ�ù��ʵ�Ա����?ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5?�����ʷ��š����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
SalesEmployee��Employee?�����࣬������Ա�������������۶������ʾ�����? ���ԣ������۶�����BasePlusSalesEmployee��SalesEmployee?�����࣬�й� ����н��������Ա�������ɵ�н����������ɲ��֡����ԣ���н��? ��?��?Ҫ?��?��?��?SalariedEmployee?��?HourlyEmployees?��SaleEmployee?�� BasePlusSalesEmployee�ĸ���Ķ����һ����������ĳ�������ĸ�����Ĺ��ʡ� ע�⣺Ҫ���ÿ���඼������ȫ��װ���������˽�л�����
--��������Ŀ�Ļ����ϣ�����һ��Employee?���飬�ֱ𴴽����ɲ�ͬ? ��Employee���󣬲���ӡĳ���µĹ��ʡ�--
*/
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
			return 100;
		}
		return 0;  //����ֵΪ double���� ������0.0
	}
}
class SalariedEmployee extends Employee{ //�̶�нˮ
	private double salary; //˽��
	
	public SalariedEmployee(){}  //�޲�
	public SalariedEmployee(String n,int m ,double s){ // �в�
	     super(n,m);
		 salary = s;
	}
	//set/get����
	public void setSalary(double  s){
		 salary= s;
	}	
	// �칤�ʵķ���
	public double getSalary(int month){
		return salary+super.getSalary( month);
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
class BasePlusSalesEmployee extends SalesEmployee  { //��н
	private double baseSalary;
	//�޲� �в� ���췽��
	public BasePlusSalesEmployee(){}
	public BasePlusSalesEmployee(String n,int m,double s,double b){
		super(n,m,s);
		baseSalary = b;
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
		return baseSalary+super.getSalary(month);
	}
}
class work12{
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
		
		
		/*	
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
		e4.setSales(30000);
		System.out.println(e4.getName()+"  "+e4.wage(9));
     */
	}
}





























