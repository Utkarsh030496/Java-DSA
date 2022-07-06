package com.practice.ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int arr1[] = new int[2];
		System.out.println(arr1[0]);
		int[] arr = new int[] {1,0,3,4,5};
		try {
		System.out.println(arr[0]/arr[1]);
		System.out.println(arr[5]);
		System.out.println("after exception");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("after exception");
		}
	}

}
