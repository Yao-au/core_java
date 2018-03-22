/**
● 异常的概念和分类
● 异常的产生和传递
● 异常的处理
● 自定义异常
*/
package p15;
import java.io.*; 
import java.sql.*; 

public class Test1 {
   public static void main(String []args){
	   System.out.println("我F你的ycy！");
	  // work1
	  /*java中所有的错误都继承自 Throwable 类，在该类的子类中，Error 
	    类表示严重的底层错误， 对于这类错误，一般的处理方式是 不做任何处理 ；
	  Exception类表示例外、异常。*/
	   
	   // work2
	  /*I. 异常类java.rmi.AlreadyBoundException，从分类上说，
	         该类属于（已检查）异常， 从处理方式上说，对这种异常 （必需）处理。
	    II. 异常类java.util.regex.PatternSyntaxException，
	   从分类上说，该类属于（未检查）异常，从处理方式上说，对这种异常（不必）处理。
      */	   
   }
}
//work3
class TestThrow{   
	public static void main(String args[]){ 
		throwException(10);   
	} 

    public static void throwException(int n){  
    	if (n == 0){     
    		//抛出一个NullPointerException   
    		throw new NullPointerException();
    	}else{    
    		//抛出一个ClassCastException  
    		//并设定详细信息为“类型转换出错”   
    		
    		// 利用构造方法来设置 Throwable 中的message属性
    		throw new ClassCastException("类型转换出错");    		
    	}   
    } 
}
// work 4 （try catch final）
class TestException{
	public static void main(String []args){
		System.out.println("main 1");
		int n=1;
		
		ma(n);
		System.out.println("main 2");
		
	}
	public static void ma(int n) {
		try{
			System.out.println("ma1");
			mb(n);
			System.out.println("ma2");
		}catch(EOFException e){
			System.out.println("catch EOFException");
		}catch(IOException e){
			System.out.println("catch IOException");
		}catch(SQLException e){
			System.out.println("catch SQLException");
		}catch(Exception e){
			System.out.println("catch Exception");
		}finally{
			System.out.println("in finally");
		}
		
	}
	 public static void mb(int n) throws Exception{  
		 System.out.println("mb1"); 		 
         if (n == 1) throw new EOFException();  
         if (n == 2) throw new FileNotFoundException();    
         if (n == 3) throw new SQLException();  
         if (n == 4) throw new NullPointerException(); 
         
          System.out.println("mb2");  
     } 
}
//输入1-4
/*main 1
ma1
mb1
catch EOFException/FileNotFoundException/
      SQLException/NullPointerException
in finally
main 2*/

//输入5
/*main 1
ma1
mb1
mb2
ma2
in finally
main 2*/

//work5
class MyException1 extends Exception{
	public MyException1(){
		
	}
    public MyException1(String s){
		super(s);
	}
}

class MyException2 extends RuntimeException{
    public MyException2(){
		
	}
    public MyException2(String s){
		super(s);
	}
}


class Test6{
	public static void main(String[]args) throws Exception{
		int n= 1;
		try{
			 m(n);
		}catch(MyException1 ex1){
			//输出ex1 详细信息的方法调用栈信息
						ex1.printStackTrace();
		
		}catch(MyException2 ex2){
			//输出ex2 的详细信息
			System.out.println(ex2.getMessage());
			//并把ex2 重新抛出
			throw ex2;
		}
	}
	
	
	public static void m(int n) throws MyException1,MyException2  {//声明·抛出MyException1
		if(n==1){
			//抛出MyException1
			throw new MyException1("n==1");
			//并设定其详细信息为“n == 1”
		}else{
            //抛出MyException2
			throw new MyException2("n==2");
			//并设定其详细信息为“n == 2”
		}
	} 
}

// 第七题
class MyException extends Exception {}

class Test7{
	public static void main(String args[]) throws Exception{
		ma();
	}

	public static int ma() throws Exception { 
    	try{         
    		m();  
    	    return 100;  
    	}catch(MyException  e){   
    		System.out.println("Exception"); 
    		return 0;
        }catch(Exception e1){    
        	System.out.println("MyException"); 
        	return 0;
        }
    }

	public static void m() throws  MyException{
		throw new MyException();
	}
}
// work 8
// 在//1 处，填入以下(_ABC)代码可以编译通过，在//2 处，填入(_D)代码可以编译通过

//work9  // 答案 A 编译不通过

// work 10

class TestFinally{ 
	 public static void main(String args[]){   
		System.out.println ( ma() );  
	 }    
	 public static int ma(){ 
        int b=100;     
        //读入b         
        try{          
    	       int n = 100;   
    	       return n/b;      
    	   }catch(Exception e){       
    		   return 10;       
    	   }finally{        
    			   return 100;    
    			  
        } 
	} 
}

// 答案 在ma中，当读入的b为100时，输出结果为(100)，当读入的b为0时，输出结果为(100)。

// work11
class TestTryFinally{ 
	public static void main(String args[]){    
		try{        
    ma();     
    }catch(Exception ex1){ 
}     }    
	public static void ma() throws Exception {  
		int n = 10;      
		int b=0;       
		     
		try{     
			System.out.println("ma1");   
			int result = n / b;   
			System.out.println("ma2 " + result); 
	
        }finally{       
            System.out.println("In Finally"); 
            
        }   
	} 
}
//在ma中，读入整数b，如果读入的值为10，则输出： (ma1   ma2 1    In Finally )。
// 如果读入的值为0，则输出： (ma1   In Finally) 。


class MySuper{   
    public void m() throws IOException{} 
} 

class MySub extends MySuper{  
	public void m() throws EOFException{} 
} 

class MySub2 extends MySub {  
	public void m() throws EOFException{} 
} 
// test12 无法通过编译。修改，子类抛出的异常 不能多余 父类，因为 EoFE无子类，所以MySub2 抛出EOFE

class Test13 {
	public static void main(String[]args) {
		try{
			System.out.println("main1");
			ma();
			System.out.println("main2");
		}catch(Exception e){
			System.out.println( "in catch");
		}
		
	}
	public static void  ma(){
		System.out.println("ma1");
		throw new NullPointerException();
		
		// System.out.println("ma2"); 编译出错，无法读取的代码
	}
}



class Test14{   
	
	public static void main(String args[]){     
		try{    
			ma();   
		}catch(NullPointerException npe){ //A编译通过
			
		}
		//  catch(IOException ioe){}  B. 编译通过
		// catch(SQLException sqle){} C. 编译通过
		catch(Exception e){
			
       }   
    }    
	public static void ma() throws IOException{ } 
  
}









