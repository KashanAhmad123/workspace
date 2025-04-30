package com.systemDesign;

public class Main {
	public static void main(String args[]) {
		Factory factory= new Factory();
		
		Shapes circle=factory.getShape("CIRCLE");
		if(circle!=null) {
			circle.draw();
		}
		
		Shapes rectangle= factory.getShape("RECTANGLE");
		
		if(rectangle!=null) {
			rectangle.draw();
		}
		
	}

}
