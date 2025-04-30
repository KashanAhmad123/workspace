package oops;

public class StaticClass {
	
	static int i=99; //<-- Only referenced variable can be passed in static class or method
	
	static class def{
		void show() {
			System.out.println(i);
		}
		
	}

}
