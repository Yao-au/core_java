package p1;

// ��1��
/*
Java�л������ͱ����б��棨ֵ)�������б��棨��ַ)
�������ͱ�����ֵʱ�����ݵ��ǣ�ֵ)�����ô�ֵʱ�����ݵ��ǣ���ַ)��
��������ָ��ͬһ������

*/

// ��2��
/*
this��2���÷���
  this��2���÷���
  1.this���ã���ǰʵ����������Ա������ֲ���������ʱ���ֲ���������
  ����ʹ�ó�Ա������Ӧʹ��thisǰ׺��
  2.���죨���У��ڹ��췽���ڲ�����ͬһ���е��������췽��ʱ��Ӧ�ڹ��췽��������ͨ�� this������this��ʵ�Σ�����

*/

//��3��

class MyClass{
    int value; 
}
class TestRef{
    public static void main(String args[]){
        int a = 10;
        int b = a;   //���� ֵ
        b ++ ;        
		System.out.println(a);    //  ��ӡ10
		MyClass mc1 = new MyClass();
        mc1.value = 10;   
		MyClass mc2 = mc1;    //���� ��ַ
		mc2.value ++;         //�� mc2.value ++
		System.out.println(mc1.value);   // ��ӡ 11
	} 
}
//��4 ��  �� c ���20
class ClassA{
    int value = 10; 
	} 
 class TestReturnRef{
	public static void main(String args[]){ 
	    ClassA ca = new ClassA(); 
		//�������µĶ���value = 10 +10�� �ѵ�ַ����  ca��
	    ca = getObject(); 
        //�ٴδ������¶���value=10+10��
	    //���ǰѵ�ַ����ca��������һ�εĴ�ֵ�� ca.value=20;
	    ca = getObject();  
	    ca = getObject(); 
	    System.out.println(ca.value); // ��ӡ 20
	}   
	public static ClassA getObject(){  //��ö���ķ���
		ClassA newObject = new ClassA();
		newObject.value += 10; 
		return newObject;  //newObject.value =20
	} 
}
//��5 �� ���������this��
class Dog{    
     //����һ��name ���ԣ�������ΪString ���� 
	String name;
	 //����һ��age ���ԣ�������Ϊint ����
	int age;    
	 //����һ��sexual ���ԣ�������Ϊboolean ����    
	 //true ��ʾΪ����false ��ʾΪĸ   
	 boolean sex;
	
	 public Dog(){}    
	 public Dog(String _name, int _age, boolean _sexual){ 
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
        Dog d = new Dog("joy",2,false)  ;       
		//����Dog �����޲ε�play ������
        d.play();;        
		//����Dog �����вε�play ����������Ϊ30
        d.play(30);
	}
}

// ��6 �⣨���ã������������ݣ�  �� C.���10 11 
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
// ��7 �� �����캯����this�ؼ��֣�����Ĵ�
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
	   // this(name);     //�Ĵ� �����ǹ��췽����һ�����
		this.age = age; 
	}    
	int age;  
	String name;
}


// �ڰ���  ��Day07��1-6�������࣬��ɷ�װ


class work01{
	public static void main(String [] args){
		Person p1 = new Person();
		Person p2 = new Person("Ԭ��",22,'��');
		p1.setName("Ҧ��");
		p1.setAge(21);
		p1.setSex('Ů');
		
		p1.say();
		p1.fit("�״�ү");
		p2.say();
		p2.fit("Сɷ��");
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
	//���úͻ��˽�����Եķ���
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
		System.out.println(name+ "����"+age+ "�Ա�"+sex);
	}
	public void fit(String n){
		name = n;
		System.out.println( name);
	}
}

class work02{
	public static void main(String[] args){
		Student1 s1 = new Student1(17070202,"yyh",22,'Ů',99);
		Student1 s2 =new Student1();
		s2.setId (17010101);
		s2.setName ( "��Ƚ");
		s2.setAge ( 25);
		s2.setSex('��');
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
	
	public Student1(){} //�޲ι���
	public Student1(int id,String name,int age,char sex,int score ){
		this.id =id;
		this.name = name;
		this.age = age;
		this .sex=sex;
		this.score =score;
	}
	//���úͻ��˽�����Եķ���
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
		System.out.println(name+"ѧϰ��8Сʱ");
	}
	public void study(int hours){
		System.out.println(name+"ѧϰ��"+hours+"Сʱ");
	}
}


