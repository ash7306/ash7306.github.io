public class LogicalOper {
	public static void main(String[] args){
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		// AND 연산 : 둘다 참이면 참, 그렇지 않으면 거짓
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		// OR 연산 : 둘중 하나만 참이면 참, 모두 거짓이면 거짓이면
		System.out.println(!true);
		System.out.println(!false);
		// NOT 연산 : 참이면 거짓, 거짓이면 참
	}
}