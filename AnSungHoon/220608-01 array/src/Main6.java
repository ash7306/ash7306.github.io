
public class Main6 {
	// 배열을 전달 받을 수 있다			 = int[] arr
	public static void someMethod(double d, int ... arr) {
	// 왼쪽의 배열의 형태를 전달받고 쉼표로 여러개 구별해서 전달 받을 수 있다.
	// 파라미터에 규칙이 있다. (...)은 제일 마지막에 들어가야 컴파일 에러가 없음
		for (int number : arr) {
			System.out.println(number);
		}
	}
	
	public static int sum(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
		
		
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };		
		
		int result = sum(10, 20, 30, 40, 50, 60, 70);
		System.out.println(result);
		
		
				
		// someMethod(new int[] { 20, 30, 40, 50, 60 });
		System.out.println("----");
		someMethod(40, 50, 60, 70, 80);
		// ... 으로 쓰면 파라미터를 간단하게 사용 가능
		
		// : arr - (포이치문) 콜론(:)을 기준으로 오른쪽에는 여러개를 담을 수 있는 객체 하나(ex 배열)
				// 순서대로 하나씩 끄집어 낸다
				// arr의 10을 꺼내서 number라 이름붙이고 다음 20부터 마지막 값까지 반복
		//	for (int number : arr) {
		//	System.out.println(number);
		//	}					 
		//	someMethod(arr);
		
		// 단점은 인덱스 처럼 하나 하나 꺼내서 보지는 못함
		// 방향을 바꿀 수 없음
		// 값을 수정하는 작업은 떼놓고 생각해야함.
		// 즉 값을 확인하는 용도로 쓰임
		}
		
	}

