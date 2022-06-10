import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BookManage {
	private BookStore store;
	
	// name, author, publisher, field, price
	public static Book inputBook(String string, String string2, String string3, String string4, int i) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("책의 제목, 저자, 발행사, 장르, 가격 순으로 입력해주세요.");
		String name = scan.nextLine();
		String author = scan.nextLine();
		String publisher = scan.nextLine();
		String field = scan.nextLine();
		int price = scan.nextInt();
		
		return new Book(name, author, publisher, field, price);
	}
	
	
	public void start() {
		Scanner scan = new Scanner(System.in);
				
		Book[] book = new Book[5];
		book[0] = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600); 
		book[1] = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
		book[2] = new Book("지금 알고 머시기", "류시화", "열림원", "시집", 8100);
		book[3] = new Book("코스모스", "칼 세이건", "사이언스북스", "과학 공학", 16650);
		book[4] = new Book("여행의 이유", "김영하", "문학동네", "에세이", 12150);
				
	
		
		 
		for(int i = 0; i < book.length; i++) {
			int g = book[i].getPrice();
			System.out.println(g);
			for( i = 0; i < book.length; i++) {
				int[] h = {g};				
			}		
		}
				
		System.out.println("메뉴");
		while (true) {
			System.out.println("1.가격순으로(오름차순, 내림차순 선택가능) "
					+ "2.분야 선택해서 해당분야만 보기 6.그만");
			int number = scan.nextInt();
			if (number == 1) {
				System.out.println("1.오름차순, 2.내림차순 ");
				int number2 = scan.nextInt();				
				if (number2 == 1) {
					for(int i = 0; i < book.length; i++) {
						if (book[i].getPrice() > book[i+1].getPrice()) {
							book[i+1] = book[i];
							System.out.println(book[i]);
						} else {
							book[i] = book[i+1];
							System.out.println(book[i+1]);
						}
					}continue;
				} else {						
					for(int i = 0; i < book.length; i++) {
						System.out.println(book[i].getPrice());
					}continue;	
				}
			} else if (number == 2) {
				store.printAutor();
				continue;
			} else if (number == 3) {
				store.printPublisher();
				continue;
			} else if (number == 4) {
				store.printField();
				continue;
			} else if (number == 5) {
				store.printPrice();				
				continue;
			} else {
				System.out.println("프로그램종료");
				break;
			}
		} 	
	}
}
