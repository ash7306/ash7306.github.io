// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드 (기능) : "2022-05-27"의 형태나 "05/27/22"
// 같은 값을 다양한 서식으로 출력하기

class Date {
	int year;
	int month;
	int day;
	
	void printA() {
		System.out.println("20" + year + "-" + "0" + month + "-" + day);
	}
	
	void printB() {
		System.out.println("0" + month + "/" + day + "/" + year);
	}
}
public class TodaysDate {
	public static void main(String[] args) {
	Date date = new Date();
	date.year = 22;
	date.month = 05;
	date.day = 27;
	date.printA();
	date.printB();
	}
}	
