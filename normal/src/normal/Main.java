package normal;

public class Main {
	
	public static void main(String args[]) {
		String libraryName="MYLAB";
		
		library Library=new library();
		int bookcount=0;
		boolean Isopen=true;
		
		try {
			Book book1 = new Book("Titanic","Ruth Len",2000,200.00);
			Book book2= new Book("Life of Pie","Naplolier Suski",2003,300.00);
			Book book3= new Book("Titanic","Ruth Len",2000,200.00);
			
			Library.addNewBook(book1);
			Library.addNewBook(book2);
			Library.addNewBook(book3);
			
			Library.toShowBook();
			
			bookcount=3;
			
			String name= "Titanic";
			
			Book foundInfo= Library.getBookbyname(name);
			
			if(foundInfo!=null) {
			System.out.println("Book Found with name" +foundInfo);
		}
			else {
				System.out.println("Book With Title:"+name+"not found");
			}
			
			double totalprice=Library.costOfBooks();
			
			System.out.println("Net cost $" +totalprice);
			
			System.out.println("Book1 & Book3 are same name:"+book1.equals(book3));
			System.out.println("Hashcode of Book1:"+ book1.hashCode());
			System.out.println("Hashcode of Book1:"+ book2.hashCode());
			
			if(bookcount>10) {
				throw new Exception("Too many book");
			}
			
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
		finally {
			System.out.print(libraryName+"is"+(Isopen?"Open":"Closed"));
			
		}

}
}
