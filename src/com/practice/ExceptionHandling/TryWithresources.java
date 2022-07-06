package com.practice.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryWithresources {

	public static void main(String[] args) throws Exception{
		
		method1();

	}

	//static FileInputStream f1;
	//static Scanner sc;
	
	public static void method1() throws IOException {
		
//		try {
//		f1 = new FileInputStream("C:\\Users\\STAR\\Downloads\\Video\\test.txt");
//		sc = new Scanner(f1);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		System.out.println(a/b);
//		System.out.println(a/c);
//		}
		//here scope of resources is limited to try block only so no need to finally
		try(FileInputStream f1 = new FileInputStream("C:\\Users\\STAR\\Downloads\\Video\\test.txt");Scanner sc = new Scanner(f1)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(a/b);
			System.out.println(a/c);
		}
//		finally {
//			sc.close();
//			f1.close();
//		}
		
	}
	
}
