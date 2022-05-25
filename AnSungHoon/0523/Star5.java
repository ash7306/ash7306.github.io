public class Star5 {
	public static void main(String[] args) {		
		int count = 5; // 줄 수
		for (int j = 1; j <= count; j ++) {
			for (int i = 1; i <= count; i++){
				if (j > i ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			} for (int i = count; i >= 1; i--){
				if (j < i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}