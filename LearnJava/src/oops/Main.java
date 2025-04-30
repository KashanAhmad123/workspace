package oops;

public class Main {

	public static void main(String[] args) {
		A ob= new A();
		
		
		B ob1= new B(); /* <--- At runtime     */
		ob1.conShow(); //<--- Dynamic method dispatch at compile time
		ob1.showB();
		ob1.show();
		//ob.show();
		
		
		B ob2= new C();
		ob2.show();

	}

}
