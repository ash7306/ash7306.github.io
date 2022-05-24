public class Loop3 {
	public static void main(String[] args) {
		// 0~100사이 3의 배수 또는 7의 배수
		int i = 0;
		while (i <= 100) {
			if (i % 3 ==0 || i % 7 == 0) {
				System.out.println(i);
			}
			i++;	
		}
		// 0~100사이 일의 자리 수가 3, 6, 9 일때만 출력.
		int a = 0;
		while (a <= 100) {
			if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9) {
				System.out.println(a);
			}
			a++;
		}
				System.out.println(3%10);
				System.out.println(3/10);
	}
}