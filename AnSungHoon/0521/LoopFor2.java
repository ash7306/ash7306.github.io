public class LoopFor2 {
	public static void main(String[] args){
		// 10부터 99까지 첫번째 자릿수와 두번째 자릿수의 합이 '7'인 수 출력
		for (int i = 10; i <= 99; i++) {
			int left = i / 10;
			int right = i % 10;
			if (left + right == 7) {
				System.out.println(i);	
			}			
		}			
	}
}