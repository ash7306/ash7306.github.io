package programing;

public class Magazine extends Book {
	protected int releaseDate;
	
	public Magazine(String title, int pageNumbers, String author, int releaseDate) {
		super(title, pageNumbers, author);
		this.releaseDate = releaseDate;
	}
	
	public String toString() {
		return title + pageNumbers + author + releaseDate;
	}
	
	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public static void main(String[] args) {
		Magazine mag = new Magazine("월간", 150, "김독자", 20220613);
		
		System.out.println(mag.toString());
		
		// 출간일은 출력 안됨
		// 객체라는 친구들은 다양한 형태를 가진다
		// 매거진은 책처럼 행동 가능함 (자식은 부모처럼 행동가능)
		// 형변환이 일어남.(매거진에서 북으로 형이 바뀜 )
		// 상향형변환 (ex double을 int값으로 변환)
		
		Book book = new Magazine("월간", 150, "김독자", 20220613);
		System.out.println(book.getTitle());
		System.out.println(book.getPageNumbers());
		System.out.println(book.getAuther());
		// Book의 행동만
		
		// 하향형변환
		Magazine m = (Magazine)book;
		System.out.println(m.getReleaseDate());
		// Magazine 행동
		
		Book b = new Book("그냥책", 50 , "작가");
		Magazine ma = (Magazine) b;
		// 다운 캐스팅 할떄는 인스턴스가 잡지가 맞는지 부터 확인하고 해야함
		// b가 잡지
		if (b instanceof Magazine) {
			Magazine m2 = (Magazine) b;			
		}
		// 우측의 인스턴스를 확인하고 내가 원하는 형으로 변환해야함
		// 다형성 이라고 함
	}
}
