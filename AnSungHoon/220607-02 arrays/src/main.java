
public class main {

	public static void main(String[] args) {
// 하나의 이름으로 여러개를 사용 할 수 있음  ==> 배열
		int[] aBox;	// 정수형 배열 변수 선언.
		// 대괄호 열고 닫고.
		aBox = new int[4];	// 길이가 4인 배열 초기화
		// new는 객체, aBox는 어디서 무엇을(int형 배열,길이가 4인)을 참조하는 변수
		
		System.out.println("배열의 길이값: " + aBox.length); // 참조이름.length - 길이값
		// aBox.length = 10;
		// 초기화때 정해진 배열의 길이값은 변하게 못함 (길이값은 상수임 (final))
		
		aBox[0] = 56;
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		// 배열변수이름[] 여기에 인덱스 번호를 적어줌
		System.out.println("배열의 값: " + aBox[0]);
		System.out.println("배열의 값: " + aBox[1]);
		System.out.println("배열의 값: " + aBox[2]);
		System.out.println("배열의 값: " + aBox[3]);
	}
}
