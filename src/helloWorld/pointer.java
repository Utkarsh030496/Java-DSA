package helloWorld;

import java.util.Arrays;

public class pointer {
	int a;
	String b;
	float c;
	int[] d;
	boolean e;
	String name;
	int age;
	
	//calling a constructor inside a costructor
	pointer(){
		this("Utkarsh",25);
	}
	
	pointer(String name, int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		
//		String a = "Hello";
//		String b = a;
//		a="hi";
//		System.out.println(a);
//		System.out.println(b);
//		pointer p = new pointer();
//		System.out.println(p);
//		System.out.println(p.toString());
//		System.out.println(valueOf(p));
		
		//checking pointers working in java for arrays
//		int[] a = {1,2,3,4,5};
//		int[] b = a;
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		b[1] = 100;
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		
		//checking values of objects in java without initialization 
//		pointer p = null;
//		System.out.println(p);
//		pointer[] p1 = new pointer[5];
//		System.out.println(Arrays.toString(p1));
		
		//checking values of instance variables in java without initialization
//		pointer p = new pointer();
//		System.out.println(p.a);
//		System.out.println(p.b);
//		System.out.println(p.c);
//		System.out.println(p.d);
//		System.out.println(p.e);
		
		//calling a constructor from inside of a constructor 
//		pointer p = new pointer();
//		System.out.println(p.name);
//		System.out.println(p.age);
		
		
		
	}

}
