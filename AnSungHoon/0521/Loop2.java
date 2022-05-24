public class Loop2 {
	public static void main(String[] args) {
		
		int y = 20;
		while (y <= 29) {
			System.out.println(y);
			y++;
		}
		System.out.println("----------------");
		
		int z = 10;
		while (z >= 0) {
			System.out.println(z);
			--z;
		}
		
		int a = 0;
		while (a < 100) {
			System.out.println(a);
			a += 3;
		}
		
		int star = 0;
		while (star < 4) {
			System.out.println("☆");
			System.out.println("★");
			star++;
		}
		System.out.println("----------------");
		
		int star2 = 0;
		while (star2 < 8) {
			System.out.println((star2 % 2 == 0) ? "☆" : "★");
			star2++;		
		}
		
		
	}	
}