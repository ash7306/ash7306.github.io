public class MulDiv {
    public static void main(String[] args) {
		/*
		System.out.println("ABC " * 5); 	문자열과 정수를 나눌 수 없음
		System.out.println(50 / 0 );		결과값이 나올 수 없음
		나올수 없는 값이라 프로그램 자체가 종료됨
		*/

		System.out.println("10 곱하기 5는 " + 10 * 5);
		System.out.println("22 나누기 4는 " + (22 / 4));	//정수연산은 정수값만		
		System.out.println("22 나누기 4는 " + (22.0 / 4.0)); //소수점 값을 얻고 싶다면 실수로
		System.out.println("프로그램 정상 종료");
    }
}