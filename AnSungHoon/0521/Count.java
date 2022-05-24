public class Count {
	public static void main(String[] args){
		// 300 ~ 400 사이의 정수 중
		// 13의 배수를 찾아
		// 몇 개가 있는지 출력하기
		int count = 0;
		for (int i = 300; i <= 400; i++) {
			if (i % 13 == 0) {
				// 개수를 세야함
				System.out.println(i);			
				count++;
				// 카운트를 줘서 개수 세기!!하세기!!
			}
		}
		System.out.println("개수는: " + count);
	}
}