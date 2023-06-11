package baiscjava;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
////		int i = 10;
////		i=20;
////		i=30;
////		System.out.println(i);
////		
////		int i1[] = new int[4];
////		
////		i1[1] = 10;
////		i1[2]=20;
////		i1[3]=30;
////		System.out.println(i1[1]);
////		System.out.println(i1[2]);
////		System.out.println(i1[3]);
////		
////		int length = i1.length;
////		System.out.println(length);
//		
//		int j[]= new int[4];
//		j[0]=20;
//		j[1]=21;
//		j[2]=22;
//		j[3]=25;
//		int length = j.length;
//		System.out.println(length);
//		
////		for (int i=0;i<j.length;i++)
////		{
////			if (j[i]==23) {
////			System.out.println(j[i]);
////			System.out.println("23 is present");
////			}
////		}
////		System.out.println(Arrays.toString(j));
//		int sum=0;
//		for (int i=0;i<j.length;i++)
//		{
//			sum += j[i];
//		}
//		int average = sum/length;
//		System.out.println("Average: "+average);
//		
//		
//		
//		String str[]= new String[3];
//		str[1]="string";
//		System.out.println(Arrays.toString(str));
//		
//		Object obj[]= new Object[3];
//		obj[1]="new";
//		obj[2]=25;
//		System.out.println(Arrays.toString(obj));
//		
//		
//		int a = 5;
//		int b = 0;
//		
//		for (int i=10;i>a;i--) {
//			b+=i;
//			
//		}
//		System.out.println(b);
		
		//declare two dimensional array and get their sum
		
		int a1[][]  = {{1,3,5,8},{6,3,1,9}};
		int r1[][] = {{0,0,0,0},{0,0,0,0}};
		System.out.println(a1[1][2]);
		
		for (int i=0; i<a1.length;i++) {
			for(int j=0; j<a1[i].length; j++) {
				r1[i][j]=
				System.out.println(a1[i][j]);				
			}
		}
		
		//declare 5 float values and get their sum and average
		
		float z[] = {3.4f,4.5f, 5.6f, 6.7f, 7.9f};
		float sum=0;
		for (float d:z) {
			sum = sum+d;
		}
		System.out.println("sum of float " + sum);
		float avg = sum/z.length;
		System.out.println("average is "+avg);
		
		//to check if a given value is present in array or not
		
		for (int h=0; h<z.length;h++) {
			if (z[h]==5.6f) {
				System.out.println("element is present " + z[h]);
			}
			
		}
		
		//add two 2*3 arrays and print the result
		
		int [][] mat= {{1,2,3},{4,5,6}};
		int [][] mat1= {{7,8,9},{1,2,3}};
		int [][] res= {{0,0,0},{0,0,0}};
		for (int x=0;x<mat.length;x++) {
			for (int y=0;y<mat1[x].length;y++)
			{
				res[x][y]=mat[x][y]+mat1[x][y];
				System.out.print(res[x][y] + " ");
			}
			System.out.println("");
		}
		
		//reverse array values
		
		int swap []= {7,9,4,5,6,2,3};
		int l = swap.length;
		int n=l/2;
		int temp;
		System.out.println("array length is "+l);
		System.out.println("divided length is "+n);
		for(int h=0; h<n;h++) 
		{
			temp =swap[h];
			swap[h]=swap[l-h-1];
			swap[l-h-1]=temp;
		}

		for (int ele:swap) {
			System.out.print(ele+" ");
			}
		System.out.println("");
		
		//Swap half of array values
		
				int swap1 []= {7,9,4,6,2,3};
				int l1 = swap1.length;
				int n1=l1/2;
				int temp1;
				System.out.println("array length is "+l1);
				System.out.println("divided length is "+n1);
				for(int h1=0; h1<n1;h1++) 
				{
					temp1 =swap1[h1];
					swap1[h1]=swap1[l1-n1+h1];
					swap1[l1-n1+h1]=temp1;
				}

				for (int ele:swap1) {
					System.out.print(ele+" ");
				}
				System.out.println("");
				
				
		//find min values from given array
				
				int min [] = {1,4,78,-98,-201,54};
				int valu = Integer.MAX_VALUE;
				for (int e:min) {
					if (e<valu) {
						valu=e;
					}
					
				}
				System.out.println("max value is " +valu);
				
				
		// find max value from given array
				
				int max [] = {21,-4,78,-98,-201,54};
				int val = Integer.MIN_VALUE;;
				for (int e:max) {
					if (e>val) {
						val=e;
					}
					
				}
				System.out.println("max value is " +val);
				
				
		//sort array with sort method
				
				int sort [] = {21,-4,78,-98,-201,54};
				Arrays.sort(sort);
				for (int i=0; i<sort.length;i++) {
					System.out.print(sort[i]+" ");
				}
				System.out.println("");
				
				
		//copyof method for arrays
				
				int sort1 [] = {21,-4,78,-98,-201,54};
				int newsort[] = Arrays.copyOf(sort1, 8);
				newsort[6]=21;
				newsort[7]=20;
				Arrays.sort(newsort);
				for (int i=0; i<newsort.length;i++) {
					System.out.print(newsort[i]+" ");
				}
				System.out.println("");
				
				
	}

}
