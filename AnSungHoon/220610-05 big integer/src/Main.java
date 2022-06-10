import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		BigInteger value1 = BigInteger.valueOf(Long.MAX_VALUE + Long.MAX_VALUE);
		
		
		BigInteger value2 = new BigInteger("9223372036854775808");
		
		System.out.println(value2);
//		System.out.println(value2 + 5); 안됨
		System.out.println(value2.add(new BigInteger("10")));
		System.out.println(value2);
		// 자신의 상태값을 반환한거라 값이 변하지 않음
		
//		double float 실수
		
		// BigDecimal 클래스 실수를 문자화 시켜줌
		// 정확한 소수점 값을 사용할 수 있다
		BigDecimal dec = new BigDecimal("0.123456789");
		System.out.println(dec);

		BigDecimal d = new BigDecimal(0.1);
		BigDecimal d2 = new BigDecimal("0.1");
		System.out.println(d);
		// 0.1자체가 부정확한 값이라서 부정확한 실수 개체로 나온다
		System.out.println(d2);
		
	}

}
