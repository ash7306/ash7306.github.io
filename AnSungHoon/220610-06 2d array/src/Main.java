import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 3, 6, 9, 12, 15 };
		int[] arr3 = { 4, 8, 12, 16, 20 };
		
		// 배열을 가지는 배열 2차원 배열
		int[][] arr2d = new int[3][5];
		// 5행 3열
		// 2차원 배열은 표처럼 생김
		// 길이가 각각 다른배열들은 2차원 배열이 될 수 없다.
		arr2d[0] = arr1;
		arr2d[1] = arr2;
		arr2d[2] = arr3;
				
//		System.out.println(arr2d[0][0]);
//		System.out.println(arr2d[0][1]);
//		System.out.println(arr2d[0][2]);
//		System.out.println(arr2d[1][0]);
//		System.out.println(arr2d[1][1]);
//		System.out.println(arr2d[1][2]);
//		System.out.println(arr2d[2][0]);
//		System.out.println(arr2d[2][1]);
//		System.out.println(arr2d[2][2]);
		
		System.out.println("----------------------");
		for (int i = 0; i < arr2d[0].length; i++)
			System.out.println(arr2d[0][i]);
			// 세개만 나옴 즉 arr[x][y] ==> length는 2차원 배열의 [x], 줄수를 말함
		
		System.out.println("----------------------");
				
		int[][] arrAnother = { { 2, 4, 6}, { 3, 6, 9 }, { 4, 8, 12 } };
		for (int j = 0; j < arrAnother.length; j++)
			for (int i = 0; i < arrAnother[j].length; i++)
				System.out.println(arrAnother[j][i]);
		
				
	}	
}
