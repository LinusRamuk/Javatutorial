package baiscjava;

import java.util.Arrays;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2147438650;
		System.out.println(i);
		
		byte b = 127;
		System.out.println(b);
		//-128 to 127
		
		short s = 32767;
		System.out.println(s);
		//-32768 to 32767
		
		long l = 9223372036854775807l;
		System.out.println(l);
		
		float f = 10.76f;
		System.out.println(f);
		
		double d = 3242432.42343243d;
		System.out.println(d);
		
		boolean value = true;
		System.out.println(value);
		
		char c = 'n';
		System.out.println(c);
		System.out.println((int)c);
		
		String s = "Sunil";
		System.out.println(Arrays.toString(s));

	}

}
