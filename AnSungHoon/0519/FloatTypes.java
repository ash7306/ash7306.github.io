public class FloatTypes {
	public static void main(String[] args) {
		float f = 123.456F;//F를 붙여서 float을 정의함 근사값
		double d = 7777.88888;//기본적으로 실수는 double이라고 생각함
		int i = 10000;
		
		//float sum = f + d; 더 큰 double형으로 따라가기 때문에 컴파일 에러
		
		float sum = i + f;		
		//int sum = i + f; 	정수i실수f기 떄문에 실수를 따라감 
		//					같은 32비트 라도 float을 따라감
		
		float one = 0.1F;
		System.out.printf("%.15f\n", one * 22);
		System.out.printf("%010d", 30);
		//%.15f : (.15)소수점15자릿수 만큼 나타내는 서식
		//%10d : 정수10자릿수 만큼 나타냄, 010은 10자릿수 만큼 나타내고 앞에 0하나 붙인다는말 
		// 2.200000047683716
		// 0000000030
				
	}
}	