package p1;
import java.util.Scanner;
class work01{
	//1.дһ������add����������������Ϊ���������������������ĺ�
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
	//дһ������������һ����������ӡ������������������ӡ�

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
	
	//дһ������������һ������n������1+2+3+��+n?�ĺ�

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
	
	//дһ������������һ����������n����ӡ��n?��HelloWorld

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
	
	//дһ������������һ��������������������Ǽ�λ��

	public static void main (String[]args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������һ������");
		int n = sc.nextInt();
		int result = count(n);
	    System.out.println(n+"��"+result+"λ����");
		
	}
	/*
	��㷽��
	public static int count(int n){
	  int counts=0;
	  for(int i=n;i>0;i/=10){
		 counts++; 
	  }
	  return counts;
	}
	
	*/
	public static int count(int n){
		int count = 1;  //��������ʼ��Ϊ "1",
		if(n/10==0){    // ������С��10��������Ϊ0��
			 return count;   //���� ֻ��һλ���������ΪĬ��ֵ1����������
		}else{
			while (n/10!=0){  // n���ڻ����10
				count+=1;     //��һ�� ����������1��Ŀǰ��������λ��
				n/=10;        /*n��10������10->1 ;123->12; ������һ��ѭ����
			                     �����10->1����һ�� �жϲ�ͨ������ֻ����λ                                          */          
		    }
		}
		return count; 
	}
}
class work06{
	
 //(����Ƕ��)��ӡ���е���λ��������λ��������ÿλ���ֵĽ׳�֮��
	public static void main (String[]args ){
		printTh();  //�������ڵ��� printTh()����
	}
	public static void printTh( ){
		for(int i= 100;i<1000;i++){
			
			 int a= i/100;   //��λ��
			 int b =i/10%10;  //ʮλ��
			 int c= i%10;    //��λ��
			 int sum = a*a*a+b*b*b+c*c*c;		 	
            if(sum==i){
				 System.out.println(i);
			}	
	    }
	}
}	
class work07{	
/*(����Ƕ��)�������A��ȫ�����ӣ�����1��������A����֮�͵���B��
������B��ȫ�����Ӱ���1��������B����֮�͵���A,�������A\B��һ����������
��ӡ��3000���ڵ�ȫ����������*/

	public static void main (String[]args ){
		printCloseNum();	
	}
	/*
	public static void printCloseNum (){   
	    for(int i=2; i<3000;i++){   //��ѭ����һһ����3000���ڵ���
		    int m = factorSum(i);   //m�����Ӻ�
		    for(int j=2; j<3000;j++){   ����3000���ڵ���
				int n = factorSum(j);
                if (m==j && n==i &&  i<j){  //i<j,�����ظ���� 
				     System.out.println(i+"��"+j+"��������");  // ���i
					 break;
			    }                 	 			
			} 						
	    }
	}*/
	// ���㷨 ����ѭ�� ����˼ά
	public static void printCloseNum (){ 
	
	   // A  -> B(A�������ܺ�) ->  C(B�������ܺ�)  ->  A
		
	    for(int i=2; i<3000;i++){   //��ѭ�������� i=A
		    int j = factorSum(i);  //  ��A�����Ӻ� B
		    int k = factorSum(j);  // ���� B�� ���Ӻ� C
            if (i==k && i<j){      //���  C���� A
			System.out.println(i+"��"+j+"��������");                 	 			
			} 						
	    }
	}
	
	// ��һ�������������ӵĺ�
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
     //(����Ƕ��)��֤��°ͺղ��룺
     //�κ�һ������6��ż�������ֽܷ�����������ĺ͡�
     //Ҫ������ һ�������������� ���ܱ� �ֽ�������������ĺ͡�  
	public static void main (String[]args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������һ������6��ż������֤��°ͺղ��룺");
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
			
			//�����һ�� ������������һ��������������
		    if(n==1|| n%i==0){			 
				 return false;  
			}	
		}
		return true;  // ѭ����ϣ�û�г�1 ������������ ���κ����ӣ���������
    }
}


class work09{
	//쳲��������еĵ�1�͵�2�����ֱ�Ϊ1��1��
	//�ӵ���������ʼ��ÿ����������ǰ������֮�ͣ�1,1,2,3,5,8,13����
	//д��һ������������һ������ʾ������ţ����ض�Ӧ��������е�ֵ

	public static void main (String[]args ){
		
		System.out.println("����������һ��λ��,�������λ�õ�쳲���������");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = febo(n);
		System.out.println(result);
	}
	// ����쳲���������nλ���ϵ���ֵ
	public static int febo(int n){
		
		//��һ�͵ڶ���λ�õ�쳲�����������1
		if(n== 1 || n == 2){
			return 1;      //���н�������ʼ"��"
		}
		//
		return febo(n-1)+febo(n-2);
	}
}
	

class work10{
	     
	//дһ������������һ������n���ж�������ǲ���������
	//��������ֻ�ܱ�1������������ ����Ȼ����1������������

	public static void main (String[]args ){
		
		System.out.println("����������һ������,�����ж����Ƿ���������");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(primeNum(n));    //���ú���
	  
	}
	public static boolean  primeNum( int n){
		
		for(int i= 2;i<n;i++ ){
			
			//�����һ�� ������������һ��������������
		    if(n==1|| n%i==0){			 
				 return false;  
			}	
		}
		return true;  // ѭ����ϣ�û�г�1 ������������ ���κ����ӣ���������
		
	}
	
}












