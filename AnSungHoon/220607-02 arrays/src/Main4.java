
public class Main4 {
	// 스태틱하니까 클래스이름으로 바로
	// 클래스 안에 적었으니까 
	static void printArray(char[] array) {
		for(int i = 0; i < array.length; i++) {
		System.out.print(array[i]);
		}
	}
	
	// 캐릭터 배열의 전달받아서 문자열로 반환
	static String toString(char[] array2) {
		String str = "";
		for (int i = 0; i < array2.length; i++) {
			str += array2[i];
		}
		return str;
	}
	
	// 캐릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 반환하는 메소드
	static int whereis(char[] target, char c) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
				return i;
			}
		}
		return -1;	
	}	
	
	public static void main(String[] args) {
		char[] hello = { 'H', 'e', 'l', 'l', 'o' };
		// 위의 문자 배열에 o 문자에 해당하는 인덱스를 찾아보세요~
		for(int i = 0; i < hello.length; i++) {
			if (hello[i] == 'o') {
			System.out.println("찾았다: " + i);			
			}
		}
		char c;
		printArray(hello);
		// Main4.printArray(hello); 같은 클래스 안이니까
		// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
		String result = toString(hello);
		System.out.println(result);
	
	}
}
