package com.practice.ExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("main method");
		try {
		method1();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	
	public static void method1() {
		System.out.println("method 1");
		method2();
	}
	public static void method2() {
		System.out.println("method 2");
		method3();
	}
	public static void method3() {
		System.out.println("method 3");
		method4();
	}
	public static void method4() {
		System.out.println("method 4");
		int a = 10/0;
		System.out.println("post exception");
	}

}
