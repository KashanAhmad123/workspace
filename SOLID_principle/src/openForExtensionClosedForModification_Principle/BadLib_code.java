package openForExtensionClosedForModification_Principle;

/* This code not extensionable because if the book type is General then we have to change in getLoanPeriod() method 
 * which is not consider as good approah try to handle such situations using interface or extending of parent class most 
 * preferred is by interface */

public class BadLib_code {
	
	private String bookType;
	
	public BadLib_code(String bookType) {
		this.bookType=bookType;
	}
	
	public int getLoanPeriod() {
		if(bookType.equals("Fictional")){
			return 14;
		}
		else if(bookType.equals("Non_Fictional")) {
			return 22;
		}
		else {
			return 20;
		}
	}
	
}

class Main{
	public static void main(String args[]) {
		
		BadLib_code lab= new BadLib_code("Fiction");
		System.out.println(lab.getLoanPeriod());
		
	}
}
