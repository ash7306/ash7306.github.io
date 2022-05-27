// 영화
// 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

// 위의 클래스를 테스트 할 수 있는 main메소드를 포함하는 클래스를 작성하고
// 인스턴스화 하여, 필드값을 대입연산 후 출력메소드를 호출하여 콘솔에서 값 확인

class Movie {
	String title;
	double grade;
	String director;
	int yearPublish;
	
	void printAll() {
		System.out.println("제목: " + title + "\n평점: " + grade + "\n감독: " + director + "\n발표연도: " + yearPublish + "년");
	}
}
public class MovieTest {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.title = "범죄도시2";
		movie.grade = 4.5;
		movie.director = "이상용";
		movie.yearPublish = 2022;
		movie.printAll();
	}
}