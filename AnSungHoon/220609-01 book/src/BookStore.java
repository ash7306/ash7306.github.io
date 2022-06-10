import java.util.Arrays;

public class BookStore {
	private Book[] books;

	public BookStore() {
	}

	public BookStore(Book... books) {
		this.books = books;
	}

	// name, author, publisher, field, price
	public void printNames() {
		for (int i = 0; i < books.length; i++) {
			System.out.println((i + 1) + "번 책 제목: " + books[i].getName());
		}
	}

	public void printAutor() {
		for (int i = 0; i < books.length; i++) {
			System.out.println((i + 1) + "번 책 저자: " + books[i].getAuthor());
		}
	}

	public void printPublisher() {
		for (int i = 0; i < books.length; i++) {
			System.out.println((i + 1) + "번 책 출판사: " + books[i].getPublisher());
		}
	}

	public void printField() {
		for (int i = 0; i < books.length; i++) {
			System.out.println((i + 1) + "번 책 장르: " + books[i].getField());
		}
	}

	public void printPrice() {
		for (int i = 0; i < books.length; i++) {
			System.out.println((i + 1) + "번 책 장르: " + books[i].getPrice());
		}
	}
}
