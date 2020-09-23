package com.home;

public class MyExceptionC extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyExceptionC(String s) {
		System.out.println("Object does not exist " +s);
	}

}
