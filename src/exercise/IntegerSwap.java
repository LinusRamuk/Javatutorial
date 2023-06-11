package exercise;

public class IntegerSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=23;
		int b=48;
		System.out.println("integers before swapping are "+a+"  "+b);
		
	/* Logic 1:
	 * 
	 * int t;
		t=a;
		a=b;
		b=t;
		System.out.println("swapped intergers are "+a+"  "+b);
		
	//Logic 2:
	 * 	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapped intergers are "+a+"  "+b);

	//Logic 3:
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("swapped intergers are "+a+"  "+b);
		*/
		
	//Logic 4:	
		b=a+b-(a=b);
		System.out.println("swapped intergers are "+a+"  "+b);
	}

}
