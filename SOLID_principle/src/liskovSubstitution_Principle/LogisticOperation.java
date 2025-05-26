package liskovSubstitution_Principle;
/*This principle is the first principle that applies to Interfaces instead of classes in SOLID and it is similar to the single responsibility principle. 
 * It states that “do not force any client to implement an interface which is irrelevant to them“ */

public interface LogisticOperation {

	void process();
}

class PhysicalBook implements LogisticOperation{
	
	private String title;
	
	public PhysicalBook(String title) {
		this.title=title;
	}

	@Override
	public void process() {
		System.out.println("Shipping Book:" +title);
	}
	
}

class Eebook implements LogisticOperation{

	private String title;
	
	public Eebook(String title) {
		this.title=title;
	}
	
	@Override
	public void process() {
		System.out.println("Downloading book :" +title);
		
	}
	
}

class Main{
	public static void main(String args[]){
		
		PhysicalBook book= new PhysicalBook("Merchant Sea");
		Eebook eb= new Eebook("Sail.pdf");
		book.process();
		eb.process();
	}
}