class work03{
	public static void main(String[] args){
		Teacher1 t1 = new Teacher1(17070202,"ɵ����ʦ","ɵ�ƿγ�");
		Teacher1 t2 = new Teacher1();
		t2.setId ( 17070804);
		t2.setName("������ʦ");
		t2.setCourse("�����γ�");
		t1.teach();
		t2.teach();
	}
}
class Teacher1{
	int id;
	String  name;
	String course;
	public Teacher1(){} //�޲ι���
	public Teacher1(int id,String name,String course ){
		this.id =id;
		this.name = name;
		this.course = course;
	}
	
	//���úͻ��˽�����Եķ���
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
		System.out.println(name+"��"+course);
	}
}
class work04{
	public static void main(String[] args){
		Animal a1 =new Animal();
		Animal a2 =new Animal("����¹","Ҷ��");
		
		a1.setName("ʨ��");
		a1.setFood("��");
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
		System.out.println(name+"��"+food);
	}
}

class work05{
	public static void main(String[] args){
		Dog1 a1 =new Dog1();
		Dog1 a2 =new Dog1("���͹�",5,"��ɫ");
		a1.setName("��ʿ��");
		a1.setAge (7);
		a1.setColor("�ڰ�ɫ");
		a1.sleep();
		a2.swim();
		
	}
}
class Dog1{
	private String  name;
	private int age;
	private String color;
	
	public Dog1(){} //�޲ι���
	public Dog1(String name,int age,String color ){	
		this.name = name;	
		this.age = age;
		this.color = color;
	}
	
	//���úͻ��˽�����Եķ���
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
		Cat a2 =new Cat("�۶�è",5,"��ɫ");
		
		a1.setName("�л���԰è");
		a1.setAge (7);
		a1.setColor("�ư�ɫ");
		a1.sleep();
		a2.climb();
		
	}
}
class Cat{
	private String  name;
	private int age;
	private String color;
	
	public Cat(){} //�޲ι���
	public Cat(String name,int age,String color ){	
		this.name = name;	
		this.age = age;
		this.color = color;
	}
	
	//���úͻ��˽�����Եķ���
	//���úͻ��˽�����Եķ���
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

//�ھ���  ����װ��

//��Day07�е�Worker��Address�������е����Զ��ĳ�˽�У����ṩ��Ӧ��get/set������
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
	// ���û���˽�����Եķ���
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
		System.out.println(name+"����8Сʱ");
	
	}
	public void work(int hour){
		System.out.println(name+"����"+hour+"Сʱ");	
	}
}

class Address{
	//˽������ ��ַ
	private String address;
	//˽������ �ʱ�
	private String zipCode;
	public Address(){}
	public Address(String ad,String zip){
		address= ad;
		zipCode= zip;
	}
	
	// ���û���˽�����Եķ���
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


//��10�� ����װ��


class Student2{
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile; 
	
	// ���û���˽�����Եķ���
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


// ��11��   ʹ��day07��Teacher���Student��


class Class1{   //��������ʾһ���༶	
	Teacher   t = new Teacher();
	Student[] ss = new Student[10] ;//������Student���� 
	int count = 0;; //��ʾ��ЧԪ�ظ���  
    	
	//���Student����
	public  void addStudent(Student s){
		ss[count] = s;
		count++;
	    
	}  
	
	//����id�Ƴ�Student����
	public  void removeStudent(int id){
		for(int i =0;i<count;i++){
		   if(id == ss[i].id){
		        ss[i]= null;
		        count--;
	        }
	    }
	}
	   
	   
	 //����Student���� 
	public  void updateStudent(Student s){
		for(int i =0;i<count;i++){
		   if(s.name == ss[i].name){
		        ss[i]= s; 
	        }
	    }
	}
	
	//����id��ѯStudent����
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