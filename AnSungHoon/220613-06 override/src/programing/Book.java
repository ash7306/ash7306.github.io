package programing;

public class Book {
	protected String title;
	protected int pageNumbers;
	protected String author;
	
	public Book(String title, int pageNumbers, String auther) {		
		this.title = title;
		this.pageNumbers = pageNumbers;
		this.author = auther;
	}

	public String getTitle() {
		return title;
	}
	
	public int getPageNumbers() {
		return pageNumbers;
	}

	public String getAuther() {
		return author;
	}
	
	
}
