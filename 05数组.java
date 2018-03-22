package p1;
class work08{
	public static void main(String[]args){
		m(1,2,3,4,5);
		m();
	}
	public static void m(int ... is){
		for(int i =0;i<is.length;i++){  //遍历数组a
		    //打印数组元素不换行 加制表符隔开
		     System.out.print(is[i]+"\t");  
		}
		System.out.println();   //打印完 数组a 后换行
		
	}
}	


class work09{
	
	//给定一个数组：int[] a ={1,3,2,7,5} 
	//利用冒泡排序对其按照从小到大的顺序排序，然后输出结果。

	public static void main(String[]args){
		int[] a ={1,3,2,7,5}; 
		System.out.println("原数组为：");
		printarray(a);    //打印原数组
		System.out.println("经冒泡排序后：");		
		bubbleSort(a);    //调用冒泡排序函数
	}
	
	//冒泡排序算法函数
	//相邻两个元素比较大小，然后交换值
	public static void bubbleSort(int[]a){
	    for(int i =1;i<a.length;i++){  //循环len-1次
			for(int j =0;i<a.length-j;j++){
		        if(a[j]>a[j+1]){   //a[j]大于a[j+1]，则交换值
					int temp = a[j];  //找个中间数，来转换
					a[j]=a[j+1];
					a[j+1]= temp;				 
			    }
	        }
		}
		printarray(a);    //打印排序后的数组 
	}
	//打印数组的函数
	public static void printarray(int[]a){
	     for(int i =0;i<a.length;i++){
			 //打印 不换行 加制表符隔开
		     System.out.print(a[i]+"\t");
	        }
			System.out.println();   //打印完 数组a 后换行
	}
}

class work10{
	
    //利用选择排序对数组按照从小到大的顺序排序，然后输出结果。 
	
	public static void main(String[]args){
		int[] a ={1,3,2,7,5}; 
		System.out.println("原数组为：");
		printarray(a);    //打印原数组
		System.out.println("经选择排序后：");		
		selectSort(a);    //调用选择排序函数
	}
	
	//选择排序算法函数  
	// 固定值a[i] 与它后面的元素一一比较大小，然后交换值
	public static void selectSort(int[]a){
	    for(int i =0;i<a.length-1;i++){  //循环len-1次
			for(int j =i+1;j<a.length;j++){ //a[j]为a[i]后面的所有元素
		        if(a[i]>a[j]){
					int temp = a[i];
					a[i]=a[j];
					a[j]= temp;				 
			    }
	        }
		}
		printarray(a);    //打印排序后的数组 
	}
	//打印数组的函数
	public static void printarray(int[]a){
	     for(int i =0;i<a.length;i++){
			 //打印 不换行 加制表符隔开
		     System.out.print(a[i]+"\t");
	        }
			System.out.println();   //打印完 数组a 后换行
	}
}

class work11{
	//1.已知一个二维数组A?表示一个矩阵，求A'
	//其中，A'表示矩阵的转置。矩阵转置的含义：表示把一个矩阵行列互换。
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
		
		printArray(reverse(a)); //打印 二维数组
		
	}
	public static int[][] reverse(int [][] a){
		int [][] b = new  int  [a[0].length][a.length];
		
		for(int i = 1; i<=a[0].length;i++){  //第 i 行
			for(int j =1; j<=a.length;j++){  // 第j列
				b[i-1][j-1] = a[j-1][i-1];
		    }				
		}
		return b;
	}
	public static void printArray(int [][] a){
		for(int i = 1; i<=a.length;i++){  //打印 第 i 行
			for(int j =1; j<=a[0].length;j++){  //打印第i行 第j列
				System.out.print(a[i-1][j-1]+"\t");			
		    }
			System.out.println();		
		}
		System.out.println();	
		
	}
}









