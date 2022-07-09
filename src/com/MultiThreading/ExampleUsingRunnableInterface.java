package com.MultiThreading;

public class ExampleUsingRunnableInterface implements Runnable{

	public void run() {
		int i=1;
		while(i<11) {
			System.out.println("hello");
			i++;
		}
	}

	public static void main(String[] args) {
		
		ExampleUsingThreadClass t = new ExampleUsingThreadClass();
		Thread thread = new Thread(t);
		thread.start();
		int i=1;
		while(i<11) {
			System.out.println("world");
			i++;
		}

	}

}
