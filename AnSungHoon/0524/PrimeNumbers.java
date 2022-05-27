// 중첩 반복문

public class PrimeNumbers {
	public static boolean isPrime(int i) {
		int count = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {			
				count++;
			}	// 1과 본인으로 나눴을 때만 나머지가 0인 수가 소수임으로
				// 카운트 2 만 된다.
				// 소수면 트루를 출력, 아니면 펄스를 출력
		} if (count == 2) {
			return true;
		} else {
			return false;
		}
		// boolean문은 true와 flase로 return값으로 둘 다 꼭 필요함!
	}
	
	public static void main(String[] args) {
		for (int i = 2; i <1000; i++) {	// 2 ~ 1000
			boolean result = isPrime(i);	// 소순지 알아볼거다. 참, 거짓
			if (result)						// 참이면
				System.out.println(i);		// 출력
		}
	}
}