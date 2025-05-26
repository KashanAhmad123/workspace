package com.pattern;

public class SecureSingleton {
	
	private static SecureSingleton instance;
	
	private SecureSingleton() {
		final Integer s= 33;
		System.out.println(s);
	}
	
	public static SecureSingleton getInstance() {
		
		if(instance==null) {
			synchronized(SecureSingleton.class) {
				if(instance==null) {
					instance= new SecureSingleton();
				}
			}
		}
		return instance;
	}

}
