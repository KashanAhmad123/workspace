package openForExtensionClosedForModification_Principle;
/* This principle states that “software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification” 
 * which means you should be able to extend a class behavior, without modifying it.*/

class FictionBook  implements BookType{

	@Override
	public int getLoanPeriod() {
		
		return 14;
	}
	
}

class NonFictionBook implements BookType{

	@Override
	public int getLoanPeriod() {
		
		return 22;
	}
	
}

public class GoodLib_code {
	private BookType bookType;
	
	public GoodLib_code(BookType bookType) {
		this.bookType=bookType;
	}
	
	public int getLoanPeriod() {
		return bookType.getLoanPeriod();
	}

}

class Main1{
	public static void main(String args[]) {
		GoodLib_code lab= new GoodLib_code(new FictionBook());
		lab.getLoanPeriod();
		
		class Generals implements BookType{

			@Override
			public int getLoanPeriod() {
				return 18;
			}
		}
		GoodLib_code lab2= new GoodLib_code(new Generals());
		lab2.getLoanPeriod();
	}
}
