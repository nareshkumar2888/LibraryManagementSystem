
public class Book {

	private String bookName;
	private String authorName;
	private double price;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  bookName + "\t\t" + authorName + "\t\t" + price ;
	}
	public Book(String bookName, String authorName, double price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	
	
	
}
