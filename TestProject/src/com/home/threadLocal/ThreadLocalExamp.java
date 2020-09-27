package com.home.threadLocal;

public class ThreadLocalExamp {

	public static void main(String[] args) throws InterruptedException {
 
		ThreadClass runnable1  = new ThreadClass();
		Thread t1 = new Thread(runnable1,"First Thread");
		Thread t2 = new Thread(runnable1,"Second Thread");
		
		t1.start();
		t1.join();
		t2.start();
        t2.join();
		

	}
	
	
	

}


class ThreadClass implements Runnable{
   private int counter;
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			counter++;
		
		System.out.println(Thread.currentThread().getName()+"  "+counter);
		}
	}
	
	class ThreadLocalClass implements Runnable{
		   private ThreadLocal<Integer> counter = new ThreadLocal<Integer>();
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
                     counter.set(i);				
				System.out.println(Thread.currentThread().getName()+"  "+counter);
				}
			}
	
	
}
	
}