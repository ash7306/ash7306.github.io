public class Sum {
	public static void main(String[] args){
		// 0 ~ 100 범위의 정수의 합
		int sum = 0;
		for (int i = 0; i <=100; i++) {
			sum += i;
		}//해당하는 값만 상자에 차곡차곡 넣는 느낌
		System.out.println(sum);
		
		// 100 ~ 200 사이의 짝수의 합
		int sum2 = 0;
		for (int i = 100; i <=200; i++) {
			if (i % 2 == 0) {
				sum2 += i;		
			}			
		}
		System.out.println(sum2);
	}
}	