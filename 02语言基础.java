/*
��ǿ������ת��
���Զ���������
�������
��Scanner
��import
��������֧ 
*/
import java.util.Scanner;
class work01{
	//1-100���ܺ�
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
	//1-100 ��������
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
	//1-100 ��������
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
	// 0-200 �ܱ�4 ��7 ��������
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
	// 0-200 �ܱ�4 ��7 ��������
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
	System.out.println("������һ�����������Ƿ�Ϊż����");
	int a = sc.nextInt();
	if (a%2==0){
		System.out.println("������"+a+"��һ��ż��");	
	  }else{
		System.out.println("������"+a+"����һ��ż��"); 
	  }
	}
	
}
class Test06{
	public static void main(String []args){
		System.out.println("����������һ����λ��n��");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();  //����һ����λ�� ����
		int a = n/100; // ��λ��
		int b = n%100/10; // ʮλ��
		int c = n%10;// ��λ��
		System.out.println("��λ��"+n+"�İ�λ����"+a);
		System.out.println("��λ��"+n+"��ʮλ����"+b);
		System.out.println("��λ��"+n+"�ĸ�λ����"+c);
	}
}
class Test10{
	public static void main(String []args){		
		Scanner sc =new Scanner (System.in);
		System.out.print("����������������");
		int n = sc.nextInt();
		System.out.print("�����뵥ҳ��ʾ������");
		int m = sc.nextInt();		
		int temp;  // ������ҳ��temp  
		if (n%m==0){//����������պ��ǵ�ҳ��ʾ�����ı���
			temp = n/m;
		}else{			
		    temp = n/m+1 ;  // +1 ��ʾ ���༸������һҳ
		}
		 System.out.println("���һ��"+n+"��,ÿҳ��ʾ"+m+"��,��Ϊ"+temp+"ҳ��ʾ");
		 System.out.print("��������Ҫ��ѯ��ҳ�룺");
		 int i = sc.nextInt();
		while( i >temp){
			System.out.print("������������벻����"+temp+"��ҳ������");
			 i = sc.nextInt();
		}
		if (i<temp){
			int a= (i-1)*m+1;
			int b= i*m;
			System.out.println("��ʾ��"+a+"������"+b+"��");		
		}else{
			int a= (i-1)*m+1;
			System.out.println("��ʾ��"+a+"������"+n+"��");
		}		
	}
}
class Test10_2{
	public static void main(String []args){		
		Scanner sc =new Scanner (System.in);
		System.out.print("����������������");
		int n = sc.nextInt();		
		System.out.print("�����뵥ҳ��ʾ������");
		int m = sc.nextInt();	
		int temp;  // ������ҳ��temp  
		if (n%m==0){//����������պ��ǵ�ҳ��ʾ�����ı���
			temp = n/m;
		}else{			
		    temp = n/m+1 ;       // +1 ��ʾ ���༸������һҳ
		}
		 System.out.println("���һ��"+n+"��,ÿҳ��ʾ"+m+"��,��Ϊ"+temp+"ҳ��ʾ");
		 System.out.print("��������Ҫ��ѯ��ҳ�룺");
		 int i = sc.nextInt();
		while( i >temp){        //���������ҳ����ҳ����Χ��
			System.out.print("������������벻����"+temp+"��ҳ������");
			 i = sc.nextInt();
		}
		int start= (i-1)*m+1;
		int end= i*m;
		end = end >n? n:end;    //��� end ���� n���Ͱ�n���� end 
		System.out.println("��ʾ��"+start+"������"+end+"��");			
	}
}
class Test11{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������Ǯ��");
		int money = sc.nextInt();
		if (money>200){
			System.out.println("�������٣����Խ���198");
		}else{
			System.out.println("��û�����٣�����");
		}
	}	
}
class Test12{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䣺");
		int age = sc.nextInt();
		if (age<6){
			System.out.println("��ͯ");
		}else if(age <= 13){
			System.out.println("�ٶ�");
		}
		else if(age<= 17){
			System.out.println("������");
		}
		else if(age <= 35){
			System.out.println("����");
		}
		else if( age <= 50){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
	}	
}
class Test13{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = sc.nextInt();
		
	switch(num){
		 case 1:
		     System.out.println("���ޱ���");
		     break;
		 case 2:
		     System.out.println("���޾���"); 
			 break;
		 case 3:
		    System.out.println("���޻���");
			break;
		 case 4:
		    System.out.println("����ӭӭ");
			break;
		 case 5:
		    System.out.println("��������");
			break;
		 default :
		     System.out.println("������ӭ��");
			 break;		 
	   }
	}
}
/*
����һ����ʾ��ݵ��������ж���һ���Ƿ�����
*/
class Test14{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		if(year%4==0&&year%100!=0){
			System.out.println(year+"������");
		}else if(year%100==100&&year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
	}
}
/*
��if?��䣩�й��ĸ�˰���㷽����
*/
class Test15{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ĺ��ʣ�");
		double wage = sc.nextInt();
		double insurance = 262;
		double tax= 0;
		double realwage= 0;
		double rate=0;
		double  cut=0;
		if (wage<3500){
			System.out.println("��ã��㲻��Ҫ��˰");
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
		System.out.println("����Ҫ��˰"+tax+"Ԫ��");
		System.out.println("���ʵ������Ϊ"+realwage+"Ԫ��");
		
	}
}
/*
����һ�����֣�Ȼ���ж���������ܷ�5��6����
*/
class Test16{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int number = sc.nextInt();
		if(number%5==0 ||number%6==0){
			System.out.println(number+"�ܱ�5��6����");
		}else{
			System.out.println(number+"���ܱ�5��6����");
		}
	}
}
/*
����һ��1~7֮����������жϲ������Ӧ�����ܼ�
*/
class Test17{
	public static void main(String[]args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("������һ������");
	   int m1 = sc.nextInt();
	   switch(m1){
		   case 1:
		       System.out.println("��������һ");
			   break;
		   case 2:
			   System.out.println("�������ܶ�");
			   break;
		   case 3:
			   System.out.println("����������");
			   break;  
		    case 4:
			   System.out.println("����������"); 
			   break;
			case 5:
			   System.out.println("����������");
			   break;  		
            case 6:
			   System.out.println("����������");
			   break;  			   			   
			default:
			   System.out.println("��������ĩ");
			   break;
	   }	   
	   System.out.println("�������н���...");
	}
}







