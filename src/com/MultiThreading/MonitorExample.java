package com.MultiThreading;

public class MonitorExample {
	public static void main(String[] args) {
		MyData d = new MyData();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);
		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread{
	MyData d;
	MyThread1(MyData data){
		d=data;
	}
	public void run() {
		d.display("Hello World ");
	}
}

class MyThread2 extends Thread{
	MyData d;
	MyThread2(MyData data){
		d=data;
	}
	public void run() {
		d.display("Welcome Home ");
	}
}

class MyData {
	synchronized void display(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
}
