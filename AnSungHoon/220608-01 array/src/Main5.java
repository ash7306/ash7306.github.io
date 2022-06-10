import java.util.Arrays;

public class Main5 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		int[] arr2 = {40, 50, 60};
		int[] copy = Arrays.copyOf(arr, 3);
		int[] copy2 = Arrays.copyOf(arr, 6);
		// (배열, 배열의 칸)
		
		int[] another = Arrays.copyOfRange(arr, 0, 2);
										// arr 배열 0번째에서 순서대로 2개 값
		
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(arr, copy));
		// eauals : 왼쪽 과 오른쪽의 길이와 값이 같으면 true
		
		System.out.println(Arrays.toString(another));
	}

}
