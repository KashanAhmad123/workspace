package SingleResponsibiltyPrinciple;

public class BadBook_code {
	private String author;
	private String bookName;
	private String text;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public void print() {
		System.out.println(text);
	}

}
