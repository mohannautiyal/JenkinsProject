package com.home;

public class RunnerClass {

	public static void main(String[] args)  {
	
		try{
         throw new MyExceptionC("Testing");
		}
		catch(MyExceptionC ex) {
			ex.getMessage();
		}
	}

}
