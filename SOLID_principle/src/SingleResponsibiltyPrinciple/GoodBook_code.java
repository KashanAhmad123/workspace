package SingleResponsibiltyPrinciple;

public class GoodBook_code implements Printable {  /* We can see print method which we have taken as cause for change is now handle 
properly by creating a new class of printer which will print content */
	private String author;
	private String name;
	private String text;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String getContent() {
		return text;
		
	}

}

