public class TypeConversion {
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4;				//1.0 - 정수와 정수의 계산값
		System.out.println(f);
		
		f = (double) 5 / 4;		//1.25 -> 5.0 / 4 
		System.out.println(f);
		
		f = 5 / (double) 4;		//1.25 -> 5 / 4.0
		System.out.println(f);
		
		f = (double) 5 / (double) 4;	// 1.25 -> 5.0 / 4.0
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8;		// 2 -> 1 + 1 
		System.out.println(i);
		
		i = (int) (1.3 + 1.8);		// 3 -> (int) 3.1 
		System.out.println(i);
	}
}