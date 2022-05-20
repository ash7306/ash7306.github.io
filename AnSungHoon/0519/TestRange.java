public class TestRange {
	public static void main(String[] args) {
		// 0 ~ 100 사이??
		int number = 31;
		
		//System.out.println(0 <= number <= 100);
		//java 언어는 한번에 하나씩 밖에 물어보지 못함
		//((0 <= number) <= 100)(true <= 100)		
				
		//System.out.println(0 <= number);	
		//System.out.println(number <= 100); 값이 두번 
		
		//논리연산자 사용		
		System.out.println(0 <= number && number <= 100);
	}
}