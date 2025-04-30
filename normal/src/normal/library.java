package normal;

import java.util.ArrayList;

public class library {
	
	ArrayList<Book> books;
	
	library(){
		 books=new ArrayList<>();
	}
	
	public void addNewBook(Book book) {
		books.add(book);
		System.out.println("Book Added:" +book.toString());
	}
	
	public void toShowBook() {
		if(books.isEmpty()) {
			System.out.println("No book added to library");
		}
		else {
			System.out.println("Books are in Library");
			for(int i=0;i<books.size();i++) {
				System.out.println((i+1)+" . " + books.get(i));
			}
		}
		
	}
	
	public Book getBookbyname(String name){
	
	for(Book book: books) {
		String booktitle= book.getName();
		
		if(booktitle!=null && booktitle.equalsIgnoreCase(name)){
		return book;
		}
	}
	return null;
	
	}
	
	public double costOfBooks() {
		double total = 0.0;
		for(Book book:books) {
			total+=book.getPrice();
		}
		return total;
	}
	
	
}
