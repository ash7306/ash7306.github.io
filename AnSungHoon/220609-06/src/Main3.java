import java.util.Arrays;
import java.util.Random;

public class Main3 {
	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[5][5];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);				
			}			
		}
		
		return array;
	}
	
	public static int counts(int[][] array, int target) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
		System.out.println(Arrays.deepToString(randomArray));
		System.out.println(randomArray[0][0]);
		
		// 각 행의 합
		// 각 열의 합		
		// 숫자 7의 개수
		
		int sevenCount; // 7개수
		int n = 0;
		int a = 0;
		int count = 0;
		
		// 행의 합
		for (int i = 0; i < randomArray.length; i++) {
			int rowSum = 0; 
			for (int j = 0; j < randomArray[i].length; j++) {
				rowSum += randomArray[i][j];				
			}
			System.out.println(i + 1 + "행의합: " + rowSum);
		}
		
		// 열의 합
		for (int i = 0; i < randomArray.length; i++) {
			int columnSum = 0;
			for (int j = 0; j < randomArray[i].length; j++) {
				columnSum += randomArray[j][i];								
			}
			System.out.println(i + 1 + "열의합: " + columnSum);
		}
			
		// 7의 개수
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray[i].length; j++) {
				if (randomArray[i][j] == 7) {
					count++;
				}
			} 
		}
		System.out.println("7의 개수" + count);
		System.out.println("7의 개수" + counts(randomArray, 7));
		
		
//		for (int i = 0; i < randomArray.length; i++) {
//			for (int j = 0; j < randomArray[i].length; j++) {
//				columnSum = randomArray[i][j];
//				n += columnSum;
//				System.out.println("열의합: " + n);
//			}					
//		}

	}
}

