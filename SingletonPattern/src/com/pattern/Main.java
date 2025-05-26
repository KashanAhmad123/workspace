package com.pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton sing= Singleton.getInstance();
		SecureSingleton ss= SecureSingleton.getInstance();
		
		System.out.println(sing.hashCode());
		System.out.println(ss.hashCode());

	}

}
