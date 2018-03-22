package p1;

// 第1题
/*
Java中基本类型变量中保存（值)，引用中保存（地址)
基本类型变量传值时，传递的是（值)，引用传值时，传递的是（地址)，
两个引用指向（同一）对象

*/

// 第2题
/*
this的2种用法：
  this的2种用法：
  1.this引用（当前实例）：当成员变量与局部变量重名时，局部变量优先
  如需使用成员变量，应使用this前缀。
  2.构造（首行）在构造方法内部访问同一类中的其他构造方法时，应在构造方法的首行通过 this（）或this（实参）调用

*/

//第3题

class MyClass{
    int value; 
}
class TestRef{
    public static void main(String args[]){
        int a = 10;
        int b = a;   //传递 值
        b ++ ;        
		System.out.println(a);    //  打印10
		MyClass mc1 = new MyClass();
        mc1.value = 10;   
		MyClass mc2 = mc1;    //传递 地址
		mc2.value ++;         //即 mc2.value ++
		System.out.println(mc1.value);   // 打印 11
	} 
}
//第4 题  答案 c 输出20
class ClassA{
    int value = 10; 
	} 
 class TestReturnRef{
	public static void main(String args[]){ 
	    ClassA ca = new ClassA(); 
		//创建个新的对象，value = 10 +10； 把地址传给  ca；
	    ca = getObject(); 
        //再次创建个新对象，value=10+10；
	    //还是把地址传给ca，覆盖上一次的传值， ca.value=20;
	    ca = getObject();  
	    ca = getObject(); 
	    System.out.println(ca.value); // 打印 20
	}   
	public static ClassA getObject(){  //获得对象的方法
		ClassA newObject = new ClassA();
		newObject.value += 10; 
		return newObject;  //newObject.value =20
	} 
}
//第5 题 （面向对象、this）
class Dog{    
     //定义一个name 属性，该属性为String 类型 
	String name;
	 //定义一个age 属性，该属性为int 类型
	int age;    
	 //定义一个sexual 属性，该属性为boolean 类型    
	 //true 表示为公，false 表示为母   
	 boolean sex;
	
	 public Dog(){}    
	 public Dog(String _name, int _age, boolean _sexual){ 
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
        Dog d = new Dog("joy",2,false)  ;       
		//调用Dog 对象无参的play 方法。
        d.play();;        
		//调用Dog 对象有参的play 方法，参数为30
        d.play(30);
	}
}

// 第6 题（引用，方法参数传递）  答案 C.输出10 11 
class Class{
    int value;
}
class TestClass{
    public static void main(String args[]){
        int value = 10;
        changeInt(value);
        System.out.println(value);   
		ClassA ca = new ClassA();  
		ca.value = 10;  
		changeObject(ca);      
		System.out.println(ca.value);
	}   
	public static void changeInt(int value){ 
		value++;  
	}    
	public static void changeObject(ClassA ca){ 
		ca.value++; 
	} 
}
// 第7 题 （构造函数，this关键字）程序改错
class Student3{
    public void Student(){}    
	void init(){
        age = 10;  
		name = "limy"; 
		}    
	public Student3(String name){
        this.init();     
		this.name = name;   
		}   
	public Student3(String name, int age){   
	    this.init(); 
	   // this(name);     //改错 必须是构造方法的一个语句
		this.age = age; 
	}    
	int age;  
	String name;
}


// 第八题  将Day07的1-6题所有类，完成封装


class work01{
	public static void main(String [] args){
		Person p1 = new Person();
		Person p2 = new Person("袁磊",22,'男');
		p1.setName("姚瑶");
		p1.setAge(21);
		p1.setSex('女');
		
		p1.say();
		p1.fit("易达爷");
		p2.say();
		p2.fit("小煞笔");
	}
}
class Person{
	
	private String name;
	private int age;
	private char sex;
	
