package liskovSubstitution_Principle;

public class Ebook extends BadCode_book {

	public Ebook(String title) {
		super(title);
	}
	
	@Override
	public void shipBook(){
		throw new UnsupportedOperationException("Ebook is not shippable");
	}

}

class Main3{
	public static void main(String args[]) {
		BadCode_book book= new BadCode_book("James Bond");
		Ebook eBook= new Ebook("Avenges.pdf");
		book.shipBook();
		eBook.shipBook();
	}
}
