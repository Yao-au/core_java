package p1;
// static final abstract
//work1  
class Myclass{
	static int a;  //静态属性为全类共有的属性
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
		System.out.println(mc1.a);//打印300
		System.out.println(mc1.b);//打印200
		System.out.println(mc2.a);//打印300
		System.out.println(mc2.b);//打印400
	}
}
// work 2   答案 E //5 ;G //7
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
		// 出错，静态方法只能访问静态属性
		//System.out.println(a);
		System.out.println(b);
		// fa（）出错，静态方法只能访问静态方法
		//fa(); 
		fb();
	}
}
//work 3  答案 123
class MyClass3 {
	static int count = 0;   //静态变量      
	//构造方法，每创建一个对象执行一次  
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
	static{    //仅在类加载的时候调用一次
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
		MyClass4 mc1 =new MyClass4(); //打印In Static  MyClass()
		System.out.println(mc1.i); //打印20
		MyClass4 mc2 = new MyClass4(10);  //打印MyClass(int)
		System.out.println(mc2.i); //打印10
	}
}

//work5 
class Super{  
    //父类静态方法m1
    public static void m1(){
	    System.out.println("m1 in Super");  
	}  
	public void m2(){ 
	    System.out.println("m2 in Super");
	} 
}
class Sub extends Super{ 
    //子类静态方法m1(),无法覆盖父类m1()
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
	    sup.m1();   //打印 m1 in Super
	    sup.m2();    //打印 m2 in Sub 
        Sub sub = (Sub) sup;  
	    sub.m1();    //打印m1 in sub 
	    sub.m2();   // 打印m2 in Sub 
	} 
} 
//work 6
/* 答案
A, 静态方法中不能调用非静态方法  
C, 静态方法不能被覆盖
D, 静态方法能够用类名直接调用
E, 可以在不产生任何一个对象的情况下调用静态方法? 
 */
//work 7 （final 属性的初始化）

//答案 C.编译不通过，把第3行改为public MyClass(){ value = 10；}

class MyClass7{
	final int VALUE;  //常量
	public MyClass7(){VALUE = 10;}  //初始化常量
	public MyClass7(int VALUE){ 
	    this.VALUE = VALUE;     //初始化常量
	}
}
class TestMain7{ 
    public static void main(String args[]){
        MyClass7 mc = new MyClass7(15);//有参创建Myclass
		System.out.println(mc.VALUE); 
	} 
}
//work8 final 变量
//答案 A 编译通过
class MyClass8 {
	public void printValue(final int value){
	//形参为常量， 则在方法实现中不可以更改value的值
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
		//4 实参FVALUE传值给形参 value，对 FVALUE常量本身无影响
		mc.changeValue(FVALUE); 
	} 
}
// work9 
class MyValue{ 
    int value; 
} 
class TestFinal{ 
    public static void main(String args[]){ 
	   // final引用，指向对象/地址具有唯一不可变性
	   final MyValue mv = new MyValue(); 
	   mv.value = 100;  
       //1 答案C 加上：mv = new MyValue() 则编译不通过       
	   System.out.println(mv.value); 
    }	   
}
//work 10 final 方法，方法覆盖
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
	    s.m1();     //打印m1() in Super 
        s.m1(10);   //打印 m1(int) in Sub  
		s.m1(1.5);   //打印m1(double) in Sub
	} 
} 
//work 11 abstract  方法覆盖
/*  答案 
 B 2  抽象方法的实现体要用分号替代
 C 3  子类方法覆盖父类，访问权限一定要和父类相同或更宽
 */
 
//work 12 
//答案 A.abstract类中可以没有abstract方法 
//B.abstract类的子类也可以是abstract?类
//C.abstract类不能创建对象,但可以声明引用
//D.abstract方法不能有方法体

//work 13
//答案 D,F

//work14
class work14{
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
abstract class Shape{
	public abstract double area();
	public abstract double girth(); 
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
















