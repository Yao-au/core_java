package p1;
import java.util.Scanner;
class work01{
	//1.写一个函数add，接受两个整数作为参数，返回这两个整数的和
	public static void main (String[]args ){
		int a = 5;
		int b = 6;
		int result = sum(a,b);
		System.out.println(result);
	}
	public static int sum(int a,int b){
		int sum = a + b;
		return sum;
	}
	
}

class work02{
	//写一个函数，接受一个整数，打印出这个整数的所有因子。

	public static void main (String[]args ){
		int a =48 ;
	    printA(a) ;
	}
	public static void printA(int a){

		for(int i = 1;i<=a; i++){
			if(a%i==0){
				System.out.println(i);
			}
		}
	}
	
}
class work03{
	
	//写一个函数，接受一个整数n，返回1+2+3+…+n?的和

	public static void main (String[]args ){
		int n = 15;
	    int result = sum(n);
		System.out.println("1+2+...+"+n+"="+result);
	}
	public static int sum(int n){
		int sum=0 ;
		for(int i=1;i<n; i++){
			sum+=i;
		}
		return sum;

	}
	
}
class work04{
	
	//写一个函数，接受一个整数参数n，打印出n?个HelloWorld

	public static void main (String[]args ){
		int n = 15;
	    printHello(n);
		
	}
	public static void printHello(int n){
		for(int i=1;i<n; i++){
			System.out.println("Hello world!");
		}
	}
	
}
class work05{
	
	//写一个函数，接受一个整数，返回这个整数是几位数

	public static void main (String[]args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入任意一个数：");
		int n = sc.nextInt();
		int result = count(n);
	    System.out.println(n+"是"+result+"位数：");
		
	}
	/*
	简便方法
	public static int count(int n){
	  int counts=0;
	  for(int i=n;i>0;i/=10){
		 counts++; 
	  }
	  return counts;
	}
	
	*/
	public static int count(int n){
		int count = 1;  //计数器初始化为 "1",
		if(n/10==0){    // 该数若小于10，则是商为0；
			 return count;   //该数 只有一位，则计数器为默认值1，结束返回
		}else{
			while (n/10!=0){  // n大于或等于10
				count+=1;     //第一次 ：计数器加1，目前该数有两位数
				n/=10;        /*n除10，比如10->1 ;123->12; 进行下一次循环。
			                     如果是10->1，下一次 判断不通过，即只有两位                                          */          
		    }
		}
		return count; 
	}
}
class work06{
	
 //(函数嵌套)打印所有的三位数，该三位数等于其每位数字的阶乘之和
	public static void main (String[]args ){
		printTh();  //主函数内调用 printTh()函数
	}
	public static void printTh( ){
		for(int i= 100;i<1000;i++){
			
			 int a= i/100;   //百位数
			 int b =i/10%10;  //十位数
			 int c= i%10;    //个位数
			 int sum = a*a*a+b*b*b+c*c*c;		 	
            if(sum==i){
				 System.out.println(i);
			}	
	    }
	}
}	
class work07{	
/*(函数嵌套)如果整数A的全部因子（包括1，不包括A本身）之和等于B，
且整数B的全部因子包括1，不包括B本身）之和等于A,则称整数A\B是一对亲密数。
打印出3000以内的全部亲密数。*/

	public static void main (String[]args ){
		printCloseNum();	
	}
	/*
	public static void printCloseNum (){   
	    for(int i=2; i<3000;i++){   //外循环，一一测试3000以内的数
		    int m = factorSum(i);   //m的因子和
		    for(int j=2; j<3000;j++){   测试3000以内的数
				int n = factorSum(j);
                if (m==j && n==i &&  i<j){  //i<j,避免重复结果 
				     System.out.println(i+"和"+j+"是亲密数");  // 输出i
					 break;
			    }                 	 			
			} 						
	    }
	}*/
	// 简单算法 单层循环 逆推思维
	public static void printCloseNum (){ 
	
	   // A  -> B(A的因子总和) ->  C(B的因子总和)  ->  A
		
	    for(int i=2; i<3000;i++){   //外循环，比如 i=A
		    int j = factorSum(i);  //  求A的因子和 B
		    int k = factorSum(j);  // 再求 B的 因子和 C
            if (i==k && i<j){      //如果  C等于 A
			System.out.println(i+"和"+j+"是亲密数");                 	 			
			} 						
	    }
	}
	
	// 求一个数的所有因子的和
	public static int factorSum(int n){
		int sum = 0;
	    for(int i = 1;i<n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;		
	}
}

class work08{
	 // 
     //(函数嵌套)验证哥德巴赫猜想：
     //任何一个大于6的偶数，都能分解成两个质数的和。
     //要求输入 一个整数，输出这个 数能被 分解成哪两个质数的和。  
	public static void main (String[]args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入任意一个大于6的偶数，验证哥德巴赫猜想：");
		int n = sc.nextInt();
		Goldbach (n);
	}
    public static void Goldbach (int n ){
		for(int i=1;i<=n/2;i++){
			int j = n-i;
			if( primeNum(i) && primeNum(j) ){
				 System.out.println(i+"+"+j+"="+n);
			}
				
		}
			
	}
	
	
	public static boolean  primeNum( int n){
		
		for(int i= 2;i<n;i++ ){
			
			//如果是一或 能整除以任意一个数，则不是质数
		    if(n==1|| n%i==0){			 
				 return false;  
			}	
		}
		return true;  // 循环完毕，没有除1 和他本身以外 的任和因子，则是质数
    }
}


class work09{
	//斐波那契数列的第1和第2个数分别为1和1，
	//从第三个数开始，每个数等于其前两个数之和（1,1,2,3,5,8,13…）
	//写出一个函数，接受一个数表示数列序号，返回对应序号中序列的值

	public static void main (String[]args ){
		
		System.out.println("请输入任意一个位置,将输出该位置的斐波那契数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = febo(n);
		System.out.println(result);
	}
	// 返回斐波那契数列n位置上的数值
	public static int febo(int n){
		
		//第一和第二的位置的斐波那契数都是1
		if(n== 1 || n == 2){
			return 1;      //运行结束，开始"归"
		}
		//
		return febo(n-1)+febo(n-2);
	}
}
	

class work10{
	     
	//写一个函数，接收一个整数n，判断这个数是不是质数。
	//（质数是只能被1和它本身整除 的自然数，1本身不是质数）

	public static void main (String[]args ){
		
		System.out.println("请输入任意一个整数,可以判断他是否是质数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(primeNum(n));    //调用函数
	  
	}
	public static boolean  primeNum( int n){
		
		for(int i= 2;i<n;i++ ){
			
			//如果是一或 能整除以任意一个数，则不是质数
		    if(n==1|| n%i==0){			 
				 return false;  
			}	
		}
		return true;  // 循环完毕，没有除1 和他本身以外 的任和因子，则是质数
		
	}
	
}












