package p1;
// static final abstract
//work1  
class Myclass{
	static int a;  //��̬����Ϊȫ�๲�е�����
	int b;
}
class TestMain{
	public static void main (String[]args){
		Myclass mc1 = new Myclass();
		Myclass mc2 = new Myclass();
		mc1.a = 100;
		mc1.b = 200;
		mc2.a = 300;
		mc2.b = 400;
		System.out.println(mc1.a);//��ӡ300
		System.out.println(mc1.b);//��ӡ200
		System.out.println(mc2.a);//��ӡ300
		System.out.println(mc2.b);//��ӡ400
	}
}
// work 2   �� E //5 ;G //7
class Myclass1{
	int a;
	static int b;
	
	void fa(){}
	static void fb(){}
	
	public void m1(){
		System.out.println(a);
		System.out.println(b);
		fa();
		fb();
		
	}
	public static void m2(){
		// ������̬����ֻ�ܷ��ʾ�̬����
		//System.out.println(a);
		System.out.println(b);
		// fa����������̬����ֻ�ܷ��ʾ�̬����
		//fa(); 
		fb();
	}
}
//work 3  �� 123
class MyClass3 {
	static int count = 0;   //��̬����      
	//���췽����ÿ����һ������ִ��һ��  
	public  MyClass3(){   
        count++;      
		System.out.println(count);  
	}
}
class TestMain1{   
    public static void main(String args[]){   
    MyClass3 mc1 = new MyClass3();       
    MyClass3 mc2 = new MyClass3();   
	MyClass3 mc3 = new MyClass3();  
	} 
}
//work 4
class MyClass4{
	static int i = 10;
	static{    //��������ص�ʱ�����һ��
		i = 20;
		System.out.println("In Static");
		
	}
	public MyClass4(){
		 System.out.println("MyClass()"); 
	}
	public MyClass4(int i){ 
	     System.out.println("MyClass(int)"); 
		 this.i = i; 
	 }
}
class TestMain2{
	public static void main (String[]args){
		MyClass4 mc1 =new MyClass4(); //��ӡIn Static  MyClass()
		System.out.println(mc1.i); //��ӡ20
		MyClass4 mc2 = new MyClass4(10);  //��ӡMyClass(int)
		System.out.println(mc2.i); //��ӡ10
	}
}

//work5 
class Super{  
    //���ྲ̬����m1
    public static void m1(){
	    System.out.println("m1 in Super");  
	}  
	public void m2(){ 
	    System.out.println("m2 in Super");
	} 
}
class Sub extends Super{ 
    //���ྲ̬����m1(),�޷����Ǹ���m1()
    public static void m1(){  
	    System.out.println("m1 in Sub"); 
    } 
    public void m2(){   
	    System.out.println("m2 in Sub");  
	}
}
class TestMain5{    
    public static void main(String args[]){   
	    Super sup = new Sub();  
	    sup.m1();   //��ӡ m1 in Super
	    sup.m2();    //��ӡ m2 in Sub 
        Sub sub = (Sub) sup;  
	    sub.m1();    //��ӡm1 in sub 
	    sub.m2();   // ��ӡm2 in Sub 
	} 
} 
//work 6
/* ��
A, ��̬�����в��ܵ��÷Ǿ�̬����  
C, ��̬�������ܱ�����
D, ��̬�����ܹ�������ֱ�ӵ���
E, �����ڲ������κ�һ�����������µ��þ�̬����? 
 */
//work 7 ��final ���Եĳ�ʼ����

//�� C.���벻ͨ�����ѵ�3�и�Ϊpublic MyClass(){ value = 10��}

class MyClass7{
	final int VALUE;  //����
	public MyClass7(){VALUE = 10;}  //��ʼ������
	public MyClass7(int VALUE){ 
	    this.VALUE = VALUE;     //��ʼ������
	}
}
class TestMain7{ 
    public static void main(String args[]){
        MyClass7 mc = new MyClass7(15);//�вδ���Myclass
		System.out.println(mc.VALUE); 
	} 
}
//work8 final ����
//�� A ����ͨ��
class MyClass8 {
	public void printValue(final int value){
	//�β�Ϊ������ ���ڷ���ʵ���в����Ը���value��ֵ
	    System.out.println(value);
	}    
	public void changeValue(int value){  
         
 	    value = value * 2;   
		System.out.println(value);  
	}
} 
class TestMain8{   
    public static void main(String args[]){  
	    MyClass8 mc = new MyClass8();     
		int value = 5;     
		final int FVALUE = 10;   
		mc.printValue(value); //1    
		mc.printValue(FVALUE); //2         
		mc.changeValue(value); //3  
		//4 ʵ��FVALUE��ֵ���β� value���� FVALUE����������Ӱ��
		mc.changeValue(FVALUE); 
	} 
}
// work9 
class MyValue{ 
    int value; 
} 
class TestFinal{ 
    public static void main(String args[]){ 
	   // final���ã�ָ�����/��ַ����Ψһ���ɱ���
	   final MyValue mv = new MyValue(); 
	   mv.value = 100;  
       //1 ��C ���ϣ�mv = new MyValue() ����벻ͨ��       
	   System.out.println(mv.value); 
    }	   
}
//work 10 final ��������������
class Super10{
	public final void m1(){
		System.out.println("m1() in Super ");
	}
	public void m1(int i){
		System.out.println("m1(int) in Super");
	}
}
class Sub10 extends Super{
	public void m1(int i){
		System.out.println("m1(int) in Sub");
	}
	public void m1(double d){
		System.out.println("m1(double) in Sub"); 
	}
}
class TestMain10{  
    public static void main(String args[]){  
	    Sub10 s = new Sub10();   
	    s.m1();     //��ӡm1() in Super 
        s.m1(10);   //��ӡ m1(int) in Sub  
		s.m1(1.5);   //��ӡm1(double) in Sub
	} 
} 
//work 11 abstract  ��������
/*  �� 
 B 2  ���󷽷���ʵ����Ҫ�÷ֺ����
 C 3  ���෽�����Ǹ��࣬����Ȩ��һ��Ҫ�͸�����ͬ�����
 */
 
//work 12 
//�� A.abstract���п���û��abstract���� 
//B.abstract�������Ҳ������abstract?��
//C.abstract�಻�ܴ�������,��������������
//D.abstract���������з�����

//work 13
//�� D,F

//work14
class work14{
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
abstract class Shape{
	public abstract double area();
	public abstract double girth(); 
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
//work15 static
class MyClass{
	static int count=0;
	public MyClass(){
		count+=1;
	}
	
}
class work15{
	public static void main(String[]args){
		MyClass m1 = new MyClass();
		System.out.println(MyClass.count);
		MyClass m2 = new MyClass();
		System.out.println(MyClass.count);
		MyClass m3 = new MyClass();
		System.out.println(MyClass.count);
		MyClass m4 = new MyClass();
		System.out.println(MyClass.count);
	}
}
















