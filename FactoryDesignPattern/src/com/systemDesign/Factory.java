package com.systemDesign;

public class Factory {
	public Shapes getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		
		else if(shapeType.equalsIgnoreCase("Rectangel")) {
			return new Rectangel();
		}
		return null;
	}

}