	public Person(){};
	public Person(String name,int age,char sex){
		this.name = name;
		this.age =age;
		this.sex =sex;
	};
	//设置和获得私有属性的方法
	public void setName( String  name){  //name
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	public void setAge( int age ){   //age
		this.age = age ;
	}
	public int getAge(){
		return age;
	}
	
	public void setSex( char sex ){   //sex
		this.sex = sex ;
	}
	public char getSex(){
		return sex;
	}
	
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
		Student1 s1 = new Student1(17070202,"yyh",22,'女',99);
		Student1 s2 =new Student1();
		s2.setId (17010101);
		s2.setName ( "谷冉");
		s2.setAge ( 25);
		s2.setSex('男');
		s2.setScore(100);
		
		s1.study();
		s2.study();
		s1.study(12);
		s2.study(15);
	}
	
}
class Student1{
	private int id;
	private String  name;
	private int age;
	private char sex;
	private int score;
	
	public Student1(){} //无参构造
	public Student1(int id,String name,int age,char sex,int score ){
		this.id =id;
		this.name = name;
		this.age = age;
		this .sex=sex;
		this.score =score;
	}
	//设置和获得私有属性的方法
	public void setId( int id ){   //id
		this.id = id ;
	}
	public int getId(){
		return id;
	}
	
	public void setScore( int score ){   //score
		this.score = score ;
	}
	public int getScore(){
		return score;
	}
	
	public void setName( String  name){  //name
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	
	public void setAge( int age ){   //age
		this.age = age ;
	}
	public int getAge(){
		return age;
	}
	
	public void setSex( char sex ){   //sex
		this.sex = sex ;
	}
	public char getSex(){
		return sex;
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
		Teacher1 t1 = new Teacher1(17070202,"傻逼老师","傻逼课程");
		Teacher1 t2 = new Teacher1();
		t2.setId ( 17070804);
		t2.setName("二货老师");
		t2.setCourse("二货课程");
		t1.teach();
		t2.teach();
	}
}
class Teacher1{
	int id;
	String  name;
	String course;
	public Teacher1(){} //无参构造
	public Teacher1(int id,String name,String course ){
		this.id =id;
		this.name = name;
		this.course = course;
	}
	
	//设置和获得私有属性的方法
	public void setId( int id ){   //id
		this.id = id ;
	}
	public int getId(){
		return id;
	}
	
	public void setCourse( String course ){   //course
		this.course = course ;
	}
	public String getCourse(){
		return course;
	}
	
