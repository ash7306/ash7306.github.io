// 2. 전달받은 정수만큼 "안녕"이라는 문자열을 출력하는 메소드.(return type : void)

public class Q2 {
	public static void hi(int count){
		for (int j = 0; j < count; j++) {
			System.out.println("안녕");
		}
	}
	// return 값만 출력을 못할 뿐 문장을 받아서 올 수는 있음
	public static void main(String[] args) {	
		hi(6);
	}
}