package p1;
//��Ͷ���ĸ���
//ʵ������
//��������
//���췽��
//�����Զ��巽����������дstatic��Ҫʹ�ö�����á�

class work01{
	public static void main(String [] args){
		Person p1 = new Person();
		Person p2 = new Person("Ԭ��",22,'��');
		p1.name ="Ҧ��";
		p1.age= 21;
		p1.sex='Ů';
		p1.say();
		p1.fit("�״�ү");
		p2.say();
		p2.fit("Сɷ��");
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
		System.out.println(name+ "����"+age+ "�Ա�"+sex);
	}
	public void fit(String n){
		name = n;
		System.out.println( name);
	}
}
class work02{
	public static void main(String[] args){
		Student s1 = new Student(17070202,"yyh",22,'Ů',99);
		Student s2 =new Student();
		s2.id =17010101;
		s2.name = "��Ƚ";
		s2.age = 25;
		s2.sex='��';
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
	public Student(){} //�޲ι���
	public Student(int id,String name,int age,char sex,int score ){
		this.id =id;
		this.name = name;
		this.age = age;
		this .sex=sex;
		this.score =score;
	}
	public void study(){
		System.out.println(name+"ѧϰ��8Сʱ");
	}
	public void study(int hours){
		System.out.println(name+"ѧϰ��"+hours+"Сʱ");
	}
}
class work03{
	public static void main(String[] args){
		Teacher t1 = new Teacher(17070202,"ɵ����ʦ","ɵ�ƿγ�");
		Teacher t2 = new Teacher();
		t2.id = 17070804;
		t2.name="������ʦ";
		t2.course="�����γ�";
		t1.teach();
		t2.teach();
	}
}
class Teacher{
	int id;
	String  name;
	String course;
	public Teacher(){} //�޲ι���
	public Teacher(int id,String name,String course ){
		this.id =id;
		this.name = name;
		this.course = course;
	}
	public void teach(){
		System.out.println(name+"��"+course);
	}
}
class work04{
	public static void main(String[] args){
		Animal a1 =new Animal();
		Animal a2 =new Animal("����¹","Ҷ��");
		a1.name="ʨ��";
		a1.food="��";
		a1.eat();
		a2.eat();
	}
}
class Animal{
	String  name;
	String food;
	public Animal(){} //�޲ι���
	public Animal(String name,String food ){	
		this.name = name;	
		this.food  = food;
	}
	public void eat(){
		System.out.println(name+"��"+food);
	}
}
class work05{
	public static void main(String[] args){
		Dog a1 =new Dog();
		Dog a2 =new Dog("���͹�",5,"��ɫ");
		a1.name = "��ʿ��";
		a1.age =7;
		a1.color="�ڰ�ɫ";
		a1.sleep();
		a2.swim();
		
	}
}
class Dog{
	String  name;
	int age;
	String color;
	
	public Dog(){} //�޲ι���
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
		Cat a2 =new Cat("�۶�è",5,"��ɫ");
		a1.name = "�л���԰è";
		a1.age =7;
		a1.color="�ư�ɫ";
		a1.sleep();
		a2.climb();
		
	}
}
class Cat{
	String  name;
	int age;
	String color;
	
	public Cat(){} //�޲ι���
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
// 07 ��ѡ�� c ���10 20
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
	   classA.method();       // ��ӡ 10
	   classA.method(20);     // ��ӡ 20
	} 
}
//��������+��������ֵ
// 08 ����ͨ���� ��Ϊmethod(int i)�ķ���ֵ������int�����践��һ����
class ClassB{    
    void method(){   
        System.out.println("method()");   
	}  
	void method(int i){       //��int �ĳ� void
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
	  System.out.println(" Aÿ�����ж�������һ�����췽�� ");	
	  System.out.println(" Bһ�����п����ж�����췽��?  ");	
	  System.out.println(" D���췽�������ж������");	
	}
}
class work10{
	public static void main(String[] args){
		System.out.println(" �����췽�����ص㣺 ");	
	    System.out.println(" ���췽������Ҫ��������ȫ��ͬ ");	
	    System.out.println(" û�з���ֵ����  ");	
	    System.out.println(" ��������ʱ���������췽���ĵ��ã�����ͨ���ֶ����ã��ڶ�����������Զ�����һ��");
	}
}
class work11{
	public static void main(String[] args){
		System.out.println(" ����������ʲô���Լ��������ص�Ҫ��");	
		System.out.println(" ���������Ƿ���������ͬ�������б�ͬ�����͡�������˳�򣩵ķ���");	
	    System.out.println(" Ҫ�󣺷���������ͬ�������б�ͬ�����͡�������˳�� ");	
	   
	}
}
//12 ��(���캯��)
class MyClass{  
    int value;
	public MyClass(){}
	public MyClass(int n){
		value = n;
	}
}  
class TestMyClass{  
 // �����вι��캯���� ������ Ϊ 0 10
    public static void main(String args[]){ 
        MyClass mc1 = new MyClass();  
        MyClass mc2 = new MyClass(10);  //�����޸��вι��췽��
        System.out.println(mc1.value); 
        System.out.println(mc2.value);
    } 
}
// 13 �⣨����������������ע�ͣ���������벹������
//����һ��Dog �� 
class Dog2{    
     //����һ��name ���ԣ�������ΪString ���� 
	String name;
	 //����һ��age ���ԣ�������Ϊint ����
	int age;    
	 //����һ��sexual ���ԣ�������Ϊboolean ����    
	 //true ��ʾΪ����false ��ʾΪĸ   
	 boolean sex;
	
