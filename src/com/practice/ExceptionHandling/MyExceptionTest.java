package com.practice.ExceptionHandling;

public class MyExceptionTest {
	public static void main(String[] args) {
		fun1();
	}

	private static void fun1() {		
		fun2();		
	}

	private static void fun2() {
		fun3();		
	}

	private static void fun3() {
		try {
			throw new MyException();
		}
		catch(MyException e){
			System.out.println(e);
		}		
	}
}
