package normal;

import java.util.Objects;

public class Book {
	
	//  Encapsulation is done here
	
	private String name;
	private String author;
    private int year;
    private double price;
  // -------------------------------------
    // ----------------------------------------
    // getter & setter
    public Book(String name,String author,int year,double price) {
    	this.name=name;
    	this.author=author;
    	this.price=price;
    	this.year=year;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", year=" + year + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && year == other.year;
	}
	
	
    
    

}
