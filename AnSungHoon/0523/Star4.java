public class Star4 {
	public static void main(String[] args) {
		int count = 5; // 줄 수
		for (int j = 0; j <= count-1; j ++) {
			for (int i = count-1; i >= 0; i--){
				if (j < i ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}			
			} for (int i = count-1; i >= 0; i--){
				if (j > i) {
					System.out.print("*");
				}	
			}		
		System.out.println();
		}
	}
}