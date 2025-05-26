package liskovSubstitution_Principle;

public class BadCode_book {
	
	protected String title;
	
	public BadCode_book(String title) {
		this.title=title;
	}
	
	public void shipBook() {
		System.out.println("Shipping :" +title);
	}

}

