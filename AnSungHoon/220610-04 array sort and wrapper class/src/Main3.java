
public class Main3 {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		
		Integer refNumber = Integer.valueOf(10);
		
		refNumber.compareTo(20); // 원시형으로는 사용 할수가 없어서 박싱을 해서 사용
		// refNumber 와 20 뭐가 더 큰지 비교
		System.out.println(refNumber.compareTo(20));
		
		Integer.max(number1, number2);
		System.out.println(Integer.max(number1, number2));
	}
}
