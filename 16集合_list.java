package p16;
import java.util.*;
/*I. 创建一个List，在List 中增加三个Worker对象，基本信息如下
	姓名 年龄 工资
	zhang3 18 3000
	li4 25 3500
	wang5 22 3200
	注意：将每一行信息封装成一个Worker对象，并添加到List中
	II. 在li4 之前插入一个Worker对象，信息为：姓名：zhao6，年龄：24，工资3300
	III. 删除下标为2的Work对象
	IV. 利用for 循环遍历，打印List 中所有工人的信息
	V. 利用for­each遍历，对List 中所有的工人调用work 方法。
	VI. 为Worker 类添加equals 方法*/
class Test5 {
	public static void main(String[] args) {
		//创建三个Worker对象
		Worker ws1 = new Worker("zhang3",18,3000);
		Worker ws2 = new Worker("li4",25,3500);
		Worker ws3 = new Worker("wang5",22,3200);
		//创建一个List类型引用
		List<Worker> list = new ArrayList<>();
		//添加对象
		list.add(ws1);
		list.add(ws2);
		list.add(ws3);
		//在李四之前插入一个新对象，即在下标为1处添加新对象
		list.add(1,new Worker("zhao6",24,3300));
		//删除下标为2的元素
		list.remove(2);
		//for循环遍历list
		for(int i = 0; i < list.size(); i++){
			Worker s = list.get(i);
			s.work();
		}
		
		//使用for—each 遍历
		for(Worker w: list){
			w.work();
		}
		
	}
	
}
class Worker {
	private int age;
	private String name;
	private double salary;
	//写一个工作方法
	public void work(){
		System.out.println(name + "work");
	}
	
	@Override
	public String toString() {
		return "Test5_Worker [age=" + age + ", name=" + name + ", salary="
				+ salary + "]";
	}
	public Worker(String name,int age,  double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		int result = age + (int)salary;
		if(name == null){
			return result;
		}
		return result + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker t = (Worker) obj;
		if (age != t.age)
			return false;
		if(!name.equals(t.name)
			return false;
		if (salary != t.salary)
			return false;
		return true;
	}
}
/**(List)
	class Animal{ }
	class Dog extends Animal{
		public void play(){
			System.out.println("Dog play with you");
		}
	}
	class Cat extends Animal{ }
	public class TestAnimal{
		public static void main(String args[]){
			List<Animal> as = new ArrayList<Animal>();
			as.add(new Dog());
			as.add(new Cat());
			as.add(new Dog());
			as.add(new Cat());
			List<Dog> dogs = getAllDog(as);
			//使用2种方式遍历dogs集合，并调用每一个Dog对象的paly方法
		}
		public static List<Dog> getAllDog(List<Animal> animals){
		}
	}
	程序填空：
	完成getAllDog 方法，从一个Animal集合中挑选出所有的Dog对象，并把这些对象
	放在一个Dog 集合中返回。
*/
class Test6 {
	public static void main(String args[]){
		List<Animal> as = new ArrayList<Animal>();
		as.add(new Dog());
		as.add(new Cat());
		as.add(new Dog());
		as.add(new Cat());
		List<Dog> dogs = getAllDog(as);
		//使用2种方式遍历dogs集合，并调用每一个Dog对象的paly方法
		//使用循环遍历
		for(int i = 0; i < dogs.size(); i++){
			System.out.println(dogs.get(i).getClass());
		}
		
		for( Dog d : dogs){
			System.out.println(d.getClass());
		}
		
	}
	public static List<Dog> getAllDog(List<Animal> animals){
		//创建一个dog类型的list
		List<Dog> lis = new ArrayList<>();
		//遍历数组找到dog并把dog的对象移到lis数组中
		for(int i = 0; i < animals.size(); i++){
			if(animals.get(i) instanceof Dog){
				lis.add((Dog)animals.remove(i));
			}
		}
		return lis;
	}
}
class Animal{ }
class Dog extends Animal{
	public void play(){
		System.out.println("Dog play with you");
	}
}
class Cat extends Animal{ }
