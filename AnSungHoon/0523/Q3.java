// 12345
// 54321
// ..
// 12345

public class Q3 {
	public static void main(String[] args) {
		int count = 7; // 줄 수
		for (int j = 0; j <= (count-1); j ++) {
			if (j % 2 == 0) {
				for (int i = 1; i <= 5; i++){
				System.out.printf("(%d)", i);	
				}
			}
			else {
				for (int i = 5; i >= 1; i--){
				System.out.printf("(%d)", i);
				}
			}			
		}		
	}
}