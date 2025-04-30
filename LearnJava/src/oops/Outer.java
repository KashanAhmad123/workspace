package oops;

public class Outer {
	
	void show() {
		final int localinstance= 22;
		class localInner{
			void run() {
				System.out.println(localinstance);
			}
		}
		localInner object= new localInner();
		object.run();
	}

}
