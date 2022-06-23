import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book>{
	private String title;
	private int price;

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		//오브젝츠.해쉬(필드값들을 던져넣으면)
		//알아서 해쉬값들을 줌		
		return Objects.hash(title, price);		
	}
	//객체의 특징을 숫자로 나타낸 것 
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	//implements로 추상 메소드로 구현한다고 했으면 해줘야지	
	@Override
	public int compareTo(Book o) {
		
		return title.compareTo(o.title);
	}

}

public class Main8 {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000);	//각 객체는 해쉬값을 가지는데	
		Book b2 = new Book("책1", 5000);	//다른 해쉬값을 가지고 있음
		Book b3 = new Book("책2", 7000);
		Book b4 = new Book("책3", 4000);
		//1차적으로 hash값을 검사하고 같으면? 
		//2차적으로  equals로 값도 같은지 보자 라고 행동함
		
		//재정의하고 해쉬값을 보면 똑같아짐
		System.out.println(Objects.hash(b1));
		System.out.println(Objects.hash(b2));
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		
		Set<Book> set = new HashSet<>();
		//각 객체마다 가지고 있는 값을 해쉬 값이라고 한다 
		//Hash가 다르면 다르구나 라고 인식함
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		
		System.out.println(set.size());
		System.out.println(set);
		//set들은 해쉬코드를 가지고 비교를 하기 떄문에
		//해쉬코드를 재정의 해줘야 한다
		
		Set<Book> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		tree.add(b4);
		//대소비교를 위한 기준이 없어서 (책 제목?, 가격으로? 기준이 없음)
		Comparator<Book> com = new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};		
		System.out.println("제목순으로 정렬 " + tree);
		
		Set<Book> treeByPrice = new TreeSet<>(com);//()생성자에 알려줌 
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		treeByPrice.add(b4);
		
		System.out.println(treeByPrice);
		
	}
}
