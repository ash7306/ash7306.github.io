// 책 클래스 (class Book)
// 필드(상태) : 제목(title), 저자(author)
// 메소드(기능) : 제목과 저자를 콘솔에 출력(printAll)

class Book {
	String title;
	String author;
	
	void printAll() {
		System.out.print("제목: " + title +"\n저자: " + author);
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.title = "가나다라";
		myBook.author = "마바사";
		myBook.printAll();		
	}
}