	public void setName( String  name){  //name
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	public void teach(){
		System.out.println(name+"教"+course);
	}
}
class work04{
	public static void main(String[] args){
		Animal a1 =new Animal();
		Animal a2 =new Animal("长颈鹿","叶子");
		
		a1.setName("狮子");
		a1.setFood("肉");
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
	
	public void setFood( String food ){   //food
		this.food = food ;
	}
	public String getFood(){
		return food;
	}
	
	public void setName( String  name){  //name
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	public void eat(){
		System.out.println(name+"吃"+food);
	}
}

class work05{
	public static void main(String[] args){
		Dog1 a1 =new Dog1();
		Dog1 a2 =new Dog1("京巴狗",5,"棕色");
		a1.setName("哈士奇");
		a1.setAge (7);
		a1.setColor("黑白色");
		a1.sleep();
		a2.swim();
		
	}
}
class Dog1{
	private String  name;
	private int age;
	private String color;
	
	public Dog1(){} //无参构造
	public Dog1(String name,int age,String color ){	
		this.name = name;	
		this.age = age;
		this.color = color;
	}
	
	//设置和获得私有属性的方法
	public void setName( String  name){  //name
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	//
	public void setAge( int age ){   //age
		this.age = age ;
	}
	public int getAge(){
		return age;
	}
	
	public void setColor( String color ){   //color
		this.color = color ;
	}
	public String getColor(){
		return color;
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
		
		a1.setName("中华田园猫");
		a1.setAge (7);
		a1.setColor("黄白色");
		a1.sleep();
		a2.climb();
		
	}
}
class Cat{
	private String  name;
	private int age;
	private String color;
	
	public Cat(){} //无参构造
	public Cat(String name,int age,String color ){	
		this.name = name;	
		this.age = age;
		this.color = color;
	}
	
	//设置和获得私有属性的方法
	//设置和获得私有属性的方法
	public void setName( String  name){  //name
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	//
	public void setAge( int age ){   //age
		this.age = age ;
	}
	public int getAge(){
		return age;
	}
	
	public void setColor( String color ){   //color
		this.color = color ;
	}
	public String getColor(){
		return color;
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

//第九题  （封装）

//把Day07中的Worker、Address类中所有的属性都改成私有，并提供相应的get/set方法。
class Worker{
	private int id;
	private String name;
	private int age;
	private double salary;
	
	public Worker(){}
	public Worker(int id,String name,int age,double salary){
		this.id =id ;
		this.name = name;
		this.age = age;
		this.salary =salary ;
	}
	// 设置或获得私有属性的方法
	public void setId( int id){          //id
		this.id = id ;
	}
	public int getId(){
		return id;
	}
	
	public void setNname( String  name){  //name
		this.name = name ;
	}
	public String getName(){
		return name;
	} 
	public void setAge( int age ){        //age
		this.age = age ;
	}
	public int getAge(){
		return age;
	}
	public void setSalary( double salary){  //salary
		this.salary = salary ;
	}
	public double getSalary(){  
		return salary;
	}
	
	public void work(){
		System.out.println(name+"工作8小时");
	
	}
	public void work(int hour){
		System.out.println(name+"工作"+hour+"小时");	
	}
}

class Address{
	//私有属性 地址
	private String address;
	//私有属性 邮编
	private String zipCode;
	public Address(){}
	public Address(String ad,String zip){
		address= ad;
		zipCode= zip;
	}
	
	// 设置或获得私有属性的方法
	public void setAddress( String address){//address
		this.address =address  ;
	}
	public String getAddress(){
		return address;
	}
	public void setZipCode( String zipCode){//zipcode
		this.zipCode =zipCode  ;
	}
	public String getsetZipCode(){
		return zipCode;
	}
}


//第10题 （封装）


class Student2{
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile; 
	
	// 设置或获得私有属性的方法
	public void setNname( String  name){  //name
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	public void setAge( int age ){   //age
		this.age = age ;
	}
	public int getAge(){
		return age;
	}
	public void setAddress( String address){//address
		this.address =address  ;
	}
	public String getAddress(){
		return address;
	}
	public void setZipCode( String zipCode){//zipcode
		this.zipCode =zipCode  ;
	}
	public String getsetZipCode(){
		return zipCode;
	}
	public void setMobile( String  mobile){//moblile
		this.mobile =mobile  ;
	}
	public String getMobile(){
		return mobile;
	}
	public String getPostAddress(){
		return address+zipCode;
	}
}


// 第11题   使用day07的Teacher类和Student类


class Class1{   //该类对象表示一个班级	
	Teacher   t = new Teacher();
	Student[] ss = new Student[10] ;//保存多个Student对象 
	int count = 0;; //表示有效元素个数  
    	
	//添加Student对象
	public  void addStudent(Student s){
		ss[count] = s;
		count++;
	    
	}  
	
	//根据id移除Student对象
	public  void removeStudent(int id){
		for(int i =0;i<count;i++){
		   if(id == ss[i].id){
		        ss[i]= null;
		        count--;
	        }
	    }
	}
	   
	   
	 //更新Student对象 
	public  void updateStudent(Student s){
		for(int i =0;i<count;i++){
		   if(s.name == ss[i].name){
		        ss[i]= s; 
	        }
	    }
	}
	
	//根据id查询Student对象
	public  Student queryStudent(int id) {
		Student s=null;
		for(int i =0;i<count;i++){
		   if(id == ss[i].id){  
		        s=ss[i];
	        }
	    }
		return s;
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