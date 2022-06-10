import java.util.Arrays;

public class Main3method {
	
	public static int[] copyArray(int[] origin) {
		int[] copy = new int[origin.length];
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];			
			
		}		
		return copy;
	}
	
	public static boolean compare(int[] origin, int[] copy) {
		// return origin == copy;
		// 두 값이 같냐고 묻는게 아니라 같은 대상(참조)을 참조하고 있냐고 묻는식이라 틀림
		
		if (origin.length != copy.length)
			return false;
		
		for (int i = 0; i < origin.length; i++) {
			if (origin[i] != copy[i])
				return false;	
		}
		
		return true;
	}
	
	public static void compare2(int[] origin, int[] copy) {
			
		System.out.println("배열 a 길이 : " + origin.length);
		System.out.println("배열 b 길이 : " + copy.length);
		
		System.out.println("배열 a 값은 ");
		for(int i = 0; i < copy.length; i++ )
			System.out.print(origin[i] + " ");
		
		System.out.println();
		System.out.println("배열 b 값은 ");
		for(int i = 0; i < copy.length; i++ )
			System.out.print(copy[i] + " ");			
	}
	
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)을 알 수 있는 메소드
		
	public static void main(String[] args) {
		int[] test = {50, 70, 80, 110};
		int[] test2 = {50, 70, 90, 110};
		int[] c = copyArray(test);
		boolean b = compare(test, test2);
		
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		System.out.println("a, b 두 배열의 길이와 원소값이 같은가? " + b);
		compare2(test, test2);
		// Arrays.toString 스태틱한 메소드로 배열을 나타내는 메소드
		// 배열의 참조를 전달하면 문자열 상태로 반환을 해준다.
	}
}
