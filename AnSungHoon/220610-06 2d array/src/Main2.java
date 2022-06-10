import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		// 2 ~ 5 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 32
		// 3 6
		// 4 16	
		// 5 25
		
		int[] arr1 = { 2, 4, 8, 16, 32 };
		int[] arr2 = { 3, 9, 27, 81, 243 };
		int[] arr3 = { 4, 8, 12, 16, 20 };
		int[] arr4 = { 5, 8, 12, 16, 20 };
		
		
		int[][] arr2d = new int[4][5];
				
		arr2d[0] = arr1;
		arr2d[1] = arr2;
		arr2d[2] = arr3;
		arr2d[3] = arr4;
				
//		for (int j = 0; j < arr2d.length; j++)
//			for (int i = 0; i < arr2d[j].length; i++)
//				if (arr2d[j][i] % 1 == 0) {
//					System.out.println(arr2d[j][i]);
//				}
//		
		int[][] arr3d = new int[4][5];
		
		for (int i = 0; i < arr3d.length; i++) {
			int n = 1;
			for (int j = 0; j < arr3d[i].length; j++) {
				n *= 2 + i;
				arr3d[i][j] = n;
				System.out.println(n);
			}			
		}
		
		System.out.println(Arrays.deepToString(arr2d));
		System.out.println(Arrays.deepToString(arr3d));
		
		System.out.println(Arrays.equals(arr2d,arr3d));
		// 1차원 배열일 때 사용
		System.out.println(Arrays.deepEquals(arr2d,arr3d));
		// 다차원 배열일 때 사용
				
	}	
}
