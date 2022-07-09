package com.MultiThreading;

public class ExampleUsingThreadClass extends Thread{
	
	public void run() {
		int i=1;
		while(i<11) {
			System.out.println("hello");
			i++;
		}
	}

	public static void main(String[] args) {
		
		ExampleUsingThreadClass t = new ExampleUsingThreadClass();
		t.start();
		int i=1;
		while(i<11) {
			System.out.println("world");
			i++;
		}

	}

}
