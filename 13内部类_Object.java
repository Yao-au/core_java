package p13;
/**
��?Object?��
��?finalize?����
��?toString?����
��?equals?����
��?getClass?����
��?�ڲ���Ļ�������
*/
class work1 {
	/*��Object���У������finalize�����ڣ��������գ�ʱ���ã�
	toString()��������ֵ��ʾ�����ض�����ַ���������ʽ����
	equals ����������Ϊ���ж���������������Ƿ���ȣ���
	getClass��������Ϊ�����ض����ʵ�����ͣ���*/

}
class work2{
	/* == �ǱȽϱ�����ֵ���߶���ĵ�ַ����equals�ǱȽ϶��������*/
}

//work3
class Student{
    private int age;
    private String name;
    public Student(){}
    public Student(String name,int age) {
	    this.age = age;
	    this.name = name;
    } 
    public String toString(){
    	return name+" "+age;
    }	
}
class TestStudent{
	public static void main(String[] args){
		Student s1 =new Student();
		Student s2 =new Student("tom",18);
		System.out.println(s1);  //��ӡnull 0
		System.out.println(s2);  // ��ӡ tom 18
	}
}
// work4
class TestEquals{ 
    public static void main(String args[]){   
     	String str1 = new String("Hello");   
		String str2 = new String("Hello");  
		System.out.println(str1.equals(str2));  //��ӡ true
		System.out.println(str1 == str2); // ��ӡfalse
	} 
}
// work 5
class Animal{}
class Dog extends Animal{}
class TestGetClass{ 
    public static void main(String args[]){ 
        Animal a1 = new Dog();  
	    Animal a2 = new Animal();  
	    System.out.println(a1 instanceof Animal);   //��ӡtrue
	    System.out.println(a1.getClass() == a2.getClass());  //��ӡfalse
	}
}

//work6
//Java�е��ڲ������ A ��Ա***B��̬*** C�ֲ�*** D����***

//work7 ����equals �� toString����
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
	public String toString() {
		return "Worker's name=" + name + ", id=" + id + ",age="+age+",salary="+salary;
	}
	
	public boolean equals(Object o){
		//�ж����ҷ�ʡ
		if(this == o){return true;}
		// 2�ж�o��null
		if(o == null){return false;}
		// 3�����ж�
		if(this.getClass() != o.getClass()){
			return false;
		}
		// 4����ǿת
		Worker t = (Worker)o;
		// 5��һ�Ƚ����������Ƿ���ͬ 
		// ע�⣺����Ϊ��������ʹ��==�ж� ����Ϊ��������ʹ��equals�ж�
		if(this.id == t.id && t.name.equals(this.name)&&this.age == t.age&&this.salary == t.salary){
			return true;
		}
		return false;
	}
}
class Test7{
	public static void main(String[]args){
		Worker w1 = new Worker(20,"yyh",20,8000);
		Worker w2 = new Worker(20,"ycy",20,7000);
		System.out.println(w1);
		System.out.println(w1.equals(w2));
	}
}



//work 8 toString �ַ����ӷ�
//��� 
class Student1{ 
    private int age;  
    private String name;  
	public Student1(){}  
	public Student1(String name, int age){ 
	    this.name = name;   
	    this.age = age;  
	}   
	public String toString(){  
    	return name + " " + age;  
	} 
} 
class TestS1{   
    public static void main(String args[]){  
        Student1 stu1 = new Student1("tom", 18);   
		System.out.println(stu1+" "+100); 
		System.out.println(stu1+" "+100); 
		System.out.println(" "+stu1+100); 
	}
}
 //work 9 �ֲ��ڲ���
// �� AB D
/* class OuterClass{ 
    private int value1 = 100;  
    private static int value2 = 200; 
    public void method(int value3){
	   
        final int value4 = 400;  
		class InnerClass{     
		    public void print(){  
		       System.out.println(value4);
			   System.out.println(value1);
			   System.out.println(value2); 
           
		    }     
		}
    } 
	
}
 */
interface Light{   
     void shine(); 
} 
 //����Lamp �ࣺ 
class Lamp{   
    public void on(Light light){     
        light.shine(); 
    } 
} 
//дһ����TestLamp�����ִ������£�
class TestLamp{  
    public static void main(String args[]){  
        Lamp lamp = new Lamp();   
        //1��ʹ�þֲ��ڲ��༼��������lamp��on����Ҫ�����shine in red  
		
		class RedLight implements Light{
			public void shine(){
				System.out.println("shine in red");
			}
		}
		lamp.on(new RedLight());
		 
		  //2��ʹ�������ڲ��༼��������lamp��on����Ҫ�����shine in yellow
		lamp.on(new Light(){
	        public void shine(){
			    System.out.println("shine in yellow");
		    }
        });
       
    }
}