	 public Dog2(){}    
	 public Dog2(String _name, int _age, boolean _sexual){ 
	 //�ֱ���ݲ���������Dog �������
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
        
        //����һ��Dog �������ô������Ĺ��캯��
        //����Ϊjoy������Ϊ2 �꣬�Ա�Ϊĸ
        Dog2 d = new Dog2("joy",2,false)  ;       
		//����Dog �����޲ε�play ������
        d.play();;        
		//����Dog �����вε�play ����������Ϊ30
        d.play(30);
	}
}

//14 �⣨���󴴽����̣�
// ��   C.���?ClassA()?ClassC()?ClassB()? 
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
 
//15�⣨������������дһ��Worker�࣬���������Worker����
class work15{
	
	public static void main(String[] args){
		Worker w1 = new Worker(121,"����",18,3500);
		Worker w2 = new Worker(122,"����",28,3300);
		Worker w3 = new Worker(123,"����",38,3900);
		Worker w4 = new Worker(124,"����",29,3700);
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
		System.out.println(name+"����8Сʱ");
	
	}
	public void work(int hour){
		System.out.println(name+"����"+hour+"Сʱ");	
	}
}
// 16 �⣨����������������һ��Address�࣬�������£�
class Address{
	String address;
	String zipCode;
	public Address(){}
	public Address(String ad,String zip){
		address= ad;
		zipCode= zip;
	}
}


// 17 ��
 class WorkerArrayTest{  

    public static void main(String[] args){                
        //1������һ��Ԫ��ΪWorker���͵����鳤��Ϊ3
		Worker [] work = new Worker [3];
		
		//2������3��Worker���� �����浽������
		work[0]=new Worker( 121,"����",18,3500);
        work[1]=new Worker( 122,"����",28,3300);
	    work[2]=new Worker( 123,"����",38,3900);
	    
	    //3���������飬������ÿһ��Worker������޲�work����
        for(int i = 0; i< work.length;i++){
			work[i].work();
		}
	    //4������oldWorker����
		System.out.println(oldWorker(work).name);
    }
	
    // дһ������ oldWorker �������鷵�������������Worker����
	// �β�ΪWorker[]����  ����ֵΪWorker����   
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

// 18 ��  ����һ��Company�࣬��������һ��Worker[]�������ԣ�������Worker����

 class T18 {
	public static void main(String[] args) {
		
	}
}
class Company{
	
	Worker[] ws = new Worker[16]; 
	
	int count = 0;//��¼ws����Ч��Ԫ�ظ���
	
    //������Worker����   
	public void addWorker(Worker w){     
	    // ���ws����������
	    if(ws.length==count){
		    System.out.println("��Ҫ����");
	    }else{//���w
		    for(int i=0;i<ws.length;i++){
			    if(ws[i]==null){
				   ws[i]=w;
			    }
		    }
	    }	
        //��count����1    
	}
    //��ɷ��� ����ÿ�¹�˾��Ҫ֧����н��  
	public double getAllSalaries(){
        //�������飬�������ܶ�   
		int sum = 0;
	    for(int i=0;i<ws.length;i++){
		   sum+=ws[i].salary;
	    }
	    return sum;
    }
	
    //��ɷ��� �ж�һ��������Worker�����Ƿ����ڵ�ǰ��˾��ͨ��id�жϣ� 
	public boolean contains(Worker w){
		
        //������������ж�
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
		System.out.println(" �ֲ�������ʵ������������");
		/*
		�ֲ������������ں����ڲ�����Ĭ��ֵ�����÷�Χ�Ӷ����е�������Ĵ���������������������
		ʵ������������������ڲ��������ⲿ����Ĭ��ֵ�����÷�Χ������Ч������ֲ������������ֲ���������
		*/

	}
}
class work20{
	public static void main(String[] args){
		System.out.println(" ���󴴽��Ĺ���");	
		/*
		1. ����ռ� 
		����һ���������ڴ���Ϊһ���������һ����������
		�ڷ���ռ��ͬʱ����Ѷ������е�������ΪĬ��ֵ
		2. ��ʼ������ �ڶ���ʵ��������ͬʱ��Ϊʵ�����������˸�ֵ����ֵ�������һ����ִ��
        3. ���ù��췽�� 
		�Ըö�����ù��췽��
		*/
	}
}