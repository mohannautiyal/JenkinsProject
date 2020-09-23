package com.home.threadLocal;

public class ThreadLocalTest {

	public static void main(String[] args) {

		// Creating thread local variable
		ThreadLocal t1 = new ThreadLocal();
		t1.set("My First Thread Local Variable");
		String t1_val = (String) t1.get();
		
		System.out.println(t1_val);
		
		//Creating with generics
		
		ThreadLocal<String> t2= new ThreadLocal<String>();
		t2.set("Type safe thread local variable");
		System.out.println(t2.get());
		
		// Thread Local with some initial value
		
		ThreadLocal<String> mythreadLocal = new ThreadLocal<String>() {
			 protected String initialValue() {
			        return String.valueOf(2345);
			    }
		};
		
		System.out.println(mythreadLocal.get());
	}

}
