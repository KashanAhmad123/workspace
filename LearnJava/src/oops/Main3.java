package oops;

public class Main3 {

	public static void main(String[] args) {
		NonStatic outer= new NonStatic();
		
		NonStatic.sumI obj= outer.new sumI();
		
		obj.show();
		
		StaticClass.def obj2= new StaticClass.def();
		obj2.show();
		
		Outer obj3= new Outer();
		obj3.show();

	}

}
