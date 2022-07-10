package com.MultiThreading;

public class MultiThreadingMethods extends Thread{
	
	public MultiThreadingMethods(String name) {
		super(name);
		setPriority(MAX_PRIORITY);
		}
	
	public void run() {
		int i=1;
		while(true) {
			System.out.println("My Thread "+i);
			i++;
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		MultiThreadingMethods thread= new MultiThreadingMethods("My thread 1");
		System.out.println("ID "+thread.getId());
		System.out.println("Name "+thread.getName());
		System.out.println("Priotity "+thread.getPriority());
		System.out.println("State "+thread.getState());
		System.out.println("IS Alive "+thread.isAlive());
		//thread.setDaemon(true);
		thread.start();
		//thread.interrupt();
		//System.out.println("State "+thread.getState());
		//System.out.println("IS Alive "+thread.isAlive());
		//Thread mainThread = Thread.currentThread();
		//mainThread.join();
		int i=1;
		while(true) {
			System.out.println("Main Thread "+i);
			i++;
			//Thread.yield();
		}
	}

}
