package com.pattern;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		int value =99;
		System.out.println(value);
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance= new Singleton();
			
		}
		return instance;
	}

}
