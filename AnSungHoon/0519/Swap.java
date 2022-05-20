public class Swap {
	public static void main(String[] args){
		int a = 10;
		int b = 55;
				
		// a = b;	
		// b = a;
		// 55 55 절차적인 수행 때문에 a의 과거 값이 손실됨
		
		int c = a; // a의 값을 임시로 잠시 담아둠
		a = b;
		b = c;
		
		//연산 순서대로 a=10 b=55 c=10 값을 가지고 있다가 b에 c(10)을 집어넣음
		System.out.println(a);
		System.out.println(b);
		
	}
}