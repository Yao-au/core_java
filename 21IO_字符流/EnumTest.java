package com.baizhi.corejava.day21;

public class EnumTest {
	public static void main(String[] args) {
		//Person p = new Person("chuyb",38,FiveElement.EARTH);
		/*FiveElement metal = FiveElement.METAL;
		
		System.out.println(metal.name()+"-->"+metal.ordinal());
		System.out.println("=====================");
		FiveElement[] fes = FiveElement.values();// 返回枚举类型中所有枚举值组成的数组
		for(FiveElement fe:fes){
			System.out.println(fe.name()+"-->"+fe.ordinal());
		}
		*/
		
		FiveElement metal = FiveElement.METAL;
		//获取metal对象的name属性值
//		metal.setName("金");
		System.out.println(metal.getName());
		System.out.println(FiveElement.WOOD.getName());
	}
}
enum FiveElement {
	METAL("金"){
		public void m(){
			System.out.println("金");
		}
	},WOOD("木"){
		public void m(){
			System.out.println("木");
		}
	},WATER(){
		public void m(){
			System.out.println("水");
		}
	},FIRE(){
		public void m(){
			System.out.println("火");
		}
	},EARTH(){
		public void m(){
			System.out.println("土");
		}
	};
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private FiveElement(String name) {
		this.name = name;
		System.out.println("(String name)");
	}

	private FiveElement(){
		System.out.println("()");
	}
	
	public abstract void m();
}
class Person {
	private String name;
	private int age;
	private FiveElement fiveElment;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, FiveElement fiveElment) {
		super();
		this.name = name;
		this.age = age;
		this.fiveElment = fiveElment;
	}
	
}


