package com.practice;
class Task1 extends Thread{
	public Task1(String name){
		super(name);
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+currentThread().getName());
		}
	}
	
}
class Task2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=11;i<20;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
		
	}
	
}
public class BasicThreads {
public static void main(String[] args) throws InterruptedException {
	Task1 task1=new Task1("vin");
    
    Task2 task2=new Task2();
    Thread thread=new Thread(task2);
    task1.start();
    task1.join();
    task1.sleep(1000);
    thread.start();
    thread.join();
    System.out.println(Character.isDigit('8'));
    System.out.println(Character.getNumericValue('4'));
}
}
