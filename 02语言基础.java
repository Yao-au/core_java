/*
●强制类型转换
●自动类型提升
●运算符
●Scanner
●import
●条件分支 
*/
import java.util.Scanner;
class work01{
	//1-100的总和
	public static void main(String[]args){
		int a=1;
		int sum = 0;
		while(a<=100){
			sum+=a;
			a++;
		}
		System.out.println(sum);
	}
}

class work02{
	//1-100 的奇数和
	public static void main(String[]args){
		int a=1;
		int sum = 0;
		while(a<=100){
			sum+=a;
			a+=2;
		}
		System.out.println(sum);
	}
} 
class work021{
	//1-100 的奇数和
	public static void main(String[]args){
		int a=1;
		int sum = 0;
		do{
			sum += a;   
			a+=2;			
		}while(a<=100);
		System.out.println(sum);
	}
} 
class work03{
	// 0-200 能被4 和7 整除的数
	public static void main(String[]args){
		int i = 0;
		while(i<=200){
			if( (i%4==0 )&& (i%7==0)){
				System.out.println(i); 
			}
			i++;
		}
	}
}
class work03{
	// 0-200 能被4 和7 整除的数
	public static void main(String[]args){
		int i = 0;
		while(i<=200){
			if( (i%4==0 )&& (i%7==0)){
				System.out.println(i); 
			}
			i++;
		}
	}
}
class Test02{
	public static void main(String []args ){
		Scanner sc = new Scanner(System.in);
	System.out.println("请输入一个整数：（是否为偶数）");
	int a = sc.nextInt();
	if (a%2==0){
		System.out.println("该整数"+a+"是一个偶数");	
	  }else{
		System.out.println("该整数"+a+"不是一个偶数"); 
	  }
	}
	
}
class Test06{
	public static void main(String []args){
		System.out.println("请输入任意一个三位数n：");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();  //输入一个三位数 整数
		int a = n/100; // 百位数
		int b = n%100/10; // 十位数
		int c = n%10;// 个位数
		System.out.println("三位数"+n+"的百位数是"+a);
		System.out.println("三位数"+n+"的十位数是"+b);
		System.out.println("三位数"+n+"的个位数是"+c);
	}
}
class Test10{
	public static void main(String []args){		
		Scanner sc =new Scanner (System.in);
		System.out.print("请输入结果总数量：");
		int n = sc.nextInt();
		System.out.print("请输入单页显示数量：");
		int m = sc.nextInt();		
		int temp;  // 定义总页数temp  
		if (n%m==0){//结果总数量刚好是单页显示数量的倍数
			temp = n/m;
		}else{			
		    temp = n/m+1 ;  // +1 表示 多余几条另起一页
		}
		 System.out.println("结果一共"+n+"条,每页显示"+m+"条,分为"+temp+"页显示");
		 System.out.print("请输入你要查询的页码：");
		 int i = sc.nextInt();
		while( i >temp){
			System.out.print("输入错误，请输入不大于"+temp+"的页码数：");
			 i = sc.nextInt();
		}
		if (i<temp){
			int a= (i-1)*m+1;
			int b= i*m;
			System.out.println("显示第"+a+"条到第"+b+"条");		
		}else{
			int a= (i-1)*m+1;
			System.out.println("显示第"+a+"条到第"+n+"条");
		}		
	}
}
class Test10_2{
	public static void main(String []args){		
		Scanner sc =new Scanner (System.in);
		System.out.print("请输入结果总数量：");
		int n = sc.nextInt();		
		System.out.print("请输入单页显示数量：");
		int m = sc.nextInt();	
		int temp;  // 定义总页数temp  
		if (n%m==0){//结果总数量刚好是单页显示数量的倍数
			temp = n/m;
		}else{			
		    temp = n/m+1 ;       // +1 表示 多余几条另起一页
		}
		 System.out.println("结果一共"+n+"条,每页显示"+m+"条,分为"+temp+"页显示");
		 System.out.print("请输入你要查询的页码：");
		 int i = sc.nextInt();
		while( i >temp){        //限制输入的页码在页数范围内
			System.out.print("输入错误，请输入不大于"+temp+"的页码数：");
			 i = sc.nextInt();
		}
		int start= (i-1)*m+1;
		int end= i*m;
		end = end >n? n:end;    //如果 end 大于 n，就把n赋给 end 
		System.out.println("显示第"+start+"条到第"+end+"条");			
	}
}
class Test11{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的零钱：");
		int money = sc.nextInt();
		if (money>200){
			System.out.println("我有两百，可以借你198");
		}else{
			System.out.println("我没有两百，不借");
		}
	}	
}
class Test12{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = sc.nextInt();
		if (age<6){
			System.out.println("儿童");
		}else if(age <= 13){
			System.out.println("少儿");
		}
		else if(age<= 17){
			System.out.println("青少年");
		}
		else if(age <= 35){
			System.out.println("青年");
		}
		else if( age <= 50){
			System.out.println("中年");
		}else{
			System.out.println("老年");
		}
	}	
}
class Test13{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		
	switch(num){
		 case 1:
		     System.out.println("福娃贝贝");
		     break;
		 case 2:
		     System.out.println("福娃晶晶"); 
			 break;
		 case 3:
		    System.out.println("福娃欢欢");
			break;
		 case 4:
		    System.out.println("福娃迎迎");
			break;
		 case 5:
		    System.out.println("福娃妮妮");
			break;
		 default :
		     System.out.println("北京欢迎你");
			 break;		 
	   }
	}
}
/*
读入一个表示年份的整数，判断这一年是否是闰
*/
class Test14{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		if(year%4==0&&year%100!=0){
			System.out.println(year+"是闰年");
		}else if(year%100==100&&year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}
}
/*
（if?语句）中国的个税计算方法：
*/
class Test15{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的工资：");
		double wage = sc.nextInt();
		double insurance = 262;
		double tax= 0;
		double realwage= 0;
		double rate=0;
		double  cut=0;
		if (wage<3500){
			System.out.println("你好，你不需要纳税");
		}else if(wage<=5000 ){
			 rate=0.03;
			 cut =0;			 
		}else if( wage<=8000){
			 rate =0.1;
			 cut = 105;			 
		}else if(wage<=12500 ){
			 rate=0.2;
			 cut = 555;
			 realwage =(wage -tax-insurance);
		}else if( wage<=38500){
			 rate = 0.25;
			 cut =1005;			 
		}else if(wage<=58500 ){
			 rate = 0.3;
			 cut =2755;
		}else if( wage<=83500){
			 rate =0.35;
			 cut =5505;			
		}else{
			 rate =0.45;
			 cut =13505;
		}
		tax =(wage-insurance-3500)* rate-cut ;
		realwage = wage - tax -insurance;		
		System.out.println("你需要纳税"+tax+"元整");
		System.out.println("你的实发工资为"+realwage+"元整");
		
	}
}
/*
输入一个数字，然后判断这个数字能否被5、6整除
*/
class Test16{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int number = sc.nextInt();
		if(number%5==0 ||number%6==0){
			System.out.println(number+"能被5、6整除");
		}else{
			System.out.println(number+"不能被5、6整除");
		}
	}
}
/*
输入一个1~7之间的整数，判断并输出对应的是周几
*/
class Test17{
	public static void main(String[]args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("请输入一个数字");
	   int m1 = sc.nextInt();
	   switch(m1){
		   case 1:
		       System.out.println("今天是周一");
			   break;
		   case 2:
			   System.out.println("今天是周二");
			   break;
		   case 3:
			   System.out.println("今天是周三");
			   break;  
		    case 4:
			   System.out.println("今天是周四"); 
			   break;
			case 5:
			   System.out.println("今天是周五");
			   break;  		
            case 6:
			   System.out.println("今天是周六");
			   break;  			   			   
			default:
			   System.out.println("今天是周末");
			   break;
	   }	   
	   System.out.println("程序运行结束...");
	}
}







