package p1;
class work08{
	public static void main(String[]args){
		m(1,2,3,4,5);
		m();
	}
	public static void m(int ... is){
		for(int i =0;i<is.length;i++){  //��������a
		    //��ӡ����Ԫ�ز����� ���Ʊ������
		     System.out.print(is[i]+"\t");  
		}
		System.out.println();   //��ӡ�� ����a ����
		
	}
}	


class work09{
	
	//����һ�����飺int[] a ={1,3,2,7,5} 
	//����ð��������䰴�մ�С�����˳������Ȼ����������

	public static void main(String[]args){
		int[] a ={1,3,2,7,5}; 
		System.out.println("ԭ����Ϊ��");
		printarray(a);    //��ӡԭ����
		System.out.println("��ð�������");		
		bubbleSort(a);    //����ð��������
	}
	
	//ð�������㷨����
	//��������Ԫ�رȽϴ�С��Ȼ�󽻻�ֵ
	public static void bubbleSort(int[]a){
	    for(int i =1;i<a.length;i++){  //ѭ��len-1��
			for(int j =0;i<a.length-j;j++){
		        if(a[j]>a[j+1]){   //a[j]����a[j+1]���򽻻�ֵ
					int temp = a[j];  //�Ҹ��м�������ת��
					a[j]=a[j+1];
					a[j+1]= temp;				 
			    }
	        }
		}
		printarray(a);    //��ӡ���������� 
	}
	//��ӡ����ĺ���
	public static void printarray(int[]a){
	     for(int i =0;i<a.length;i++){
			 //��ӡ ������ ���Ʊ������
		     System.out.print(a[i]+"\t");
	        }
			System.out.println();   //��ӡ�� ����a ����
	}
}

class work10{
	
    //����ѡ����������鰴�մ�С�����˳������Ȼ���������� 
	
	public static void main(String[]args){
		int[] a ={1,3,2,7,5}; 
		System.out.println("ԭ����Ϊ��");
		printarray(a);    //��ӡԭ����
		System.out.println("��ѡ�������");		
		selectSort(a);    //����ѡ��������
	}
	
	//ѡ�������㷨����  
	// �̶�ֵa[i] ���������Ԫ��һһ�Ƚϴ�С��Ȼ�󽻻�ֵ
	public static void selectSort(int[]a){
	    for(int i =0;i<a.length-1;i++){  //ѭ��len-1��
			for(int j =i+1;j<a.length;j++){ //a[j]Ϊa[i]���������Ԫ��
		        if(a[i]>a[j]){
					int temp = a[i];
					a[i]=a[j];
					a[j]= temp;				 
			    }
	        }
		}
		printarray(a);    //��ӡ���������� 
	}
	//��ӡ����ĺ���
	public static void printarray(int[]a){
	     for(int i =0;i<a.length;i++){
			 //��ӡ ������ ���Ʊ������
		     System.out.print(a[i]+"\t");
	        }
			System.out.println();   //��ӡ�� ����a ����
	}
}

class work11{
	//1.��֪һ����ά����A?��ʾһ��������A'
	//���У�A'��ʾ�����ת�á�����ת�õĺ��壺��ʾ��һ���������л�����
	public static void main(String[]args){
		int a [][] = new int [3][4];
		a[0][0]=11;
		a[0][1]= 12;
		a[0][2]= 13;
		a[0][3]= 14;
		a[1][0]= 21;
		a[1][1]= 22;
		a[1][2]= 23;
		a[1][3]= 24;
		a[2][0]= 31;
		a[2][1]= 32;
		a[2][2]= 33;
		a[2][3]= 34;
		printArray(a);
		
		printArray(reverse(a)); //��ӡ ��ά����
		
	}
	public static int[][] reverse(int [][] a){
		int [][] b = new  int  [a[0].length][a.length];
		
		for(int i = 1; i<=a[0].length;i++){  //�� i ��
			for(int j =1; j<=a.length;j++){  // ��j��
				b[i-1][j-1] = a[j-1][i-1];
		    }				
		}
		return b;
	}
	public static void printArray(int [][] a){
		for(int i = 1; i<=a.length;i++){  //��ӡ �� i ��
			for(int j =1; j<=a[0].length;j++){  //��ӡ��i�� ��j��
				System.out.print(a[i-1][j-1]+"\t");			
		    }
			System.out.println();		
		}
		System.out.println();	
		
	}
}









